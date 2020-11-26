package com.bpm.lj.mes.base.server.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "工厂模型对像")
public class BmLocationEquipmentDTO {
    private Integer id;

    /**
     * 编号
     */
    @ApiModelProperty("编号")
    private String code;
    private Integer value;
    private String label;

    /**
     * 名称
     */
    @ApiModelProperty("名称")
    private String name;



}