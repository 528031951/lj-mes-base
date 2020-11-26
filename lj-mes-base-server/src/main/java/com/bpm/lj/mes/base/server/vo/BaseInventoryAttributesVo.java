package com.bpm.lj.mes.base.server.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 物料属性表
 */
@Data
public class BaseInventoryAttributesVo {
    private Integer id;

    /**
     * 物料档案ID
     */
    @ApiModelProperty("物料档案ID")
    private Integer pId;

    /**
     * 库龄（单位天）
     */
    @ApiModelProperty("库龄（单位天）")
    private Integer libraryAge;

    /**
     * 最低库存量
     */
    @ApiModelProperty("最低库存量")
    private BigDecimal miniStock;

    /**
     * 最高库存量
     */
    @ApiModelProperty("最高库存量")
    private BigDecimal maxStock;

    @ApiModelProperty("请购天数")
    private Integer requisitionDay;
    /**
     * 物料编码
     */
        @ApiModelProperty("物料编码")
    private String cInvCode;
    /**
     * 物料代码
     */
    @ApiModelProperty("物料代码")
    private String cIInvAddCode;
    /**
     * 物料名称
     */
    @ApiModelProperty("物料名称")
    private String cIInvName;
    /**
     * 规格型号
     */
    @ApiModelProperty("规格型号")
    private String cInvStd;
  /**
     * 存货分类编码
     */
    @ApiModelProperty("存货分类编码")
    private String cInvCCode;
  /**
     * 存货分类名称
     */
    @ApiModelProperty("存货分类名称")
    private String cInvCName;


}