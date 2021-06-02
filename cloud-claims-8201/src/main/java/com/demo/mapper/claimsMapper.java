package com.demo.mapper;

import com.demo.pojo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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

    @Select("select * from car_damage_info where claimMainId=#{claimMainId}")
    List<Car_damage_info> getCarDamage(@Param("claimMainId") String claimMainId);

    @Select("select * from object_damage_info where claimMainId=#{claimMainId}")
    List<Object_damage_info> getObjDamage(@Param("claimMainId") String claimMainId);

    @Select("select * from human_injury_info where claimMainId=#{claimMainId}")
    List<Human_injury_info> getHumanDamage(@Param("claimMainId") String claimMainId);
}
