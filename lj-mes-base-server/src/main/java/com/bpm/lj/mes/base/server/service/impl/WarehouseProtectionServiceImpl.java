package com.bpm.lj.mes.base.server.service.impl;

import com.bpm.lj.mes.base.common.util.ResultUtil;
import com.bpm.lj.mes.base.common.vo.PageInfoVO;
import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.domain.WarehouseProtectionGroup;
import com.bpm.lj.mes.base.server.dto.WarehouseProtectionDTO;
import com.bpm.lj.mes.base.server.mapper.base.WarehouseProtectionGroupMapper;
import com.bpm.lj.mes.base.server.mapper.base.WarehouseProtectionMapper;
import com.bpm.lj.mes.base.server.mapper.ext.WarehouseProtectionExtMapper;
import com.bpm.lj.mes.base.server.service.WarehouseProtectionService;
import com.bpm.lj.mes.base.server.vo.WarehouseProtectionVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class WarehouseProtectionServiceImpl implements WarehouseProtectionService {
    @Resource
    private WarehouseProtectionExtMapper warehouseProtectionExtMapper;
    @Resource
    private WarehouseProtectionMapper warehouseProtectionMapper;
    @Resource
    private WarehouseProtectionGroupMapper warehouseProtectionGroupMapper;
    @Override
    public ResultVO selectPageList(WarehouseProtectionDTO dto) {
        PageHelper.startPage(dto.getPageNum(), dto.getPageSize());
        List<WarehouseProtectionVo> warehouseProtectionVos = warehouseProtectionExtMapper.selectPageList(dto);
        PageInfo<WarehouseProtectionVo> pageInfo = new PageInfo<>(warehouseProtectionVos);
        PageInfoVO pageInfoVO = ResultUtil.successPageInfo();
        BeanUtils.copyProperties(pageInfo, pageInfoVO);
        pageInfoVO.setData(pageInfo.getList());
        return ResultUtil.success(pageInfoVO);
    }

    @Override
    public ResultVO addProtectionGroup(WarehouseProtectionVo vo) {
        WarehouseProtectionGroup warehouseProtectionGroup = new WarehouseProtectionGroup();
        warehouseProtectionGroup.setApplyNum(vo.getApplyNum());
        warehouseProtectionGroup.setGrandDate(new Date());
        warehouseProtectionGroup.setGrandNum(vo.getGrandNum());
        warehouseProtectionGroup.setCreaterId(vo.getId());
        warehouseProtectionGroup.setDeptId(vo.getDeptId());
        warehouseProtectionGroupMapper.insertSelective(warehouseProtectionGroup);
        return ResultUtil.success();
    }

    @Override
    public ResultVO deleted(Integer id) {
        warehouseProtectionMapper.deleteByPrimaryKey(id);
        return ResultUtil.success();
    }
}
