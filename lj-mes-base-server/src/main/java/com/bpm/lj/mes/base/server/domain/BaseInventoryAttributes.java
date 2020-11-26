package com.bpm.lj.mes.base.server.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 物料属性表
 */
@Data
@Accessors(chain = true)
public class BaseInventoryAttributes {
    private Integer id;

    /**
     * 物料档案ID
     */
    private Integer pId;

    /**
     * 库龄（单位天）
     */
    private Integer libraryAge;

    /**
     * 最低库存量
     */
    private BigDecimal miniStock;

    /**
     * 最高库存量
     */
    private BigDecimal maxStock;

    private Date createTime;

    private Integer creatorId;

    private Date updateTime;

    private Integer updaterId;

    /**
     * 请购天数
     */
    private Integer requisitionDay;
}