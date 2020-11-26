package com.bpm.lj.mes.base.server.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 入库异常管理
 */
@Data
@ApiModel(description = "退货")
public class WarehouseSalesReturnDTO {
    private Integer id;

    /**
     * 订单编号
     */
    @ApiModelProperty("订单编号")
    private String orderNo;
    /**
     * 批号
     */
    @ApiModelProperty("批号")
    private String batchNo;
    /**
     * 异常描述
     */
    @ApiModelProperty("异常描述")
    private String exceptionRemarks;
    /**
     * 异常数量
     */
    @ApiModelProperty("异常数量")
    private Integer abnormalNum;

}