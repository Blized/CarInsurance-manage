package com.demo.pojo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
/**
 * 详情登记
 */
public class AdjustmentDetail {
    /**
     *理算详情Id
     */
    private String adjustmentDetailId;
    /**
     * 理算Id
     */
    private String adjustmentId;
    /**
     * 项目类型
     */
    private String itemType;
    /**
     * 损失项目名称
     */
    private String lossName;
    /**
     * 三者险分类
     */
    private String risktype;
    /**
     * 损失物金额
     */
    private double lossTotal;
    /**
     * 施救费用
     */
    private double sueCharges;
    /**
     * 赔偿限额
     */
    private double indemnitylimit;
    /**
     * 投保比例
     */
    private double insurancePercentage;
    /**
     * 事故责任免赔率
     */
    private double accidentLiabilityExcess;
    /**
     * 绝对免赔率
     */
    private String absolutelyFranchise;
    /**
     * 绝对免赔额
     */
    private double deductibleAverage;
    /**
     * 实际赔付（实际赔付总金额=绝对免赔额*绝对免赔率-施救费  不得超过赔偿限额）
     */
    private double actualPay;
}
