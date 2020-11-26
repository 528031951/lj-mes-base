package com.bpm.lj.mes.base.server.dto;

import com.bpm.lj.mes.base.common.dto.PageDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 班组表2
 */
@Data
@ApiModel(description = "班组表")
public class BaseTeamDTO extends PageDTO {
    private Integer id;

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
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createTime;

    /**
     * 修改时间
     */
    @ApiModelProperty("修改时间")
    private Date updateTime;

    /**
     * 线长ID
     */
    @ApiModelProperty("线长ID")
    private Long lineId;

    /**
     * 线长ID
     */
    @ApiModelProperty("是否启用 1是 0 否")
    private Integer status;
    /**
     * 修改人
     */
    @ApiModelProperty("修改人")
    private Long updateId;

    /**
     * 创建人
     */
    @ApiModelProperty("创建人")
    private Long createId;

    /**
     * 用户集合
     */
    @ApiModelProperty("用户集合")
    private List<Long> userIds;
    /**
     * 用户集合
     */
    @ApiModelProperty("工作中心集合")
    private List<Integer> workCenter;
}