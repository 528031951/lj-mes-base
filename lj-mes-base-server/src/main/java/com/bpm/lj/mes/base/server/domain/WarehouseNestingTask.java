package com.bpm.lj.mes.base.server.domain;

import java.util.Date;
import lombok.Data;

/**
 * 打套料任务
 */
@Data
public class WarehouseNestingTask {
    private Integer id;

    /**
     * 批号
     */
    private String batchNo;

    /**
     * 领料任务号
     */
    private String taskCode;

    /**
     * 任务状态1 新建 2发布 3进行中  4完成
     */
    private Integer taskStatus;

    /**
     * 物料状态
     */
    private Integer materialStatus;

    /**
     * 生产工艺
     */
    private Integer productionProcesses;

    /**
     * 任务发起时间
     */
    private Date taskLaunchDate;

    /**
     * 预期截止时间
     */
    private Date expectedCompletionDate;

    /**
     * 任务完成时间
     */
    private Date taskCompletionDate;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 领料责任人
     */
    private Integer materialReqPerson;

    private Date createTime;

    private Integer createrId;

    private Date updateTime;

    private Integer updaterId;
}