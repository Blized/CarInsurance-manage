package com.demo.service.impl;

import com.demo.mapper.DangerMapper;
import com.demo.pojo.Case_report_info;
import com.demo.service.DangerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DangerServiceImpl implements DangerService {

    @Autowired
    DangerMapper mapper;

    /*查询出险信息*/
    @Override
    public List<Case_report_info> selDanger() {
        return mapper.selDanger();
    }
}
