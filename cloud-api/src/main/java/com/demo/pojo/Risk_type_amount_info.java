package com.demo.pojo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
/**
 * 险别信息投保金额、保险费关联表
 */
public class Risk_type_amount_info {
    /**
     * 投保金额/责任限额编号
     */
    private int insured_amount_id;
    /**
     * 投保金额/责任限额信息
     */
    private String insured_amount;
    /**
     * 险别编号
     */
    private int riskTypeId;
    /**
     * 保险费
     */
    private double premium;
}
