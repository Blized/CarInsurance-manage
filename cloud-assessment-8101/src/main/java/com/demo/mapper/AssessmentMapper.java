package com.demo.mapper;

import com.demo.pojo.Case_report_info;
import com.demo.pojo.Survey_loss_info;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface AssessmentMapper {
    List<Survey_loss_info> selectAllsurveyInfo();

    @Select("select * from case_report_info;")
    List<Case_report_info> selectAllcaseInfo();

    @Select("select * from case_report_info where caseReportId=#{caseReportId};")
    Case_report_info selectcaseinfoByid(String caseReportId);
}
