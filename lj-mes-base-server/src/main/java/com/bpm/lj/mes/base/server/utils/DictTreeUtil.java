package com.bpm.lj.mes.base.server.utils;

import com.bpm.lj.mes.base.server.dto.DictTreeNode;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@ApiModel(description = "Tree树结构封装类")
public class DictTreeUtil {

    /**
     * 使用递归方法建树
     * @param treeNodes
     * @param parentId
     * @return
     */
    public static List<DictTreeNode> build(List<DictTreeNode> treeNodes, Long parentId) {
        List<DictTreeNode> trees = new ArrayList<DictTreeNode>();
        for (DictTreeNode treeNode : treeNodes) {
            if (treeNode.getParentId() == parentId) {
                //一级节点
                if (parentId==null) {
                    treeNode.setType("1");
                }
                trees.add(findChildren(treeNode,treeNodes));
            }
        }
        return trees;
    }

    /**
     * 递归查找子节点
     * @param treeNodes
     * @return
     */
    public static DictTreeNode findChildren(DictTreeNode treeNode, List<DictTreeNode> treeNodes) {
        /*for (DictTreeNode it : treeNodes) {
            if(treeNode.getId().equals(it.getParentId())) {
                if (treeNode.getChildren() == null) {
                    treeNode.setChildren(new ArrayList<DictTreeNode>());
                }
                treeNode.getChildren().add(findChildren(it,treeNodes));
            }
        }*/
        for (int i = 0; i < treeNodes.size(); i++) {
            DictTreeNode it = treeNodes.get(i);
            if (treeNode.getId().equals(it.getParentId())){
                //it为子节点
                it.setType((Integer.parseInt(treeNode.getType())+1)+"");
                if (treeNode.getChildren() == null) {
                    treeNode.setChildren(new ArrayList<DictTreeNode>());
                }
                treeNode.getChildren().add(findChildren(it,treeNodes));
            }
        }
        return treeNode;
    }

}




