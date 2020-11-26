package com.bpm.lj.mes.base.server.dto;

import com.bpm.lj.mes.base.common.dto.PageDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 物料属性表
 */
@Data
@ApiModel(description = "物料属性表")
public class BaseInventoryAttributesQueryDTO extends PageDTO {


    /**
     * 存货分类名称
     */
    @ApiModelProperty("存货分类名称")
    private String cInvCName;
    /**
     * 物料名称
     */
    @ApiModelProperty("物料名称")
    private String cInvName;


}