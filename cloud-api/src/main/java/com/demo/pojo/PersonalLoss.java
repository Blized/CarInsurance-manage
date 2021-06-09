package com.demo.pojo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
/**
 *个人损失
 */
public class PersonalLoss {
    /**
     * 损失金额
     */
    private double lossMoney;
    /**
     * 事故责任免赔率
     */
    private double fch;
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
