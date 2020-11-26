package com.bpm.lj.mes.base.server.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @Author Super Young
 * @Date 2020/7/1 17:47
 */
@Data
@ApiModel(description = "区域")
public class BaseRegion {

    @ApiModelProperty(value = "主键ID")
    private Long id;

    @ApiModelProperty(value = "区域名称")
    private String regionName;

    @ApiModelProperty(value = "区域编码")
    private String regionNo;

    @ApiModelProperty(value = "区域")
    private String regionLocate;

    @ApiModelProperty(value = "位置")
    private String regionLocateNo;

    @ApiModelProperty(value = "区域面积")
    private String regionArea;

    @ApiModelProperty(value = "创建时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    @ApiModelProperty(value = "创建人id")
    private Long creatorId;

    @ApiModelProperty(value = "更新人id")
    private Long updatorId;

    @ApiModelProperty(value = "baseDepotManagement的主键id")
    private Long treeId;
}
