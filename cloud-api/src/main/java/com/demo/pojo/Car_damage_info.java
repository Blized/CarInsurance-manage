package com.demo.pojo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
/**
 * 车损信息详情表
 */
public class Car_damage_info {
    /**
     * 车损信息编号
     * cdamage_20210520+车牌后3位+001
     * 001:同车往后+1
     */
    private String carDamageId;
    /**
     * 赔案编号
     */
    private String claimMainId;
    /**
     * 车损部件名称
     */
    private String carDamageName;
    /**
     * 定损单价
     */
    private double lossPrice;
    /**
     * 损坏数量
     */
    private int lossNumber;
    /**
     * 定损费用小计
     */
    private double lossTotal;
}
