package com.bpm.lj.mes.base.server.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class ProcessDrawingsVo {

    /**
     * 图纸类型，0：工艺图纸，1：工艺卡
     */
    @ApiModelProperty("图纸类型，0：工艺图纸，1：工艺卡")
    private Integer drawingType;
    /**
     * 工艺图纸外键ID
     */
    @ApiModelProperty("工艺图纸外键ID")
    private Integer pdId;
    /**
     * 图纸存放路径
     */
    @ApiModelProperty("图纸存放路径")
    private String drawingPath;
    private List<String> drawingPaths;


}
