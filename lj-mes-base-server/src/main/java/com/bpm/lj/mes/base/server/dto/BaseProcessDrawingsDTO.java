package com.bpm.lj.mes.base.server.dto;

import com.bpm.lj.mes.base.common.dto.PageDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 工艺图纸管理
 */
@Data
@ApiModel(description = "工艺图纸管理")
public class BaseProcessDrawingsDTO extends PageDTO {
    private Integer id;

    /**
     * 物料档案id
     */
    @ApiModelProperty("物料档案id")
    private Integer pId;

    /**
     * 存货分类编码
     */
    @ApiModelProperty("存货分类编码")
    private String cinvccode;

    /**
     * 存货分类名称
     */
    @ApiModelProperty("存货分类名称")
    private String cinvcname;

    /**
     * 物料编码
     */
    @ApiModelProperty("物料编码")
    private String cinvcode;

    /**
     * 物料代码
     */
    @ApiModelProperty("物料代码")
    private String ciinvaddcode;

    /**
     * 物料名称
     */
    @ApiModelProperty("物料名称")
    private String ciinvname;

    /**
     * 规格型号
     */
    @ApiModelProperty("规格型号")
    private String cinvstd;

    /**
     * 图号
     */
    @ApiModelProperty("图号")
    private String drawingNo;

    /**
     * 版本号
     */
    @ApiModelProperty("版本号")
    private String versionNo;

    /**
     * 是否保存工艺图纸
     */
    @ApiModelProperty("是否保存工艺图纸")
    private Integer isDrawing;

    /**
     * 是否保存工艺卡
     */
    @ApiModelProperty("是否保存工艺卡")
    private Integer isCard;
    @ApiModelProperty("地址")
    private String drawingPath;
    @ApiModelProperty("图纸类型，0：工艺图纸，1：工艺卡")
    private Integer drawingType;
    private Integer detailsId;

}