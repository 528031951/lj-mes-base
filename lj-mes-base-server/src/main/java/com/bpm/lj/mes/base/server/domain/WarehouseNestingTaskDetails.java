package com.bpm.lj.mes.base.server.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 打套料详情
 */
@Data
public class WarehouseNestingTaskDetails {
    private Integer id;

    /**
     * 领料任务号
     */
    private String taskCode;

    /**
     * 仓库号
     */
    private String warehouseCode;

    /**
     * 物料编码
     */
    private String materialCode;

    /**
     * 物料名称
     */
    private String materialName;

    /**
     * 规格型号
     */
    private String specsType;

    /**
     * 实际货位
     */
    private String realityLocation;

    /**
     * 1.未领取  2已领取
     */
    private Integer receiveStatus;

    /**
     * 是否加急 1是  0否
     */
    private Integer isitUrgent;

    /**
     * 是否催检
     */
    private Integer urgeInspection;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 推荐货位
     */
    private String pushLocation;

    private Date createTime;

    private Integer createrId;

    private Date updateTime;

    private Integer updaterId;

    /**
     * 送货单号
     */
    private String deliveryOrderNo;

    /**
     * 任务id
     */
    private Integer taskId;

    /**
     *  数量
     */
    private BigDecimal number;
}