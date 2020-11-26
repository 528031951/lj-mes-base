package com.bpm.lj.mes.base.server.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 排班表
 */
@Data
@ApiModel(description = "排班表返回对象对象")
public class BaseSchedulingVo {
    private Integer id;

    /**
     * 创建时间

     */
    @ApiModelProperty("创建时间")
    private String formatTime;

    /**
     * 班组名称

     */
    @ApiModelProperty("班组名称")
    private String teamName;



    /**
     * 班次名称
     */
    @ApiModelProperty("班次名称")
    private String shiftName;
}