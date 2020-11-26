package com.bpm.lj.mes.base.server.util;

import com.bpm.lj.mes.base.server.vo.DictionaryMaintenanceTreeNode;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@ApiModel(description = "Tree树结构封装类")
public class DictionaryMaintenanceTreeUtil {


    /**
     * 单个建树
     *
     * @param dictionaryMaintenanceTreeNodes
     * @param treeNode
     * @return
     */

    public static List<DictionaryMaintenanceTreeNode> oneBuild(List<DictionaryMaintenanceTreeNode> dictionaryMaintenanceTreeNodes, DictionaryMaintenanceTreeNode treeNode) {
        List<DictionaryMaintenanceTreeNode> trees = new ArrayList<DictionaryMaintenanceTreeNode>();
        if (treeNode.getParentId() == null) {
            trees.add(findChildren(treeNode, dictionaryMaintenanceTreeNodes));
        }
        return trees;
    }

    /**
     * 使用递归方法建树
     *
     * @param dictionaryMaintenanceTreeNodes
     * @param parentId
     * @return
     */
    public static List<DictionaryMaintenanceTreeNode> build(List<DictionaryMaintenanceTreeNode> dictionaryMaintenanceTreeNodes, Integer parentId) {
        List<DictionaryMaintenanceTreeNode> trees = new ArrayList<DictionaryMaintenanceTreeNode>();
        for (DictionaryMaintenanceTreeNode dictionaryMaintenanceTreeNode : dictionaryMaintenanceTreeNodes) {
            if (dictionaryMaintenanceTreeNode.getParentId() == null) {
                trees.add(findChildren(dictionaryMaintenanceTreeNode, dictionaryMaintenanceTreeNodes));
            }
        }
        return trees;
    }

    /**
     * 递归查找子节点
     *
     * @param dictionaryMaintenanceTreeNodes
     * @return
     */
    public static DictionaryMaintenanceTreeNode findChildren(DictionaryMaintenanceTreeNode dictionaryMaintenanceTreeNode, List<DictionaryMaintenanceTreeNode> dictionaryMaintenanceTreeNodes) {
        for (DictionaryMaintenanceTreeNode it : dictionaryMaintenanceTreeNodes) {
            if (dictionaryMaintenanceTreeNode.getId().equals(it.getParentId())) {
                dictionaryMaintenanceTreeNode.setStatus(null);
                if (dictionaryMaintenanceTreeNode.getChildren() == null) {
                    dictionaryMaintenanceTreeNode.setChildren(new ArrayList<DictionaryMaintenanceTreeNode>());
                }
                dictionaryMaintenanceTreeNode.getChildren().add(findChildren(it, dictionaryMaintenanceTreeNodes));
            }
        }
        return dictionaryMaintenanceTreeNode;
    }
}




