package com.demo.controller;

import com.demo.pojo.Claim_main_info;
import com.demo.pojo.Claims;
import com.demo.pojo.Audit;
import com.demo.service.claimsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/claims")
public class claimsController {
    @Autowired
    claimsService service;

    /**
     * 获取所有理赔信息
     */
    @RequestMapping("/getClaims")
    public List<Claims> getClaims(){
        return service.getClaims();
    }

    /**
     * 获取所有赔案信息
     */
    @RequestMapping("/getClaimMains")
    public List<Claim_main_info> getClaimMains(){
        return service.getClaimMains();
    }

    /**
     * 根据所选赔案号 claimMainId 获取各项定损信息
     */
    @RequestMapping("/getAudits")
    public Audit getAudits(String claimMainId){
        return service.getAudits(claimMainId);
    }
}
