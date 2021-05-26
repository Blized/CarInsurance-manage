package com.demo.mapper;

import com.demo.pojo.Survey_loss_info;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AssessmentMapper {
    List<Survey_loss_info> selectAllsurveyInfo();
}
