package com.demo.service.impl;

import com.demo.mapper.claimsMapper;
import com.demo.pojo.*;
import com.demo.service.claimsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class claimsServiceImpl implements claimsService {
    @Autowired
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
            claim.setSettlementTotal(adj.getPrepayMoney()+adj.getPrepayLossMoney());
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
        audit.setCarDamage(mapper.getCarDamage(claimMainId));
        audit.setCartotals(0);
        for (Car_damage_info carDamage:audit.getCarDamage()) {
            audit.setCartotals(audit.getCartotals()+carDamage.getLossTotal());
        }
        audit.setObjDamage(mapper.getObjDamage(claimMainId));
        audit.setObjtotals(0);
        for (Object_damage_info objDamage:audit.getObjDamage()) {
            audit.setObjtotals(audit.getObjtotals()+objDamage.getLossTotal());
        }
        audit.setHumanDamage(mapper.getHumanDamage(claimMainId));
        audit.setHumantotals(0);
        for (Human_injury_info humDamage:audit.getHumanDamage()) {
            audit.setHumantotals(audit.getHumantotals()+humDamage.getLossTotal());
        }
        return audit;
    }
}
