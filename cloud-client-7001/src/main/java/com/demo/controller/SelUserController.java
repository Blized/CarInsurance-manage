package com.demo.controller;

import com.demo.pojo.Policyholders_info;
import com.demo.pojo.Recognizee_info;
import com.demo.service.SelUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/selTBB")
public class SelUserController {
    @Autowired
    SelUserService selservice;

    /*查询投保人*/
    @RequestMapping("/getSelTB")
    public List<Policyholders_info> getSelTB(){
        return selservice.getSelTB();
    }

    /*查询被保人*/
    @RequestMapping("/getSelBB")
    public List<Recognizee_info> getSelBB(){
        return selservice.getSelBB();
    }

    /*增加投保人*/
    @RequestMapping("/addTB")
    @ResponseBody
    public int addTB(@RequestBody Policyholders_info anyAll){
        return selservice.addTB(anyAll);
    }

    /*增加被保人*/
    @RequestMapping("/addBB")
    @ResponseBody
    public int addBB(@RequestBody Recognizee_info anyAll,String policyholdersName){
        return selservice.addBB(anyAll,policyholdersName);
    }

    /*删除投保人*//*
    @RequestMapping("/delTB")
    @ResponseBody
    public int delTB(int policyholdersId){
        return selservice.delTB(policyholdersId);
    }

    *//*删除被保人*//*
    @RequestMapping("/delBB")
    @ResponseBody
    public int delBB(int recognizeeId){
        return selservice.delBB(recognizeeId);
    }*/

    /*模糊查询投保人*/
    @RequestMapping("NumTB")
    @ResponseBody
    public List<Policyholders_info> NumTB(@RequestParam(defaultValue = "") String policyholdersName, @RequestParam(defaultValue = "") String credenId){
        return selservice.NumTB(policyholdersName,credenId);
    }

    /*模糊查询被保人*/
    @RequestMapping("NumBB")
    @ResponseBody
    public List<Recognizee_info> NumBB(@RequestParam(defaultValue = "") String recognizeeName, @RequestParam(defaultValue = "") String credentialsId){
        /*System.out.println("进来了");*/
        List<Recognizee_info>list= selservice.NumBB(recognizeeName,credentialsId);
        /*System.out.println(list.size());*/
        return list;
    }

    /*修改投保人*/
    @RequestMapping("/UpdateTB")
    @ResponseBody
    public int UpdateTB(@RequestBody Policyholders_info anyAll){
        System.out.println("TB进来了");
        return selservice.UpdateTB(anyAll);
    }

    /*修改被保人*/
    @RequestMapping("/UpdateBB")
    @ResponseBody
    public int UpdateBB(@RequestBody Recognizee_info anyAll){
        System.out.println("BB进来了");
        return selservice.UpdateBB(anyAll);
    }


}
