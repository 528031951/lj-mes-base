package com.bpm.lj.mes.base.server.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 班组表2
 */
@Data
@ApiModel(description = "班组表")
public class BaseTeamVo {
    private Long id;

    /**
     * 班组名称

     */
    @ApiModelProperty("班组名称")
    private String teamName;

    /**
     * 班组编号

     */
    @ApiModelProperty("班组编号")
    private String teamCode;


    /**
     * 修改时间

     */
    @ApiModelProperty("修改时间")
    private Date updateTime;
    /**
     * 修改时间

     */
    @ApiModelProperty("是否启用 1是  0 否")
    private Integer status;
    @ApiModelProperty("线长ID")
    private Long lineId;


}