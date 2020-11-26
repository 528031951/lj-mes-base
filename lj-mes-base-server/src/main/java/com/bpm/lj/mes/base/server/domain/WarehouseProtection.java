package com.bpm.lj.mes.base.server.domain;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 劳防用品
 */
@Data
public class WarehouseProtection {
    private Integer id;

    /**
     * 防护用品名称
     */
    private String protectionName;

    /**
     * 用品类型
     */
    private Integer type;

    /**
     * 型号
     */
    private String version;

    /**
     * 供应商名称
     */
    private String supplierName;

    /**
     * 库存总量
     */
    private BigDecimal inventory;

    /**
     * 单位
     */
    private String unit;

    /**
     * 可用库存
     */
    private BigDecimal availableInventory;

    /**
     * 存放地点
     */
    private String storageLocation;

    /**
     * 库龄
     */
    private Integer validity;

    private Date createTime;

    private Integer createrId;

    private Date updateTime;

    private Integer updaterId;
}