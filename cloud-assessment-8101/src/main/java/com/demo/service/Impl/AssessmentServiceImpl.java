package com.demo.service.Impl;

import com.demo.mapper.AssessmentMapper;
import com.demo.pojo.Survey_loss_info;
import com.demo.service.AssessmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AssessmentServiceImpl implements AssessmentService {
    @Autowired
    AssessmentMapper mapper;

    @Override
    public List<Survey_loss_info> getallsurveyInfo() {
        List<Survey_loss_info> survey_loss_infos=mapper.selectAllsurveyInfo();
        return survey_loss_infos;
    }
}
