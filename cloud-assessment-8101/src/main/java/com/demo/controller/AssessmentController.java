package com.demo.controller;

import com.demo.pojo.Case_report_info;
import com.demo.pojo.Survey_loss_info;
import com.demo.service.AssessmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/assessment")
public class AssessmentController {
    @Autowired
    AssessmentService assessmentService;


    @RequestMapping(value = "/getAllsurveyInfo",produces = {"application/json;charset=UTF-8"})
    public List<Survey_loss_info> getAllsurveyInfo(){
        List<Survey_loss_info> survey_loss_infos=assessmentService.getallsurveyInfo();
        return survey_loss_infos;
    }

    @RequestMapping(value = "/getAllcasereportinfo",produces = {"application/json;charset=UTF-8"})
    public List<Case_report_info> getAllcasereportinfo(){
        List<Case_report_info> case_report_infos=assessmentService.getallcaseinfo();
        return case_report_infos;
    }

    //根据id获取报案信息
    @RequestMapping(value = "/getcaseinfoByid",produces = {"application/json;charset=UTF-8"})
    public Case_report_info getcaseinfoByid(String caseReportId){
        System.out.println(caseReportId+"ddd");
        Case_report_info case_report_info=assessmentService.getcaseinfoByid(caseReportId);
        return case_report_info;
    }
}
