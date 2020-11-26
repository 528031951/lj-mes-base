package com.bpm.lj.mes.base.server.dto;

import com.bpm.lj.mes.base.common.dto.PageDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 入库异常管理
 */
@Data
@ApiModel(description = "入库异常管理")
public class WarehouseUnusualStorageDTO extends PageDTO {
    private Integer id;

    /**
     * 订单编号
     */
    @ApiModelProperty("订单编号")
    private String orderNo;

    /**
     * 供应商名称
     */
    @ApiModelProperty("供应商名称")
    private String supplierName;

    /**
     * 收货日期
     */
    @ApiModelProperty("收货日期")
    private Date receiptDate;

    /**
     * 物料编码
     */
    @ApiModelProperty("物料编码")
    private String stockNo;

    /**
     * 物料名称
     */
    @ApiModelProperty("物料名称")
    private String stockName;

    /**
     * 规格型号
     */
    @ApiModelProperty("规格型号")
    private String specsType;

    /**
     * 送货单号
     */
    @ApiModelProperty("送货单号")
    private String deliveryOrderNo;

    /**
     * 清点数量
     */
    @ApiModelProperty("清点数量")
    private BigDecimal countNum;

    /**
     * 检验通过数量
     */
    @ApiModelProperty("检验通过数量")
    private BigDecimal checkOnum;

    /**
     * 异常编号
     */
    @ApiModelProperty("异常编号")
    private String unCode;

    /**
     * 批号
     */
    @ApiModelProperty("批号")
    private String batchNo;

    /**
     * 责任人
     */
    @ApiModelProperty("责任人")
    private Integer personLiable;

    /**
     * 发生异常时间
     */
    @ApiModelProperty("发生异常时间")
    private Date exceptionDate;

    /**
     * 异常描述
     */
    @ApiModelProperty("异常描述")
    private String exceptionRemarks;

    /**
     * 1清点异常  2.入库异常等
     */
    @ApiModelProperty("1清点异常  2.入库异常等")
    private String exceptionType;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String remarks;

    private Date createTime;

    private Integer createrId;

    private Date updateTime;

    private Integer updaterId;
}