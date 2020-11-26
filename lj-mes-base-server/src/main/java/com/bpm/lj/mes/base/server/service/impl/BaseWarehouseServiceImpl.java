package com.bpm.lj.mes.base.server.service.impl;

import com.bpm.lj.mes.base.common.util.ResultUtil;
import com.bpm.lj.mes.base.common.vo.PageInfoVO;
import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.domain.BaseDictionaryMaintenance;
import com.bpm.lj.mes.base.server.domain.BaseWarehouse;
import com.bpm.lj.mes.base.server.dto.BaseWarehouseDTO;
import com.bpm.lj.mes.base.server.dto.DictTreeNode;
import com.bpm.lj.mes.base.server.mapper.base.BaseDictionaryMaintenanceMapper;
import com.bpm.lj.mes.base.server.mapper.base.BaseWarehouseMapper;
import com.bpm.lj.mes.base.server.mapper.ext.BaseWarehouseExtMapper;
import com.bpm.lj.mes.base.server.service.BaseWarehouseService;
import com.bpm.lj.mes.base.server.vo.DeptVo;
import com.bpm.lj.mes.base.server.vo.WarehousePrintingVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/***
 * @ClassName: BaseDepotManagementServiceImpl
 * @Description: 库存管理
 * @Auther: tianjian
 * @Date: 2020/6/2 15:53
 * @version : V1.0
 */
@Service
public class BaseWarehouseServiceImpl implements BaseWarehouseService {

    @Autowired
    BaseWarehouseMapper baseDepotManagementMapper;

    @Autowired
    BaseWarehouseExtMapper baseDepotManagementExtMapper;
    @Autowired
    BaseDictionaryMaintenanceMapper baseDictionaryMaintenanceMapper;

   /* @Autowired
    BaseRegionMapper baseRegionMapper;

    @Autowired
    BaseShelvesMapper baseShelvesMapper;

    @Autowired
    BaseHighLevelRackMapper baseHighLevelRackMapper;*/

    @Override
    /**
     * @MethodName: addBaseDepotManagement
     * @Description: 添加库存/储位
     * @Param: [baseDepotManagementDTO]
     * @Return: com.bpm.gd.wms.base.common.vo.ResultVO
     * @Author: tianjian
     * @Date: 2020/6/2
     **/

    public ResultVO addBaseDepotManagement(BaseWarehouseDTO baseDepotManagementDTO) {
        String erpLocation = null;
        if (StringUtils.isNotEmpty(baseDepotManagementDTO.getErpWarehouseCode())) {
            erpLocation = baseDepotManagementExtMapper.erpLocation(baseDepotManagementDTO.getErpWarehouseCode());
        }
        BaseWarehouse baseDepotManagement = new BaseWarehouse();
        BeanUtils.copyProperties(baseDepotManagementDTO, baseDepotManagement);
        baseDepotManagement.setErpWarehouseName(erpLocation);
        if (baseDepotManagement.getPId() != null) {
            baseDepotManagement.setPId(baseDepotManagementDTO.getPId());
        } else {
            baseDepotManagement.setPId(null);
        }
        try {
            baseDepotManagement.setCreateTime(new Date());
            baseDepotManagementMapper.insertSelective(baseDepotManagement);
            if (null != baseDepotManagementDTO.getDictionariesId()) {
                BaseDictionaryMaintenance baseDictionaryMaintenance = new BaseDictionaryMaintenance();
                baseDictionaryMaintenance.setCreateTime(new Date());
                baseDictionaryMaintenance.setCode(baseDepotManagement.getErpWarehouseCode());
                baseDictionaryMaintenance.setName(baseDepotManagement.getErpWarehouseName());
                baseDictionaryMaintenance.setParentId(baseDepotManagementDTO.getDictionariesId());
                baseDictionaryMaintenanceMapper.insertSelective(baseDictionaryMaintenance);
            }


        } catch (Exception e) {
            return ResultUtil.error("数据字典id已有，请重新添加");
        }
        return ResultUtil.success();
    }


    @Override
    /**
     * @MethodName: updateBaseDepotManagement
     * @Description: 修改库存/储位
     * @Param: [baseDepotManagementDTO]
     * @Return: com.bpm.gd.wms.base.common.vo.ResultVO
     * @Author: tianjian
     * @Date: 2020/6/2
     **/
    public ResultVO updateBaseDepotManagement(BaseWarehouseDTO baseDepotManagementDTO) {

        String erpLocation = "";
        if (StringUtils.isNotEmpty(baseDepotManagementDTO.getErpWarehouseCode())) {
            erpLocation = baseDepotManagementExtMapper.erpLocation(baseDepotManagementDTO.getErpWarehouseCode());
        }
        BaseWarehouse baseDepotManagement = new BaseWarehouse();
        BeanUtils.copyProperties(baseDepotManagementDTO, baseDepotManagement);
        baseDepotManagement.setErpWarehouseName(erpLocation);
        baseDepotManagement.setUpdateTime(new Date());
        int i = baseDepotManagementMapper.updateByPrimaryKeySelective(baseDepotManagement);
        if (baseDepotManagementDTO.getErpWarehouseCode() != null) {

            baseDepotManagementExtMapper.updateType(baseDepotManagementDTO);
        }
        return ResultUtil.success(i);
    }

    @Override
    /**
     * @MethodName: deleteBaseDepotManagement
     * @Description: 删除库存/储位
     * @Param: [id]
     * @Return: com.bpm.gd.wms.base.common.vo.ResultVO
     * @Author: tianjian
     * @Date: 2020/6/2
     **/
    public ResultVO deleteBaseDepotManagement(Long id) {
        int count = baseDepotManagementExtMapper.findDownNodeCount(id);
        if (count != 0) {
            return ResultUtil.error("该节点下面还有节点,禁止删除");
        }
        int i = baseDepotManagementMapper.deleteByPrimaryKey(id.intValue());
        return ResultUtil.success(i);
    }

    @Override
    /**
     * @MethodName: findBaseDepotManagements
     * @Description: 查询库存/储位
     * @Param: []
     * @Return: com.bpm.gd.wms.base.common.vo.ResultVO
     * @Author: tianjian
     * @Date: 2020/6/2
     **/
    public ResultVO findBaseDepotManagements(Integer id) {
        DictTreeNode dictTreeNode = new DictTreeNode();
        if (id != 0) {
            dictTreeNode.setParentId(id.longValue());
        }
        List<DictTreeNode> tree = baseDepotManagementExtMapper.findTree(dictTreeNode);
        for (DictTreeNode treeNode : tree) {
            if (StringUtils.isNotEmpty(treeNode.getErpWarehouseCode())) {
                List<Integer> treeId = baseDepotManagementExtMapper.findTreeId(treeNode.getErpWarehouseCode());
                if (treeId.size() > 0) {
                    treeNode.setDictionariesId(treeId.get(0));
                }

            }

        }
//        tree.forEach(tre -> {
//            DictTreeNode node = new DictTreeNode();
//            node.setParentId(tre.getId());
//            List<DictTreeNode> mapperTree = baseDepotManagementExtMapper.findTree(node);
//            tre.setChildren(mapperTree);
//        });
//        List<DictTreeNode> dictTreeNodes = recursiveTree(dictTreeNode);
        return ResultUtil.success(tree);
    }

    //递归树结构
   /* public List<DictTreeNode> recursiveTree(DictTreeNode dictTreeNode) {

        //查询节点
        DictTreeNode dto = new DictTreeNode();

        List<DictTreeNode> dictTreeNodes = baseDepotManagementExtMapper.findTree(dictTreeNode);
        for (DictTreeNode node : dictTreeNodes) {
            dto.setParentId(node.getId());
            List<DictTreeNode> treeNodes = recursiveTree(dto);
            if (!treeNodes.isEmpty()) {
                for (DictTreeNode treeNode : treeNodes) {
                    node.getChildren().add(treeNode);
                }

            }
        }
        return dictTreeNodes;
    }*/

    @Override
    /**
     * @MethodName: findBaseDepotManagementByPersonId
     * @Description: 根据父节点ID查询所有子节点数据
     * @Param: [PersonId]
     * @Return: com.bpm.gd.wms.base.common.vo.ResultVO
     * @Author: admin
     * @Date: 2020/6/17
     **/
    public ResultVO findBaseDepotManagementByParentId(Long parentId) {
        List<BaseWarehouseDTO> baseDepotManagementDTOS = baseDepotManagementExtMapper.findByParentId(parentId);
        return ResultUtil.success(baseDepotManagementDTOS);
    }

    @Override
    /**
     * @MethodName: printBaseDepotManagements
     * @Description: 查询出所有储位进行打印
     * @Param: []
     * @Return: com.bpm.gd.wms.base.common.vo.ResultVO
     * @Author: admin
     * @Date: 2020/6/17
     **/
    public ResultVO printBaseDepotManagements() {
        List<BaseWarehouseDTO> baseDepotManagementDTOS = baseDepotManagementExtMapper.print();
        return ResultUtil.success(baseDepotManagementDTOS);
    }

    @Override
    public ResultVO warehousePrinting(WarehousePrintingVo dto) {
        PageHelper.startPage(dto.getPageNum(), dto.getPageSize());
        List<WarehousePrintingVo> warehousePrintingVos = baseDepotManagementExtMapper.warehousePrinting(dto);
        PageInfo<WarehousePrintingVo> pageInfo = new PageInfo<>(warehousePrintingVos);
        PageInfoVO pageInfoVO = ResultUtil.successPageInfo();
        BeanUtils.copyProperties(pageInfo, pageInfoVO);
        pageInfoVO.setData(pageInfo.getList());
        return ResultUtil.success(pageInfoVO);
    }

    @Override
    public ResultVO locationList(Integer type) {
        List<WarehousePrintingVo> warehousePrintingVos = baseDepotManagementExtMapper.locationList(type);
        return ResultUtil.success(warehousePrintingVos);
    }

    @Override
    public ResultVO erpLocationList(DeptVo vo) {
        List<DeptVo> deptVos = baseDepotManagementExtMapper.erpLocationList(vo);
        return ResultUtil.success(deptVos);
    }

    @Override
    public ResultVO typeList() {

        List<DeptVo> deptVos = baseDepotManagementExtMapper.typeList();
        return ResultUtil.success(deptVos);
    }

    @Override
    /**
     * @MethodName: findBaseDepotManagementsById
     * @Description: 根据id查找储位信息
     * @Param: [id]
     * @Return: com.bpm.gd.wms.base.common.vo.ResultVO
     * @Author: tianjian
     * @Date: 2020/6/17
     **/
    public ResultVO findBaseDepotManagementById(Long id) {
        BaseWarehouse baseDepotManagement = baseDepotManagementMapper.selectByPrimaryKey(id.intValue());
        BaseWarehouseDTO baseDepotManagementDTO = new BaseWarehouseDTO();
        BeanUtils.copyProperties(baseDepotManagement, baseDepotManagementDTO);
        return ResultUtil.success(baseDepotManagementDTO);
    }

}
