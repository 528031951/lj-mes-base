package com.bpm.lj.mes.base.server.domain;

import lombok.Data;

import java.util.Date;

/**
 * 班次表
 */
@Data
public class BaseShift {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 创建人
     */
    private Integer creatorId;

    /**
     * 修改人
     */
    private Integer updateId;

    /**
     * 车间id
     */
    private Integer workShopId;

    /**
     * 用户id
     */
    private String shiftName;

    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 结束时间
     */
    private String endTime;

    /**
     * 班次编码
     */
    private String shiftCode;

    /**
     * 是否启用
     */
    private String isEnable;

    /**
     * 产线id
     */
    private Integer productionLineId;
}