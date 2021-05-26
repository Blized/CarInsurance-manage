package com.demo.service;

import com.demo.pojo.Case_report_info;
import com.demo.pojo.Survey_loss_info;

import java.util.List;

public interface AssessmentService {
    List<Survey_loss_info> getallsurveyInfo();

    List<Case_report_info> getallcaseinfo();

    Case_report_info getcaseinfoByid(String caseReportId);
}
