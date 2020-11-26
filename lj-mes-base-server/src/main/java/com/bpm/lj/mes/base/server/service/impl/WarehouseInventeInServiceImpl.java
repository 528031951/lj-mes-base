package com.bpm.lj.mes.base.server.service.impl;

import com.bpm.lj.mes.base.common.util.ResultUtil;
import com.bpm.lj.mes.base.common.vo.PageInfoVO;
import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.dto.WarehouseInventeInDTO;
import com.bpm.lj.mes.base.server.mapper.base.WarehouseInventeInMapper;
import com.bpm.lj.mes.base.server.mapper.ext.WarehouseInventeInExtMapper;
import com.bpm.lj.mes.base.server.service.WarehouseInventeInService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WarehouseInventeInServiceImpl implements WarehouseInventeInService {
    @Resource
    private WarehouseInventeInMapper warehouseInventeInMapper;
    @Resource
    private WarehouseInventeInExtMapper warehouseInventeInExtMapper;
    @Override
    public ResultVO queryPageList(WarehouseInventeInDTO dto) {
        PageHelper.startPage(dto.getPageNum(), dto.getPageSize());
        List<WarehouseInventeInDTO> baseInventoryAttributesVos = warehouseInventeInExtMapper.queryPageList(dto);
        PageInfo<WarehouseInventeInDTO> pageInfo = new PageInfo<>(baseInventoryAttributesVos);
        PageInfoVO pageInfoVO = ResultUtil.successPageInfo();
        BeanUtils.copyProperties(pageInfo, pageInfoVO);
        pageInfoVO.setData(pageInfo.getList());
        return ResultUtil.success(pageInfoVO);
    }
}
