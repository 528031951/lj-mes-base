package com.bpm.lj.mes.base.server.vo;

import com.bpm.lj.mes.base.common.dto.PageDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 物料档案表
 */
@Data
@ApiModel(description = "物料档案表")
public class BaseInventoryArchivesVo extends PageDTO {
    private Integer id;


    /**
     * 物料编码
     */
    @ApiModelProperty("物料编码")
    private String cInvCode;
    @ApiModelProperty("图号")
    private String drawingNo;
    /**
     * 物料代码
     */
    @ApiModelProperty("物料代码")
    private String cInvAddCode;
    /**
     * 物料名称
     */
    @ApiModelProperty("物料名称")
    private String cInvName;
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
    @ApiModelProperty("主计量单位编码")
    private String cComUnitCode;
    @ApiModelProperty("主计量单位名称")
    private String cComUnitName;
    @ApiModelProperty("版本号")
    private String free1;


}