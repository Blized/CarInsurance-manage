package com.demo.pojo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
/**
 * 被保人车辆基本信息表
 */
public class Insured_car_info {
    /**
     * 被保车牌号
     */
    private String licenseId;
    /**
     * 被保人
     */
    private int recognizeeId;
    /**
     * 车主姓名
     */
    private String carOwnerName;
    /**
     * 发动机号
     */
    private String engineId;
    /**
     * 车架号
     */
    private String frameId;
    /**
     * 车辆行驶证号
     */
    private String sailint;
    /**
     * 厂牌型号
     */
    private String makeId;
    /**
     * 核定载客数
     */
    private int customersSum;
    /**
     * 实际使用年限
     */
    private int placemanLength;
    /**
     * 机动车类型
     */
    private String vehicleType;
    /**
     * 车身颜色
     */
    private String carColor;
    /**
     * 新车购置价
     */
    private String vpDollar;
    /**
     * 实际价值
     */
    private String realValue;
    /**
     * 初次登记日期
     */
    private String registerDATETIME;
    /**
     * 已行驶里程
     */
    private int mileage;
}
