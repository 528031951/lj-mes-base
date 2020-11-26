package com.bpm.lj.mes.base.server.service.impl;

import com.bpm.lj.mes.base.common.util.ResultUtil;
import com.bpm.lj.mes.base.common.vo.PageInfoVO;
import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.domain.BaseBatchBom;
import com.bpm.lj.mes.base.server.domain.BomOpcomponent;
import com.bpm.lj.mes.base.server.dto.BaseBatchBomDTO;
import com.bpm.lj.mes.base.server.mapper.base.BaseBatchBomMapper;
import com.bpm.lj.mes.base.server.mapper.base.BomOpcomponentMapper;
import com.bpm.lj.mes.base.server.mapper.ext.BaseBatchBomExtMapper;
import com.bpm.lj.mes.base.server.service.BaseBatchBomService;
import com.bpm.lj.mes.base.server.vo.BaseBatchBomExcel;
import com.bpm.lj.mes.base.server.vo.BaseBatchBomVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BaseBatchBomServiceImpl implements BaseBatchBomService {
    @Resource
    private BaseBatchBomMapper baseBatchBomMapper;
    @Resource
    private BaseBatchBomExtMapper baseBatchBomExtMapper;
    @Resource
    private BomOpcomponentMapper bomOpcomponentMapper;

    @Override
    public ResultVO pageList(BaseBatchBomDTO dto) {
        PageHelper.startPage(dto.getPageNum(), dto.getPageSize());
        List<BaseBatchBomVo> baseBatchBomVos = baseBatchBomExtMapper.pageList(dto);
        PageInfo<BaseBatchBomVo> pageInfo = new PageInfo<>(baseBatchBomVos);
        PageInfoVO pageInfoVO = ResultUtil.successPageInfo();
        BeanUtils.copyProperties(pageInfo, pageInfoVO);
        pageInfoVO.setData(pageInfo.getList());
        return ResultUtil.success(pageInfoVO);
    }

    @Override
    public ResultVO bomList(BaseBatchBomVo vo) {
        PageHelper.startPage(vo.getPageNum(), vo.getPageSize());
        if ("".equals(vo.getCInvCode())) {
            vo.setCInvCode(null);
        }
        List<BaseBatchBomVo> baseBatchBomVos = baseBatchBomExtMapper.bomList(vo);
        PageInfo<BaseBatchBomVo> pageInfo = new PageInfo<>(baseBatchBomVos);
        PageInfoVO pageInfoVO = ResultUtil.successPageInfo();
        BeanUtils.copyProperties(pageInfo, pageInfoVO);
        pageInfoVO.setData(pageInfo.getList());
        return ResultUtil.success(pageInfoVO);

    }

    @Override
    public ResultVO bindingBom(Integer id, Integer bomId) {
        BaseBatchBom baseBatchBom = new BaseBatchBom();
        baseBatchBom.setId(id);
        baseBatchBom.setBomId(bomId.toString());
        baseBatchBomMapper.updateByPrimaryKeySelective(baseBatchBom);
        return ResultUtil.success();
    }

    @Override
    public ResultVO chrildBom(Integer bomId) {
        List<BomOpcomponent> bomOpcomponents = baseBatchBomExtMapper.chrildBomList(bomId);
        return ResultUtil.success(bomOpcomponents);
    }

    @Override
    public ResultVO addBom(BomOpcomponent bomOpcomponent) {
        if (bomOpcomponent.getAutoid() == null) {
            bomOpcomponentMapper.insertSelective(bomOpcomponent);
        } else {
            bomOpcomponentMapper.updateByPrimaryKeySelective(bomOpcomponent);
        }
        return ResultUtil.success();
    }

    @Override
    public ResultVO deleteBom(List<Integer> id) {
        for (Integer integer : id) {
            bomOpcomponentMapper.deleteByPrimaryKey(integer);
        }
        return ResultUtil.success();
    }

    @Override
    public ResultVO componentList(String name) {
        BaseBatchBomVo baseBatchBomVo = new BaseBatchBomVo();
        baseBatchBomVo.setCCode(name);
        baseBatchBomVo.setPageSize(1000);
        List<String> componentCodeList = baseBatchBomExtMapper.componentCodeList(baseBatchBomVo);
        List<String> componentList = baseBatchBomExtMapper.componentList(baseBatchBomVo);
        Map<String, List<String>> map = new HashMap<>();
        map.put("componentCodeList", componentCodeList);
        map.put("componentList", componentList);
        return ResultUtil.success(map);

    }

    @Override
    public ResultVO addBomExcel(List<BaseBatchBomExcel> excelList, Integer bomId) {
        for (BaseBatchBomExcel baseBatchBomExcel : excelList) {
            BomOpcomponent bomOpcomponent = new BomOpcomponent();
            bomOpcomponent.setIrowno(Integer.valueOf(baseBatchBomExcel.getIrowNo()));
            bomOpcomponent.setCbomgrade(baseBatchBomExcel.getCbomGrade());
            bomOpcomponent.setCinvcodeSub(baseBatchBomExcel.getCinvCodeSub());
            bomOpcomponent.setCbomattr(baseBatchBomExcel.getCbomAttr());
            bomOpcomponent.setPartid(bomId);
            bomOpcomponentMapper.insertSelective(bomOpcomponent);
        }
        return ResultUtil.success();
    }


}
