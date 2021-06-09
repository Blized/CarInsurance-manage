package com.demo.pojo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
/**
 * 理算基本信息表
 */
public class Adjustment_info {
    /**
     * 理算Id
     */
    private String adjustmentId;
    /**
     * 赔案编号-外键
     */
    private String claimMainId;
    /**
     * 事故责任比率
     */
    private double accidentLiabilityRatio;
    /**
     * 车损失金额
     */
    private double carFeeTotal;
    /**
     * 物损失金额
     */
    private double materialFeeTotal;
    /**
     * 人伤损失金额
     */
    private double peopleFeeTotal;
    /**
     * 三者损失金额
     */
    private double trdPartyLiability;
    /**
     * 损失总金额
     */
    private double settlementTotal;
    /**
     * 应赔付金额
     */
    private double shouldMoney;
    /**
     * 已预付费用金额
     */
    private double prepayMoney;
    /**
     * 理算日志
     */
    private String adjustmentOpinion;
}
