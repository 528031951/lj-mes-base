package com.bpm.lj.mes.base.server.service.impl;

import com.bpm.lj.mes.base.common.util.ResultUtil;
import com.bpm.lj.mes.base.common.vo.PageInfoVO;
import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.domain.WarehouseTaskTimeSet;
import com.bpm.lj.mes.base.server.dto.WarehouseTaskTimeSetDTO;
import com.bpm.lj.mes.base.server.mapper.base.WarehouseTaskTimeSetMapper;
import com.bpm.lj.mes.base.server.mapper.ext.WarehouseTaskTimeSetExtMapper;
import com.bpm.lj.mes.base.server.service.WarehouseTaskTimeSetService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WarehouseTaskTimeSetServiceImpl implements WarehouseTaskTimeSetService {
   @Resource
   private WarehouseTaskTimeSetMapper warehouseTaskTimeSetMapper;
    @Resource
    private WarehouseTaskTimeSetExtMapper warehouseTaskTimeSetExtMapper;
    @Override
    public ResultVO quepageList(WarehouseTaskTimeSetDTO dto) {
        PageHelper.startPage(dto.getPageNum(), dto.getPageSize());
        List<WarehouseTaskTimeSetDTO> baseInventoryAttributesVos = warehouseTaskTimeSetExtMapper.quepageList(dto);
        PageInfo<WarehouseTaskTimeSetDTO> pageInfo = new PageInfo<>(baseInventoryAttributesVos);
        PageInfoVO pageInfoVO = ResultUtil.successPageInfo();
        BeanUtils.copyProperties(pageInfo, pageInfoVO);
        pageInfoVO.setData(pageInfo.getList());
        return ResultUtil.success(pageInfoVO);
    }

    @Override
    public ResultVO addWarehouseTaskTime(WarehouseTaskTimeSetDTO dto) {
        WarehouseTaskTimeSet warehouseTaskTimeSet = new WarehouseTaskTimeSet();
        BeanUtils.copyProperties(dto,warehouseTaskTimeSet);
        if(dto.getId() == null){
            warehouseTaskTimeSetMapper.insertSelective(warehouseTaskTimeSet);
        }else{
            warehouseTaskTimeSetMapper.updateByPrimaryKeySelective(warehouseTaskTimeSet);
        }
        return null;
    }

    @Override
    public ResultVO deleted(Integer id) {
        warehouseTaskTimeSetMapper.deleteByPrimaryKey(id);
        return ResultUtil.success();
    }
}
