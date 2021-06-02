package com.demo.service.impl;

import com.demo.mapper.SelUserMapper;
import com.demo.pojo.Policyholders_info;
import com.demo.pojo.Recognizee_info;
import com.demo.service.SelUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelUserServiceImpl implements SelUserService {
    @Autowired
    SelUserMapper mapper;


    /*查询投保人*/
    public List<Policyholders_info> getSelTB(){
        return mapper.getSelTB();
    }

    /*查询被保人*/
    public List<Recognizee_info> getSelBB(){
        return mapper.getSelBB();
    }

    /*增加投保人*/
    @Override
    public int addTB(Policyholders_info anyAll) {
        return mapper.addTB(anyAll);
    }

    /*增加被保人*/
    @Override
    public int addBB(Recognizee_info anyAll,String policyholdersName) {
        int id=mapper.tbNum(policyholdersName);
        anyAll.setPolicyholdersId(id);
        return mapper.addBB(anyAll);
    }

    /*删除投保人*//*
    @Override
    public int delTB(int policyholdersId) {
        mapper.delTBBB(policyholdersId);

        return mapper.delTB(policyholdersId);
    }

    *//*删除被保人*//*
    @Override
    public int delBB(int recognizeeId) {
        return mapper.delBB(recognizeeId);
    }
*/
    /*模糊查询投保人*/
    @Override
    public List<Policyholders_info> NumTB(String policyholdersName, String credenId) {
        String name="";
        name="%"+policyholdersName+"%";
        String id="";
        id="%"+credenId+"%";
        return mapper.NumTB(name,id);
    }

    /*模糊查询被保人*/
    @Override
    public List<Recognizee_info> NumBB(String recognizeeName, String credentialsId) {
        String name="";
        name="%"+recognizeeName+"%";
        String id="";
        id="%"+credentialsId+"%";
        return mapper.NumBB(name,id);
    }

    /*修改投保人*/
    @Override
    public int UpdateTB(Policyholders_info anyAll) {
        return mapper.UpdateTB(anyAll);
    }

    /*修改被保人*/
    @Override
    public int UpdateBB(Recognizee_info anyAll) {
        return mapper.UpdateBB(anyAll);
    }

}
