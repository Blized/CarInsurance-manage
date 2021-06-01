package com.demo.controller;

import com.demo.pojo.Policyholders_info;
import com.demo.pojo.Warranty_info;
import com.demo.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.midi.Soundbank;
import java.util.List;

/**
 * 保单信息控制器
 * @author wyq3142384480
 */
@RestController
@CrossOrigin
@RequestMapping("/policy")
public class PolicyController {
    @Autowired
    PolicyService policyService;


    /**
     * 查询全部保单信息
     * @return 保单信息列表
     */
    @RequestMapping("/getWarrantyAll")
    public List<Warranty_info> getWarrantyAll(){
        System.out.println("jinru...getWarrantyAll");
        return policyService.getWarrantyAll();
    }
    /**
     * 新增保单信息
     * @return 新增结果
     */
    @RequestMapping("/addWarranty")
    public int addWarranty(Warranty_info warrantyInfo){
        return policyService.addWarranty(warrantyInfo);
    }

    /**
     * 删除保单信息
     * @param wNo 保单号
     * @return 删除结果
     */
    @RequestMapping("/deleteWarranty/{wNo}")
    public int deleteWarranty(@PathVariable String wNo){
        return policyService.deleteWarranty(wNo);
    }

    /**·
     * 修改保单信息
     * @param warrantyInfo 保单对象
     * @return 修改结果
     */
    @RequestMapping("/updateWarranty")
    public int updateWarranty(Warranty_info warrantyInfo){
        return policyService.updateWarranty(warrantyInfo);
    }

    @RequestMapping("/addClient")
    public int addClient(Policyholders_info policyholders_info){
        return 1;
    }
}
