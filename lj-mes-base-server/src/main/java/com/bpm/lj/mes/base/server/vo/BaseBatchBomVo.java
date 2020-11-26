package com.bpm.lj.mes.base.server.vo;

import com.bpm.lj.mes.base.common.dto.PageDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 批号管理
 */
@Data
@ApiModel(description = "批号管理返回对象")
public class BaseBatchBomVo extends PageDTO {
    private Integer id;
    /**
     * 物料编码
     */
    @ApiModelProperty("物料编码")
    private String cInvCode;

    /**
     * 单据编号
     */
    @ApiModelProperty("单据编号")
    private String cCode;

    /**
     * 订单类别
     */
    @ApiModelProperty("订单类别")
    private String cBusType;
    /**
     * 生产批号
     */
    @ApiModelProperty("生产批号")
    private String erpBatchCode;
    /**
     * 销售订单号
     */
    @ApiModelProperty("销售订单号")
    private String cSoCode;
    /**
     * 物料清单（BOM）
     */
    @ApiModelProperty("物料清单（BOM）")
    private String cInvCodeBom;
    /**
     * （BOMID）
     */
    @ApiModelProperty("BOMID）")
    private String bomId;
    /**
     * 单据日期
     */
    @ApiModelProperty("单据日期")
    private Date dDate;


}