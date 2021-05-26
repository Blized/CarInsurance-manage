package com.demo.pojo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
/**
 * 查勘定损信息表
 */
public class Survey_loss_info {
    /**
     * 查勘定损编号
     */
    private String surveyLossId;
    /**
     * 赔案编号
     */
    private String claimMainId;
    /**
     * 工号
     */
    private String jobint;
    /**
     * 查勘时间
     */
    private String surveyLossTime;
    /**
     * 查勘地点
     */
    private String surveyLossAddress;
    /**
     * 事故分类(1.单方事故 2.双方事故 3.三方事故 4.多方事故)
     */
    private String disposeType;
    /**
     * 事故处理意见
     */
    private String prospectDisposeIdea;
    /**
     * 损失情况
     */
    private String lossInfo;
    /**
     * 责任判断(1.全部责任 2.主要责任 3.同等责任 4.次要责任 5.无责任)
     */
    private String duty;
    /**
     * 责任比例（%）
     */
    private double dutyRatio;
    /**
     *维修点
     */
    private String maintenancePoint;
    /**
     * 联系电话
     */
    private String telphone;

    /**
     * 查勘日志
     */
    private String surveyLossOpinion;
    /**
     * 查勘状态
     */
    private String surveystatus;
    /**
     * 审核状态
     */
    private String shengstatus;

    /*
    *赔案主档案表
    */
    private Claim_main_info c;

    /**
     * 报案信息表
     */
    private Case_report_info ca;

}
