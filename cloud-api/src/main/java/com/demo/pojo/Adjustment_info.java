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
    private String StringaccidentLiabilityRatio;
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
     * 赔偿限额
     */
    private double indemnityLimit;
    /**
     * 费用赔付总金额
     */
    private double costSettlement;
    /**
     * 损失赔付总金额
     */
    private double lossSettlement;
    /**
     * 赔付总金额
     */
    private double settlementTotal;
    /**
     * 已预付费用金额
     */
    private double prepayMoney;
    /**
     * 已预付损失金额
     */
    private double prepayLossMoney;
    /**
     * 理算日志
     */
    private String adjustmentOpinion;
}
