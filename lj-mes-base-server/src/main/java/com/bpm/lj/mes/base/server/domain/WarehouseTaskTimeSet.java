package com.bpm.lj.mes.base.server.domain;

import java.util.Date;
import lombok.Data;

/**
 * 任务时间设置
 */
@Data
public class WarehouseTaskTimeSet {
    private Integer id;

    /**
     * 时间任务编号
     */
    private String timeTaskNum;

    /**
     * 天数
     */
    private Date dayDate;

    /**
     * 时间任务描述
     */
    private String timeTaskRemarks;

    private Date createTime;

    private Integer createrId;

    private Date updateTime;

    private Integer updaterId;
}