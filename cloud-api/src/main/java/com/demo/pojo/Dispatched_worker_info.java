package com.demo.pojo;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
/**
 * 调度派工信息表
 */
public class Dispatched_worker_info {
    /**
     * 调度派工编号 :pg_时间+工号
     */
    private String dispatchedWorkerId;
    /**
     * 赔案编号
     */
    private String claimMainId;
    /**
     * 派工工号
     * 采用系统用户信息表职位类型为查勘的人的工号
     */
    private int userId;
    /**
     * 派工时间
     */
    private String dispatchedWorkerTime;
}
