package com.demo.service.impl;

import com.demo.mapper.claimsMapper;
import com.demo.pojo.*;
import com.demo.service.claimsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

@Service
public class claimsServiceImpl implements claimsService {
    @Autowired(required = false)
    claimsMapper mapper;

    public List<Claims> getClaims() {
        List<Claims> list=new ArrayList<Claims>();
        List<Adjustment_info> adjustmentInfoList=mapper.getAdjustmentsList();
        for (Adjustment_info adj:adjustmentInfoList) {
            Claims claim=new Claims();
            claim.setAdjustmentId(adj.getAdjustmentId());
            Verify_loss_info verify=mapper.getVerifyByClaimMainId(adj.getClaimMainId());
            claim.setIsVerify(verify.getVerifyLossOpinion());
            Claim_main_info claimMain=mapper.getClaimMainByiClaimMainId(adj.getClaimMainId());
            claim.setWarrantyId(claimMain.getWarrantyId());
            Survey_loss_info survey=mapper.getSurveyByClaimMainId(adj.getClaimMainId());
            claim.setCarframeId(survey.getCarframeId());
            Warranty_info warranty=mapper.getWarranty(claimMain.getWarrantyId());
            Recognizee_info recognizee=mapper.getRecognizee(warranty.getRecognizeeId());
            claim.setReceiver(recognizee.getRecognizeeName());
            claim.setSettlementTotal(adj.getPrepayMoney());
            claim.setSignDate(claimMain.getFilingTime());
            claim.setCloseCaseTime(claimMain.getCloseCaseTime());
            claim.setClaimStatus(claimMain.getClaimStatus());
            list.add(claim);
        }
        return list;
    }

    public List<Claim_main_info> getClaimMains() {
        return mapper.getClaimMains();
    }

    public Audit getAudits(String claimMainId) {
        Audit audit=new Audit();
        PersonalLoss personalLoss=new PersonalLoss();
        OthersLoss othersLoss=new OthersLoss();
        //获取三者损失总额
        audit.setTrdPartyLiability(0);
        //获取车损信息
        audit.setCarDamage(mapper.getCarDamage(claimMainId));
        audit.setCartotals(0);
        for (Car_damage_info carDamage:audit.getCarDamage()) {
            if(carDamage.getIsTrdPartyLiability().equals("否")){
                audit.setCartotals(audit.getCartotals()+carDamage.getLossTotal());
            }else {
                audit.setTrdPartyLiability(audit.getTrdPartyLiability()+carDamage.getLossTotal());
            }
        }
        //获取物损信息
        audit.setObjDamage(mapper.getObjDamage(claimMainId));
        audit.setObjtotals(0);
        for (Object_damage_info objDamage:audit.getObjDamage()) {
            if(objDamage.getIsTrdPartyLiability().equals("否")) {
                audit.setObjtotals(audit.getObjtotals() + objDamage.getLossTotal());
            }else {
                audit.setTrdPartyLiability(audit.getTrdPartyLiability()+objDamage.getLossTotal());
            }
        }
        //获取人伤信息
        audit.setHumanDamage(mapper.getHumanDamage(claimMainId));
        audit.setHumantotals(0);
        for (Human_injury_info humDamage:audit.getHumanDamage()) {
            if(humDamage.getIsTrdPartyLiability().equals("否")) {
                audit.setHumantotals(audit.getHumantotals() + humDamage.getLossTotal());
            }else {
                audit.setTrdPartyLiability(audit.getTrdPartyLiability()+humDamage.getLossTotal());
            }
        }
        //计算个人损失赔偿信息
        Double ratio=mapper.getSurveyByClaimMainId(claimMainId).getDutyRatio();//责任比率
        double personFch=0;//个人损失责任免赔率
        if(ratio>=100){//全责 20%
            personFch=20;
        }else if (ratio<100&&ratio>50){//主要责任 15%
            personFch=15;
        }else if (ratio==50){//同等责任 10%
            personFch=10;
        }else if (ratio<50&&ratio>0){//次要责任 5%
            personFch=5;
        }else {//无责 0%
            personFch=0;
        }
        double deductibles=0;//个人绝对免赔率
        double otherdecuctibles=0;//三者绝对免赔率
        double personLimit=0;//个人损失赔偿限额
        double othersLimit=0;//三者损失赔偿限额
        Risk_type_amount_info personRisk=mapper.getIsSuredStateByClaimMainId(claimMainId,"车辆损失险");//查看车损险是否不计免赔
        Risk_type_amount_info othersRisk=mapper.getIsSuredStateByClaimMainId(claimMainId,"第三者责任险");
        if(personRisk==null){//未买该保险 100%
            deductibles=100;
        }else if(personRisk.getInsuredState()>0){//不计免赔 0%
            personLimit=personRisk.getInsuredAmount();
            deductibles=0;
        }else {//未购买不计免赔 20%
            personLimit=personRisk.getInsuredAmount();
            deductibles=20;
        }
        if(othersRisk==null){//未买该保险 100%
            otherdecuctibles=100;
        }else if (othersRisk.getInsuredState()>0){//不计免赔 0%
            othersLimit=othersRisk.getInsuredAmount();
            otherdecuctibles=0;
        }else {//未购买不计免赔 20%
            othersLimit=othersRisk.getInsuredAmount();
            otherdecuctibles=20;
        }
        double personShouldMoney=(audit.getCartotals()+audit.getObjtotals()+audit.getHumantotals())*((100-personFch)*0.01)*((100-deductibles)*0.01);//个人损失应赔付金额
        if (personShouldMoney>personLimit) {
            personShouldMoney = personLimit;
        }
        double othersShouldMoney=audit.getTrdPartyLiability()*((100-otherdecuctibles)*0.01);//三者损失应赔金额
        if (othersShouldMoney>othersLimit){
            othersShouldMoney=othersLimit;
        }
        audit.setShouldMoney(personShouldMoney+othersShouldMoney);
        //个人损失详情
        PersonalLoss personalLoss1=new PersonalLoss(audit.getCartotals()+audit.getObjtotals()+audit.getHumantotals(),personFch,deductibles,personLimit,personShouldMoney);
        OthersLoss othersLoss1=new OthersLoss(audit.getTrdPartyLiability(),otherdecuctibles,othersLimit,othersShouldMoney);
        audit.setPersonalLoss(personalLoss1);
        audit.setOthersLoss(othersLoss1);
        //查询 理算基本信息表 查看该对象是否存在
        Adjustment_info adjustmentInfo=mapper.getAdjustMentByClaimMainId(claimMainId);
        //如果对象存在则获取已支付赔款
        if(adjustmentInfo!=null&&adjustmentInfo.getPrepayMoney()>=0){
            audit.setTplMoney(adjustmentInfo.getPrepayMoney());
        }else{
            //如果没有这个对象，则创建理算表
            Adjustment_info adjustment_info=new Adjustment_info();
            int ai1=Integer.parseInt(mapper.getAdjustmentsList().get(mapper.getAdjustmentsList().size()-1).getAdjustmentId().substring(1))+1;
            adjustment_info.setAdjustmentId("a"+ai1);
            adjustment_info.setClaimMainId(claimMainId);
            adjustment_info.setAccidentLiabilityRatio(mapper.getSurveyByClaimMainId(claimMainId).getDutyRatio());
            adjustment_info.setCarFeeTotal(audit.getCartotals());
            adjustment_info.setMaterialFeeTotal(audit.getObjtotals());
            adjustment_info.setPeopleFeeTotal(audit.getHumantotals());
            adjustment_info.setTrdPartyLiability(audit.getTrdPartyLiability());
            adjustment_info.setSettlementTotal(audit.getCartotals()+audit.getObjtotals()+audit.getHumantotals()+audit.getTrdPartyLiability());
            adjustment_info.setShouldMoney(audit.getShouldMoney());
            adjustment_info.setPrepayMoney(0);
            adjustment_info.setAdjustmentOpinion("");
            mapper.addAdjustmentInfo(adjustment_info);
            audit.setTplMoney(0);
            //添加理算详情表信息
            int bi1=Integer.parseInt(mapper.getAdjustmentDetailList().get(mapper.getAdjustmentDetailList().size()-1).getAdjustmentId().substring(1))+2;
            String adjustmentDetailId1="ad"+bi1;
            mapper.addAdjustmentDetail(adjustmentDetailId1,mapper.getAdjustMentByClaimMainId(claimMainId).getAdjustmentId(),0,audit.getPersonalLoss().getLossMoney(),personLimit,personFch,deductibles,personShouldMoney);
            String adjustmentDetailId2="ad"+(Integer.parseInt(mapper.getAdjustmentDetailList().get(mapper.getAdjustmentDetailList().size()-1).getAdjustmentId().substring(1))+2);
            mapper.addAdjustmentDetail(adjustmentDetailId2,mapper.getAdjustMentByClaimMainId(claimMainId).getAdjustmentId(),1,audit.getOthersLoss().getLossMoney(),othersLimit,0,otherdecuctibles,othersShouldMoney);
        }
        return audit;
    }

    public String statusClaim(String claimMainId) {
        int num=mapper.statusClaim(claimMainId);
        String rb="审核失败！";
        if (num>0){
            rb="审核通过！";
        }
        return rb;
    }

    public List<Warranty_info> getWarranty(String warrantyId) {
        List<Warranty_info> list=new ArrayList<Warranty_info>();
        Warranty_info warrantyInfo=mapper.getWarranty(warrantyId);
        warrantyInfo.setPolicyholdersName(mapper.getPolicyholders(warrantyInfo.getPolicyholdersId()).getPolicyholdersName());
        warrantyInfo.setRecognizeeName(mapper.getRecognizee(warrantyInfo.getRecognizeeId()).getRecognizeeName());
        list.add(warrantyInfo);
        return list;
    }

    public String payMoney(String claimMainId, double payMoneys, String opinion) {
        int row=mapper.payMoney(claimMainId,payMoneys,opinion);
        if (row > 0) {
            mapper.updClaimMain(claimMainId);
        }
        return row>0?"支付成功":"支付失败！！";
    }
}
