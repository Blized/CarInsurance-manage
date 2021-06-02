package com.demo.mapper;

import com.demo.pojo.Policyholders_info;
import com.demo.pojo.Recognizee_info;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SelUserMapper {

    /*查询投保人*/
    @Select("select policyholdersId,policyholdersName,sex,credentialsType,credenId,telephone,address from policyholders_info;")
    List<Policyholders_info> getSelTB();

    /*查询被保人*/
    @Select("select recognizeeId,recognizeeName,recognizee_info.sex,recognizee_info.credentialsType,credentialsId,recognizee_info.telephone,recognizee_info.address,bankAccount,policyholdersName from recognizee_info left join policyholders_info on recognizee_info.policyholdersId=policyholders_info.policyholdersId;")
    List<Recognizee_info> getSelBB();

    /*增加投保人*/
    @Insert("insert into policyholders_info values(default,#{anyAll.policyholdersName},#{anyAll.sex},#{anyAll.credentialsType},#{anyAll.credenId},#{anyAll.telephone},#{anyAll.address});")
    int addTB(@Param("anyAll") Policyholders_info anyAll);

    /*增加被保人*/
    @Insert("insert into recognizee_info values(default,#{anyAll.recognizeeName},#{anyAll.policyholdersId},#{anyAll.sex},#{anyAll.credentialsType},#{anyAll.credentialsId},#{anyAll.telephone},#{anyAll.address},#{anyAll.bankAccount},#{anyAll.driverId});")
    int addBB(@Param("anyAll") Recognizee_info anyAll);

    /*根据投保人姓名查询投保人编号*/
    @Select("select policyholdersId from policyholders_info where policyholdersName=#{policyholdersName}")
    int tbNum(String policyholdersName);

    /*删除投保人*//*
    @Delete("delete from policyholders_info where policyholdersId=#{policyholdersId};")
    int delTB(int policyholdersId);

    *//*删除投保人编号下的被保人*//*
    @Delete("delete from recognizee_info where policyholdersId=#{policyholdersId};")
    int delTBBB(int policyholdersId);

    *//*删除被保人*//*
    @Delete("delete from recognizee_info where recognizeeId=#{recognizeeId};")
    int delBB(int recognizeeId);*/

    /*模糊查询投保人*/
    @Select("select * from policyholders_info where policyholdersName like #{policyholdersName} and credenId like #{credenId};")
    List<Policyholders_info> NumTB(@Param("policyholdersName") String policyholdersName,@Param("credenId") String credenId);

    /*模糊查询被保人*/
    @Select("select * from recognizee_info where recognizeeName like #{recognizeeName} and credentialsId like #{credentialsId};")
    List<Recognizee_info> NumBB(@Param("recognizeeName") String recognizeeName,@Param("credentialsId") String credentialsId);

    /*修改投保人*/
    @Update("update policyholders_info set policyholdersName=#{anyAll.policyholdersName},sex=#{anyAll.sex},credentialsType=#{anyAll.credentialsType},credenId=#{anyAll.credenId},telephone=#{anyAll.telephone},address=#{anyAll.address} where policyholdersId=#{anyAll.policyholdersId};")
    int UpdateTB(@Param("anyAll") Policyholders_info anyAll);

    /*修改被保人*/
    @Update("update recognizee_info set recognizeeName=#{anyAll.recognizeeName},sex=#{anyAll.sex},credentialsType=#{anyAll.credentialsType},credentialsId=#{anyAll.credentialsId},telephone=#{anyAll.telephone},address=#{anyAll.address} where recognizeeId=#{anyAll.recognizeeId};")
    int UpdateBB(@Param("anyAll") Recognizee_info anyAll);
}
