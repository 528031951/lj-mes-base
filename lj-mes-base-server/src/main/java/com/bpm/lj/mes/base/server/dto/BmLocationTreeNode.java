package com.bpm.lj.mes.base.server.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Title: BmEqmentTreeNode</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2020/4/6 8:59 下午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
@Data
@ApiModel(description = "Tree对象")
public class BmLocationTreeNode {
    @ApiModelProperty(value = "节点id")
    protected  Integer id;

    @ApiModelProperty(value = "节点父id")
    protected  Integer pId;

    @ApiModelProperty(value = "节点名称")
    protected  String name;

    @ApiModelProperty("设备编码")
    private String code;
    @ApiModelProperty("类型")
    private Integer type;

    @ApiModelProperty("排序")
    private Integer sort;


    @ApiModelProperty(value = "子节点集合")
    List<BmLocationTreeNode> children = new ArrayList<BmLocationTreeNode>();
    List<List<BmLocationTreeNode>> nodeList = new ArrayList<>();


}
