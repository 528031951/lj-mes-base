package com.bpm.lj.mes.base.server.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/***
 * @ClassName: DictTreeNode
 * @Description: 树
 * @Auther: tianjian
 * @Date: 2020/5/29 20:56
 * @version : V1.0
 */
@Data
@ApiModel(description = "Tree对象")
public class DictTreeNode {

    @ApiModelProperty(value = "节点id")
    protected Long id;

    /**
     * 库存/储位名字
     */
    @ApiModelProperty(value = "库存/储位名字")
    private String storageLocationName;

    @ApiModelProperty(value = "节点等级(1:一级节点最高 2:二级节点 3:三级节点 4:四级节点最低)")
    private String type;
    private String erpWarehouseCode;
    private String erpWarehouseName;

    /**
     * 储位编码
     */
    @ApiModelProperty(value = "储位编码")
    private String storageLocationCod;

    /**
     * 父级id
     */
    @ApiModelProperty(value = "父级id")
    private Long parentId;
    private Integer dictionariesId;

    /**
     * 盒子数量
     */
    @ApiModelProperty(value = "盒子数量")
    private Long boxNumber;

    @ApiModelProperty(value = "子节点集合")
    protected List<DictTreeNode> children = new ArrayList<DictTreeNode>();
}
