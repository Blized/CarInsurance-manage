package com.demo.pojo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
/**
 * 报案信息表
 */
public class Case_report_info {
    /**
     * 报案编号,例如case_2019010100001
     */
    private String caseReportId;
    /**
     * 出险地点所在省份
     */
    private String province;
    /**
     * 出险地点所在市
     */
    private String city;
    /**
     * 出险地点所在县/区
     */
    private String county;
    /**
     * 出险所在详细地址
     */
    private String fullAddress;

    /**
     * 出险原因
     */
    private String dangerCause;
    /**
     * 出险司机
     */
    private String driver;
    /**
     * 司机电话
     */
    private String driverTel;
    /**
     * 出险时间
     */
    private String dangerTime;
    /**
     * 报案人
     */
    private String reportPerson;
    /**
     * 报案人电话
     */
    private String reportPersonTel;
    /**
     * 报案时间
     */
    private String caseReportTime;
    /**
     * 案件状态（1.已报案 2已立案(已派人勘察) 3已结案）
     */
    private String caseState;
}
