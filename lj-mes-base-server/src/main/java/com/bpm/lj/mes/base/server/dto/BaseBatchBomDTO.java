package com.bpm.lj.mes.base.server.dto;

import com.bpm.lj.mes.base.common.dto.PageDTO;
import lombok.Data;

/**
 * 批号、bom、订单关联表
 */
@Data
public class BaseBatchBomDTO extends PageDTO {
    private Integer id;

    /**
     * erp批号
     */
    private String erpBatchCode;

    /**
     * 关联的bom主表可能多个bom关联
     */
    private String bomId;

    /**
     * 订单表id
     */
    private Integer orderId;

    private Integer type;

    private Integer status;

    /**
     * 自定义项
     */
    private String customize1;

    /**
     * 自定义项
     */
    private String customize2;
    private String cInvCode;

    /**
     * 自定义项
     */
    private String customize3;

    /**
     * 自定义项
     */
    private String customize4;

    /**
     * 自定义项
     */
    private Integer customize5;

    /**
     * 自定义项
     */
    private Integer customize6;

    /**
     * 自定义项
     */
    private Integer customize7;

    /**
     * 自定义项
     */
    private Integer customize8;
}