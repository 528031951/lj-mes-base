package com.bpm.lj.mes.base.server.service.impl;

import com.bpm.lj.mes.base.common.util.ResultUtil;
import com.bpm.lj.mes.base.common.vo.PageInfoVO;
import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.domain.BaseMaterialPostion;
import com.bpm.lj.mes.base.server.mapper.base.BaseMaterialPostionMapper;
import com.bpm.lj.mes.base.server.mapper.ext.BaseMaterialPostionExtMapper;
import com.bpm.lj.mes.base.server.service.BaseMaterialPostionService;
import com.bpm.lj.mes.base.server.vo.BaseMaterialPostionVo;
import com.bpm.lj.mes.base.server.vo.MaterialPostionExcel;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BaseMaterialPostionServiceImpl implements BaseMaterialPostionService {
    @Resource
    private BaseMaterialPostionMapper baseMaterialPostionMapper;
    @Resource
    private BaseMaterialPostionExtMapper baseMaterialPostionExtMapper;

    @Override
    public ResultVO pageList(BaseMaterialPostionVo vo) {
        PageHelper.startPage(vo.getPageNum(), vo.getPageSize());
        List<BaseMaterialPostionVo> baseInventoryAttributesVos = baseMaterialPostionExtMapper.pageList(vo);
        PageInfo<BaseMaterialPostionVo> pageInfo = new PageInfo<>(baseInventoryAttributesVos);
        PageInfoVO pageInfoVO = ResultUtil.successPageInfo();
        BeanUtils.copyProperties(pageInfo, pageInfoVO);
        pageInfoVO.setData(pageInfo.getList());
        return ResultUtil.success(pageInfoVO);
    }

    @Override
    public List<BaseMaterialPostionVo> excelList(BaseMaterialPostionVo vo) {
        PageHelper.startPage(vo.getPageNum(), vo.getPageSize());
        List<BaseMaterialPostionVo> baseInventoryAttributesVos = baseMaterialPostionExtMapper.pageList(vo);
        PageInfo<BaseMaterialPostionVo> pageInfo = new PageInfo<>(baseInventoryAttributesVos);
        PageInfoVO pageInfoVO = ResultUtil.successPageInfo();
        BeanUtils.copyProperties(pageInfo, pageInfoVO);
        pageInfoVO.setData(pageInfo.getList());
        return pageInfo.getList();
    }

    @Override
    public ResultVO addMaterialPostion(BaseMaterialPostion vo) {
        if (vo.getId() == null) {
            baseMaterialPostionMapper.insertSelective(vo);
        } else {
            baseMaterialPostionMapper.updateByPrimaryKeySelective(vo);
        }
        return ResultUtil.success();
    }

    @Override
    public ResultVO deleted(Integer id) {
        baseMaterialPostionMapper.deleteByPrimaryKey(id);
        return ResultUtil.success();
    }

    @Override
    public ResultVO materialPostionList() {
        List<BaseMaterialPostionVo> material = baseMaterialPostionExtMapper.material();
        List<BaseMaterialPostionVo> postionList = baseMaterialPostionExtMapper.postionList();
        Map<String, List<BaseMaterialPostionVo>> map = new HashMap<>();
        map.put("material", material);
        map.put("postionList", postionList);
        return ResultUtil.success(map);
    }

    @Override
    public ResultVO addExcelProcessTime(List<MaterialPostionExcel> excelList) {
        for (MaterialPostionExcel baseMaterialPostionExcel : excelList) {
            Integer integer = baseMaterialPostionExtMapper.warehouseIdByCode(baseMaterialPostionExcel.getCposCode());
            Integer idByCode = baseMaterialPostionExtMapper.inventoryIdByCode(baseMaterialPostionExcel.getCinvCode());
            BaseMaterialPostion baseMaterialPostion = new BaseMaterialPostion();
            if (integer != null) {
                baseMaterialPostion.setMaterialId(idByCode);
            }
            if (idByCode != null) {
                baseMaterialPostion.setPostionId(integer);
            }
            baseMaterialPostionMapper.insertSelective(baseMaterialPostion);
        }
        return ResultUtil.success();
    }
}
