package com.bpm.lj.mes.base.server.domain;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 入库异常管理
 */
@Data
public class WarehouseUnusualStorage {
    private Integer id;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 供应商名称
     */
    private String supplierName;

    /**
     * 收货日期
     */
    private Date receiptDate;

    /**
     * 物料编码
     */
    private String stockNo;

    /**
     * 物料名称
     */
    private String stockName;

    /**
     * 规格型号
     */
    private String specsType;

    /**
     * 送货单号
     */
    private String deliveryOrderNo;

    /**
     * 清点数量
     */
    private BigDecimal countNum;

    /**
     * 检验通过数量
     */
    private BigDecimal checkOnum;

    /**
     * 异常编号
     */
    private String unCode;

    /**
     * 批号
     */
    private String batchNo;

    /**
     * 责任人
     */
    private Integer personLiable;

    /**
     * 发生异常时间
     */
    private Date exceptionDate;

    /**
     * 异常描述
     */
    private String exceptionRemarks;

    /**
     * 1清点异常  2.入库异常等
     */
    private String exceptionType;

    /**
     * 备注
     */
    private String remarks;

    private Date createTime;

    private Integer createrId;

    private Date updateTime;

    private Integer updaterId;

    /**
     * 异常数量
     */
    private Integer abnormalNum;

    /**
     * 1新建 2审批中 3退还 4寄存 0关闭
     */
    private Integer status;

    /**
     * 寄存数量
     */
    private Integer registerNum;
}