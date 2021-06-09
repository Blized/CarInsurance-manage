package com.demo.pojo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
/**
 * 让人损失表
 */
public class OthersLoss {
    /**
     * 损失金额
     */
    private double lossMoney;
    /**
     * 绝对免赔率
     */
    private double deductibles;
    /**
     * 赔偿限额
     */
    private double limit;
    /**
     * 应赔金额
     */
    private double shouldMoney;
}
