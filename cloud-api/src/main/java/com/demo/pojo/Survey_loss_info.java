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
     * 查勘定损时间
     */
    private String surveyLossTime;
    /**
     * 查勘地点
     */
    private String surveyLossAddress;
    /**
     * 事故分类(1.单方事故 2.双方事故 3.三方事故 4.多方事故)
     */
    private int disposeType;
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
    private int duty;
    /**
     * 责任比例（%）
     */
    private double dutyRatio;
    /**
     * 联系电话
     */
    private String telphone;
    /**
     * 维修点
     */
    private String maintenancePoint;
    /**
     * 驾驶证
     */
    private String drivingLicence;
    /**
     * 行驶证
     */
    private String vehicleLicense;
    /**
     * 车架号
     */
    private String carframeId;
    /**
     * 发动机号
     */
    private String engine_number;
    /**
     * 驾驶证是否有效（0. 否，1.有）默认：1
     */
    private int isEffectiveDrivingLicence;
    /**
     * 行驶证是否有效（0. 否，1.有）默认：1
     */
    private int isEffectiveVehicleLicence;
    /**
     * 是否违规装载（0. 否，1.有）默认：1
     */
    private int isViolationLoad;
    /**
     * 是否超出行驶区域（0.否 ，1.有）默认：1
     */
    private int isOverstepTravelRegion;
    /**
     * 是否装载危险货物（0. 否，1.有）默认：1
     */
    private int isLoadDangerousGoods;
    /**
     * 标的车出现前是否有缺陷（0. 否，1.有）默认：1
     */
    private int isBeforeDangerDefect;
    /**
     * 查勘定损日志
     */
    private String surveyLossOpinion;
}
