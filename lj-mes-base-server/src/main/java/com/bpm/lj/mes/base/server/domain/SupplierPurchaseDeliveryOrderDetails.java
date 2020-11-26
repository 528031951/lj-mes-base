package com.bpm.lj.mes.base.server.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 送货单详情
 */
@Data
public class SupplierPurchaseDeliveryOrderDetails {
    private Integer id;

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
     * ERP账套号
     */
    private Integer caccId;

    /**
     * 订单数量
     */
    private BigDecimal orderNumber;

    /**
     * 送货订单编号
     */
    private String orderNo;

    /**
     * 关联送货单id
     */
    private Integer purchaseDeliveryOrderId;

    /**
     * 发货数量
     */
    private BigDecimal quantityNum;

    /**
     * 目前所处状态（0.未收货 1.已发货 2收货 3采购部门确认收货）
     */
    private Integer currentStatus;

    /**
     * 加急--1
     */
    private Integer urgent;

    /**
     * 图号
     */
    private String draweNo;

    /**
     * 二维码标签内容
     */
    private String qrCode;

    private Date createTime;

    private Integer createrId;

    private Date updateTime;

    private Integer updaterId;

    /**
     * 物料批号
     */
    private String materialBatchCode;

    /**
     * 备注
     */
    private String remark;

    /**
     * 特采数量
     */
    private Integer specialNum;

    /**
     * erp批号
     */
    private String erpBatchCode;

    /**
     * 是否异常（0-正常，1-异常）--这里需要流程处理完后把状态改为1
     */
    private Integer frozenStatus;

    /**
     * 单据编号
     */
    private String ccode;

    /**
     * 单位
     */
    private String unit;

    /**
     * 版本号
     */
    private String versionNo;

    /**
     * 存货代码
     */
    private String cinvaddcode;

    private Integer ipodid;

    /**
     * 行号
     */
    private Integer irowno;
}