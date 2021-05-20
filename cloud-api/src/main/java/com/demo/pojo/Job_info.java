package com.demo.pojo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

/**
 * 系统职位表
 */
public class Job_info {
    /**
     * 用户职位编号
     */
    private int jobId;
    /**
     * 用户职位名称
     */
    private String jobName;
}
