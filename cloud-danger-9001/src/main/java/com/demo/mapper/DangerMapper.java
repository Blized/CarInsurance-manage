package com.demo.mapper;

import com.demo.pojo.Case_report_info;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DangerMapper {

    /*查询出险信息*/
    @Select("select case_report_info.recognizeeId,warrantyId,recognizeeName,telephone,caseReportId,reportPerson,caseReportTime,reportPersonTel,driverTel,dangerTime,fullAddress,dangerCause,caseReportTime,caseState from case_report_info left join recognizee_info on case_report_info.recognizeeId=recognizee_info.recognizeeId left join warranty_info on recognizee_info.recognizeeId=warranty_info.recognizeeId;")
    List<Case_report_info> selDanger();
}
