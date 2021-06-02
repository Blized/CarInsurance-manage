package com.demo.controller;

import com.demo.pojo.Case_report_info;
import com.demo.pojo.Policyholders_info;
import com.demo.service.DangerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/Danger")
public class DangerController {

    @Autowired
    DangerService service;

    /*查询投保人*/
    @RequestMapping("/selDanger")
    public List<Case_report_info> selDanger(){
        System.out.println("进来了");
        return service.selDanger();
    }
}
