package com.bpm.lj.mes.base.server.domain;

import lombok.Data;

import java.util.Date;

/**
 * 仓库建模表
 */
@Data
public class BaseWarehouse {
    private Integer id;

    /**
     * 类型，10：仓库，20：区域，30：货架，40：储位
     */
    private Integer type;

    /**
     * 父ID
     */
    private Integer pId;

    /**
     * 编号
     */
    private String code;

    /**
     * 名称
     */
    private String name;

    private Date createTime;

    private Integer creatorId;

    private Date updateTime;

    private Integer updaterId;

    /**
     * erp仓库编码
     */
    private String erpWarehouseCode;

    /**
     * erp仓库名称
     */
    private String erpWarehouseName;
}