package com.demo.service;

import com.demo.pojo.Policyholders_info;
import com.demo.pojo.Recognizee_info;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SelUserService {

    /*查询投保人*/
    List<Policyholders_info> getSelTB();

    /*查询被保人*/
    List<Recognizee_info> getSelBB();

    /*增加投保人*/
    int addTB(Policyholders_info anyAll);

    /*增加被保人*/
    int addBB(Recognizee_info anyAll,String policyholdersName);

    /*删除投保人*//*
    int delTB(int policyholdersId);

    *//*删除被保人*//*
    int delBB(int recognizeeId);*/

    /*模糊查询投保人*/
    List<Policyholders_info> NumTB(String policyholdersName,String credenId);

    /*模糊查询被保人*/
    List<Recognizee_info> NumBB(String recognizeeName,String credentialsId);

    /*修改投保人*/
    int UpdateTB(Policyholders_info anyAll);

    /*修改被保人*/
    int UpdateBB(Recognizee_info anyAll);
}
