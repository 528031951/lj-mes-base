package com.bpm.lj.mes.base.server.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Data
@ApiModel(description = "Tree对象")
public class DictionaryMaintenanceTreeNode {

    @ApiModelProperty(value = "节点id")
    protected Integer id;

    @ApiModelProperty(value = "节点父id")
    protected Integer parentId;

    @ApiModelProperty(value = "节点编码")
    protected String code;

    @ApiModelProperty(value = "节点名称")
    protected String name;

    @ApiModelProperty(value = "状态")
    protected Integer status;

    @ApiModelProperty(value = "创建时间")
    protected Timestamp createTime;

    @ApiModelProperty(value = "子节点集合")
    protected List<DictionaryMaintenanceTreeNode> children = new ArrayList<DictionaryMaintenanceTreeNode>();
}