package com.bpm.lj.mes.base.server.dto;

import com.bpm.lj.mes.base.common.dto.PageDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 打套料详情
 */
@Data
@ApiModel(description = "打套料详情")
public class WarehouseNestingTaskDetailsDTO extends PageDTO {
    private Integer id;

    /**
     * 领料任务号
     */
    @ApiModelProperty("领料任务号")
    private String taskCode;

    /**
     * 仓库号
     */
    @ApiModelProperty("仓库号")
    private String warehouseCode;

    /**
     * 物料编码
     */
    @ApiModelProperty("物料编码")
    private String materialCode;

    /**
     * 物料名称
     */
    @ApiModelProperty("物料名称")
    private String materialName;

    /**
     * 规格型号
     */
    @ApiModelProperty("规格型号")
    private String specsType;

    /**
     * 实际货位
     */
    @ApiModelProperty("实际货位")
    private String realityLocation;

    /**
     * 1.未领取  2已领取
     */
    @ApiModelProperty("1.未领取  2已领取")
    private Integer receiveStatus;

    /**
     * 是否加急
     */
    @ApiModelProperty("是否加急")
    private Integer isitUrgent;

    /**
     * 是否催检
     */
    @ApiModelProperty("是否催检")
    private Integer urgeInspection;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String remarks;

    /**
     * 推荐货位
     */
    @ApiModelProperty("推荐货位")
    private String pushLocation;

    private Date createTime;

    private Integer createrId;

    private Date updateTime;

    private Integer updaterId;

    /**
     * 送货单号
     */
    @ApiModelProperty("送货单号")
    private String deliveryOrderNo;
    /**
     * 任务id
     */
    @ApiModelProperty("任务id")
    private Integer taskId;
    /**
     *  数量
     */
    @ApiModelProperty("数量")
    private BigDecimal number;
}