package com.bpm.lj.mes.base.server.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 劳防用品
 */
@Data
@ApiModel(description = "劳防用品返回对象")
public class WarehouseProtectionVo   {
    private Integer id;

    /**
     * 防护用品名称
     */
    @ApiModelProperty("防护用品名称")
    private String protectionName;

    /**
     * 用品类型
     */
    @ApiModelProperty("用品类型")
    private Integer type;

    /**
     * 型号
     */
    @ApiModelProperty("型号")
    private String version;
    /**
     * 班组名称
     */
    @ApiModelProperty("班组名称")
    private String teamName;
    /**
     * 申请时间
     */
    @ApiModelProperty("申请时间")
    private Date grandDate;
    /**
     * 申请数量
     */
    @ApiModelProperty("申请数量")
    private BigDecimal applyNum;
    /**
     * 领用数量
     */
    @ApiModelProperty("领用数量")
    private BigDecimal grandNum;
   /**
     * 在使用数量
     */
    @ApiModelProperty("在使用数量")
    private BigDecimal inUseNum;
    /**
     * 用途
     */
    @ApiModelProperty("用途")
    private String use;
    /**
     * 供应商名称
     */
    @ApiModelProperty("供应商名称")
    private String supplierName;

    /**
     * 库存总量
     */
    @ApiModelProperty("库存总量")
    private BigDecimal inventory;

    /**
     * 单位
     */
    @ApiModelProperty("单位")
    private String unit;

    /**
     * 可用库存
     */
    @ApiModelProperty("可用库存")
    private BigDecimal availableInventory;

    /**
     * 存放地点
     */
    @ApiModelProperty("存放地点")
    private String storageLocation;

    /**
     * 库龄
     */
    @ApiModelProperty("库龄")
    private Integer validity;

    private Date createTime;

    private Integer createrId;
    private Integer deptId;

    private Date updateTime;

    private Integer updaterId;
}