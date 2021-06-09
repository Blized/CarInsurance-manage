package com.demo.controller;

import com.demo.pojo.Claim_main_info;
import com.demo.pojo.Claims;
import com.demo.pojo.Audit;
import com.demo.pojo.Warranty_info;
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

    /**
     * 根据 赔案号 更改 赔案表的审核状态
     */
    @RequestMapping(value = "/statusClaim",produces = {"text/html;charset=UTF-8"})
    public String statusClaim(String claimMainId){
        return service.statusClaim(claimMainId);
    }

    /**
     * 获取 保单信息
     */
    @RequestMapping("/getWarranty")
    public List<Warranty_info> getWarranty(String warrantyId){
        return service.getWarranty(warrantyId);
    }

    /**
     * 支付赔偿金
     */
    @RequestMapping(value = "/payMoney",produces = {"text/html;charset=UTF-8"})
    public String payMoney(String claimMainId,double payMoneys,String opinion){
        return service.payMoney(claimMainId,payMoneys,opinion);
    }
}
