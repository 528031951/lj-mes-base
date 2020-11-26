package com.bpm.lj.mes.base.server.dto;

import com.bpm.lj.mes.base.common.dto.PageDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 仓库建模表
 */
@Data
@ApiModel(description = "库存管理")
public class BaseWarehouseDTO extends PageDTO {
    private Integer id;

    /**
     * 类型，10：仓库，20：区域，30：货架，40：储位
     */
    @ApiModelProperty(value = "类型，10：仓库，20：区域，30：货架，40：储位")
    private Integer type;

    /**
     * 父ID
     */
    @ApiModelProperty(value = "父ID")
    private Integer pId;

    /**
     * 编号
     */
    @ApiModelProperty(value = "编号")
    private String code;

    /**
     * 名称
     */
    @ApiModelProperty(value = "名称")
    private String name;
    /**
     * erp仓库编码
     */
    @ApiModelProperty(value = "erp仓库编码")
    private String erpWarehouseCode;

    /**
     * erp仓库名称
     */
    @ApiModelProperty(value = "erp仓库名称")
    private String erpWarehouseName;

    private Date createTime;

    private Integer creatorId;

    private Date updateTime;

    private Integer updaterId;
    private Integer dictionariesId;
}