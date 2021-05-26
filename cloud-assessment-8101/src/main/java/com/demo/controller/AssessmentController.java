package com.demo.controller;

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
}
