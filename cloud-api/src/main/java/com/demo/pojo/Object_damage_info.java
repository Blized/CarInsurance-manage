package com.demo.pojo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
/**
 * 物损信息详情表
 */
public class Object_damage_info {
    /**
     * 物损信息编号
     * odamage_20210520+车牌后3位+001
     * 001:同车往后+1
     */
    private String objectDamage;
    /**
     * 赔案编号
     */
    private String claimMainId;
    /**
     * 物损部件名称
     */
    private String objectDamageName;
    /**
     * 损失程度
     */
    private String lossDegree;
    /**
     * 定损单价
     */
    private double lossPrice;
    /**
     * 数量
     */
    private int lossNumber;
    /**
     * 定损费用小计
     */
    private double lossTotal;
}
