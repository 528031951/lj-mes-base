package com.bpm.lj.mes.base.server.mapper.ext;

import com.bpm.lj.mes.base.server.domain.BaseWarehouse;
import com.bpm.lj.mes.base.server.dto.BaseWarehouseDTO;
import com.bpm.lj.mes.base.server.dto.DictTreeNode;
import com.bpm.lj.mes.base.server.vo.DeptVo;
import com.bpm.lj.mes.base.server.vo.WarehousePrintingVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/***
 * @ClassName: BaseDepotManagementExtMapper
 * @Description: 库存管理
 * @Auther: tianjian
 * @Date: 2020/6/2 16:02
 * @version : V1.0
 */
public interface BaseWarehouseExtMapper {
    List<DictTreeNode> findTree(DictTreeNode dictTreeNode);

    List<Integer> findTreeId(String str);

    List<BaseWarehouseDTO> findByParentId(@Param(value = "parentId") Long parentId);

    List<BaseWarehouseDTO> print();

    List<BaseWarehouseDTO> findByGrade(String grade);

    int findDownNodeCount(Long id);

    List<BaseWarehouse> selectByParentId(Long parentId);

    List<WarehousePrintingVo> warehousePrinting(WarehousePrintingVo dto);

    List<WarehousePrintingVo> locationList(Integer type);

    List<DeptVo> erpLocationList(DeptVo vo);

    String erpLocation(String code);

    List<DeptVo> typeList();

    void updateType(BaseWarehouseDTO dto);
}
