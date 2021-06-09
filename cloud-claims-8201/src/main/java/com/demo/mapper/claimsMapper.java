package com.demo.mapper;

import com.demo.pojo.*;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface claimsMapper {

    @Select("select * from adjustment_info")
    List<Adjustment_info> getAdjustmentsList();

    @Select("select * from verify_loss_info where claimMainId=#{claimMainId}")
    Verify_loss_info getVerifyByClaimMainId(@Param("claimMainId") String claimMainId);

    @Select("select * from claim_main_info where claimMainId=#{claimMainId}")
    Claim_main_info getClaimMainByiClaimMainId(@Param("claimMainId") String claimMainId);

    @Select("select * from survey_loss_info where claimMainId=#{claimMainId}")
    Survey_loss_info getSurveyByClaimMainId(@Param("claimMainId") String claimMainId);

    @Select("select * from warranty_info where warrantyId=#{warrantyId}")
    Warranty_info getWarranty(@Param("warrantyId") String warrantyId);

    @Select("select * from recognizee_info where recognizeeId=#{recognizeeId}")
    Recognizee_info getRecognizee(@Param("recognizeeId") int recognizeeId);

    @Select("select * from claim_main_info")
    List<Claim_main_info> getClaimMains();

    @Select("select * from car_damage_info where claimMainId=#{claimMainId} and cardamagestatus='已通过'")
    List<Car_damage_info> getCarDamage(@Param("claimMainId") String claimMainId);

    @Select("select * from object_damage_info where claimMainId=#{claimMainId} and objectDamagestatus='已通过'")
    List<Object_damage_info> getObjDamage(@Param("claimMainId") String claimMainId);

    @Select("select * from human_injury_info where claimMainId=#{claimMainId} and humaninjurystatus='已通过'")
    List<Human_injury_info> getHumanDamage(@Param("claimMainId") String claimMainId);

    @Update("UPDATE claim_main_info set claimStatus='待赔付' WHERE claimMainId=#{claimMainId}")
    int statusClaim(@Param("claimMainId") String claimMainId);

    @Select("select * from policyholders_info where policyholdersId=#{policyholdersId}")
    Policyholders_info getPolicyholders(@Param("policyholdersId") int policyholdersId);

    @Select("select * from adjustment_info where claimMainId=#{claimMainId}")
    Adjustment_info getAdjustMentByClaimMainId(@Param("claimMainId") String claimMainId);

    @Insert("INSERT INTO adjustment_info VALUES (#{adjustment_info.adjustmentId},#{adjustment_info.claimMainId},#{adjustment_info.accidentLiabilityRatio},#{adjustment_info.carFeeTotal},#{adjustment_info.materialFeeTotal},#{adjustment_info.peopleFeeTotal},#{adjustment_info.trdPartyLiability},#{adjustment_info.settlementTotal},#{adjustment_info.shouldMoney},#{adjustment_info.prepayMoney},#{adjustment_info.adjustmentOpinion})")
    int addAdjustmentInfo(@Param("adjustment_info") Adjustment_info adjustment_info);

    @Select("select * from risk_type_amount_info where warrantyId=(select warrantyId from claim_main_info where claimMainId=#{claimMainId}) and insured_amount=#{insured_amount}")
    Risk_type_amount_info getIsSuredStateByClaimMainId(@Param("claimMainId") String claimMainId,@Param("insured_amount") String insured_amount);

    @Select("select * from AdjustmentDetail")
    List<AdjustmentDetail> getAdjustmentDetailList();

    @Insert("INSERT INTO AdjustmentDetail VALUES (#{adjustmentDetailId},#{adjustmentId},#{riskType},#{lossMoney},#{insuranceMax},#{accidentLiabilityExcess},#{absolutelyFranchise},#{actualPay})")
    int addAdjustmentDetail(@Param("adjustmentDetailId") String adjustmentDetailId,@Param("adjustmentId") String adjustmentId,@Param("riskType") int riskType,@Param("lossMoney") double lossMoney,@Param("insuranceMax") double insuranceMax,@Param("accidentLiabilityExcess") double accidentLiabilityExcess,@Param("absolutelyFranchise") double absolutelyFranchise,@Param("actualPay") double actualPay);

    @Update("UPDATE adjustment_info SET prepayMoney=prepayMoney+#{payMoneys}, adjustmentOpinion=#{opinion} WHERE claimMainId=#{claimMainId}")
    int payMoney(@Param("claimMainId") String claimMainId,@Param("payMoneys") double payMoneys,@Param("opinion") String opinion);

    @Update("UPDATE claim_main_info SET claimStatus='已赔付' WHERE claimMainId=#{claimMainId}")
    int updClaimMain(@Param("claimMainId") String claimMainId);
}
