package com.bpm.lj.mes.base.server.service.impl;

import com.bpm.lj.mes.base.common.util.ResultUtil;
import com.bpm.lj.mes.base.common.vo.PageInfoVO;
import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.domain.WarehouseBathNumQuery;
import com.bpm.lj.mes.base.server.domain.WarehouseNestingTask;
import com.bpm.lj.mes.base.server.domain.WarehouseNestingTaskDetails;
import com.bpm.lj.mes.base.server.dto.WarehouseNestingTaskDTO;
import com.bpm.lj.mes.base.server.mapper.base.WarehouseNestingTaskMapper;
import com.bpm.lj.mes.base.server.mapper.ext.WarehouseNestingTaskDetailsExtMapper;
import com.bpm.lj.mes.base.server.mapper.ext.WarehouseNestingTaskExtMapper;
import com.bpm.lj.mes.base.server.service.WarehouseNestingTaskService;
import com.bpm.lj.mes.base.server.vo.NestingTaskDetailsVo;
import com.bpm.lj.mes.base.server.vo.NestingTaskNumVo;
import com.bpm.lj.mes.base.server.vo.NestingTaskQueryVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class WarehouseNestingTaskServiceImpl implements WarehouseNestingTaskService {
    @Resource
    private WarehouseNestingTaskExtMapper warehouseNestingTaskExtMapper;
    @Resource
    private WarehouseNestingTaskMapper warehouseNestingTaskMapper;
    @Resource
    private WarehouseNestingTaskDetailsExtMapper warehouseNestingTaskDetailsExtMapper;

    @Override
    public ResultVO pageList(WarehouseNestingTaskDTO warehouseNestingTaskDTO) {
        PageHelper.startPage(warehouseNestingTaskDTO.getPageNum(), warehouseNestingTaskDTO.getPageSize());
        List<WarehouseNestingTaskDTO> baseInventoryAttributesVos = warehouseNestingTaskExtMapper.pageList(warehouseNestingTaskDTO);
        PageInfo<WarehouseNestingTaskDTO> pageInfo = new PageInfo<>(baseInventoryAttributesVos);
        PageInfoVO pageInfoVO = ResultUtil.successPageInfo();
        BeanUtils.copyProperties(pageInfo, pageInfoVO);
        pageInfoVO.setData(pageInfo.getList());
        return ResultUtil.success(pageInfoVO);
    }

    @Override
    public ResultVO updateStatus(Integer id) {
        WarehouseNestingTask warehouseNestingTask = new WarehouseNestingTask();
        warehouseNestingTask.setId(id);
        warehouseNestingTask.setTaskStatus(2);
        warehouseNestingTaskMapper.updateByPrimaryKeySelective(warehouseNestingTask);
        return ResultUtil.success();
    }

    //物料详情
    @Override
    public ResultVO details(Integer id) {
        WarehouseNestingTask warehouseNestingTask = warehouseNestingTaskMapper.selectByPrimaryKey(id);
        NestingTaskDetailsVo nestingTaskDetailsVo = new NestingTaskDetailsVo();

        List<WarehouseNestingTaskDetails> warehouseNestingTaskDetails = warehouseNestingTaskDetailsExtMapper.setailsList(id);
        nestingTaskDetailsVo.setWarehouseNestingTaskDetails(warehouseNestingTaskDetails);
        for (WarehouseNestingTaskDetails details : warehouseNestingTaskDetails) {
            NestingTaskQueryVo nestingTaskQueryVo = new NestingTaskQueryVo();
            nestingTaskQueryVo.setBatchNo(warehouseNestingTask.getBatchNo());
            nestingTaskQueryVo.setMaterialName(details.getMaterialName());
            Integer integer = warehouseNestingTaskDetailsExtMapper.queryIsSet(nestingTaskQueryVo);
            if (integer == 0) {
                nestingTaskDetailsVo.setIsSet(0);
            } else {
                nestingTaskDetailsVo.setIsSet(1);
            }
        }
        return ResultUtil.success(nestingTaskDetailsVo);
    }

    @Override
    public ResultVO taskDetails(Integer id) {
        WarehouseNestingTask warehouseNestingTask = warehouseNestingTaskMapper.selectByPrimaryKey(id);
        return ResultUtil.success(warehouseNestingTask);
    }

    @Override
    public ResultVO urgent(List<Integer> ids) {
        warehouseNestingTaskDetailsExtMapper.urgent(ids);
        return ResultUtil.success();
    }

    @Override
    public ResultVO setDetails(Integer id) {
        WarehouseNestingTask warehouseNestingTask = warehouseNestingTaskMapper.selectByPrimaryKey(id);
        List<WarehouseNestingTaskDetails> warehouseNestingTaskDetails = warehouseNestingTaskDetailsExtMapper.setailsList(id);
        List<NestingTaskQueryVo> list = new ArrayList<>();
        for (WarehouseNestingTaskDetails details : warehouseNestingTaskDetails) {
            NestingTaskQueryVo nestingTaskQueryVo = new NestingTaskQueryVo();
            nestingTaskQueryVo.setBatchNo(warehouseNestingTask.getBatchNo());
            nestingTaskQueryVo.setMaterialName(details.getMaterialName());
            nestingTaskQueryVo.setDetailId(details.getId());
            //查询判断是否锁定齐套
            Integer integer = warehouseNestingTaskDetailsExtMapper.queryIsSet(nestingTaskQueryVo);
            //查询锁定数量/未锁数量
            List<NestingTaskQueryVo> queryVoList = warehouseNestingTaskDetailsExtMapper.queryNlockedNum(nestingTaskQueryVo);
            if (integer != 0 && queryVoList.size() > 0) {
                nestingTaskQueryVo.setNlockedNum(queryVoList.get(0).getNlockedNum());
                nestingTaskQueryVo.setInventoryNlockedNum(queryVoList.get(0).getInventoryNlockedNum());
                list.add(nestingTaskQueryVo);
            }
        }
        return ResultUtil.success(list);
    }

    @Override
    public ResultVO selectChoose(String materialName) {
        NestingTaskQueryVo nestingTaskQueryVo = new NestingTaskQueryVo();
        nestingTaskQueryVo.setMaterialName(materialName);
        List<WarehouseBathNumQuery> warehouseBathNumQueries = warehouseNestingTaskDetailsExtMapper.queryChoose(nestingTaskQueryVo);
        return ResultUtil.success(warehouseBathNumQueries);

    }

    @Override
    public ResultVO confirm(NestingTaskNumVo vo) {
        warehouseNestingTaskDetailsExtMapper.updateDetailNum(vo);
        warehouseNestingTaskDetailsExtMapper.updateNum(vo);
        return ResultUtil.success();
    }
}
