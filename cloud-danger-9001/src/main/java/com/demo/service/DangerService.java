package com.demo.service;

import com.demo.pojo.Case_report_info;

import java.util.List;

public interface DangerService {

    /*查询出险信息*/
    List<Case_report_info> selDanger();
}
