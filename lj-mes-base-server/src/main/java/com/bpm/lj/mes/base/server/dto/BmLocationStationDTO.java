package com.bpm.lj.mes.base.server.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(description = "工厂模型对像")
public class BmLocationStationDTO {
    private Integer id;

    /**
     * 编号
     */
    @ApiModelProperty("编号")
    private String code;

    /**
     * 名称
     */
    @ApiModelProperty("名称")
    private String name;
    private String value;
    private String label;
    /**
     * 设备LIST
     */
    @ApiModelProperty("设备LIST")
    List<BmLocationEquipmentDTO> children;

}