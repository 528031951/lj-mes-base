package com.bpm.lj.mes.base.server.service.impl;


import com.bpm.lj.mes.base.common.util.ResultUtil;
import com.bpm.lj.mes.base.common.vo.PageInfoVO;
import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.domain.BaseProcessDrawings;
import com.bpm.lj.mes.base.server.domain.BaseProcessDrawingsDetails;
import com.bpm.lj.mes.base.server.dto.BaseProcessDrawingsDTO;
import com.bpm.lj.mes.base.server.mapper.base.BaseProcessDrawingsDetailsMapper;
import com.bpm.lj.mes.base.server.mapper.base.BaseProcessDrawingsMapper;
import com.bpm.lj.mes.base.server.mapper.ext.BaseProcessDrawingsExtMapper;
import com.bpm.lj.mes.base.server.service.BaseProcessDrawingsService;
import com.bpm.lj.mes.base.server.vo.BaseProcessDrawingsExcel;
import com.bpm.lj.mes.base.server.vo.ProcessDrawingsVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class BaseProcessDrawingsServiceImpl implements BaseProcessDrawingsService {
    @Resource
    private BaseProcessDrawingsMapper baseProcessDrawingsMapper;
    @Resource
    private BaseProcessDrawingsExtMapper baseProcessDrawingsExtMapper;
    @Resource
    private BaseProcessDrawingsDetailsMapper baseProcessDrawingsDetailsMapper;

    @Override
    public ResultVO quueryPageList(BaseProcessDrawingsDTO dto) {
        PageHelper.startPage(dto.getPageNum(), dto.getPageSize());
        List<BaseProcessDrawingsDTO> dtoList = baseProcessDrawingsExtMapper.quueryPageList(dto);
        PageInfo<BaseProcessDrawingsDTO> pageInfo = new PageInfo<>(dtoList);
        PageInfoVO pageInfoVO = ResultUtil.successPageInfo();
        BeanUtils.copyProperties(pageInfo, pageInfoVO);
        pageInfoVO.setData(pageInfo.getList());
        return ResultUtil.success(pageInfoVO);
    }

    @Override
    public ResultVO addProcess(ProcessDrawingsVo vo) {
        for (String drawingPath : vo.getDrawingPaths()) {
            BaseProcessDrawingsDetails processDrawings = new BaseProcessDrawingsDetails();
            BeanUtils.copyProperties(vo, processDrawings);
            processDrawings.setDrawingPath(drawingPath);
            baseProcessDrawingsDetailsMapper.insertSelective(processDrawings);
        }

        return ResultUtil.success();
    }

    @Override
    public ResultVO addDrawingPath(BaseProcessDrawingsDTO vo) {
        BaseProcessDrawings baseProcessDrawings = new BaseProcessDrawings();
        BeanUtils.copyProperties(vo, baseProcessDrawings);
        if (vo.getId() == null) {
            baseProcessDrawings.setCreateTime(new Date());
            baseProcessDrawingsMapper.insertSelective(baseProcessDrawings);
            BaseProcessDrawingsDetails processDrawings = new BaseProcessDrawingsDetails();
            processDrawings.setPdId(baseProcessDrawings.getId());
            processDrawings.setDrawingPath(vo.getDrawingPath());
            processDrawings.setDrawingType(vo.getDrawingType());
            baseProcessDrawingsDetailsMapper.insertSelective(processDrawings);
        } else {
            if (vo.getDetailsId() != null) {
                BaseProcessDrawingsDetails processDrawings = new BaseProcessDrawingsDetails();
                processDrawings.setPdId(vo.getDetailsId());
                processDrawings.setDrawingPath(vo.getDrawingPath());
                processDrawings.setDrawingType(vo.getDrawingType());
                baseProcessDrawingsDetailsMapper.updateByPrimaryKeySelective(processDrawings);
            } else {
                return ResultUtil.error("新增失败");

            }
        }

        return ResultUtil.success();

    }

    @Override
    public ResultVO addInventoryList(BaseProcessDrawingsDTO vo) {
        PageHelper.startPage(vo.getPageNum(), vo.getPageSize());
        List<BaseProcessDrawingsDTO> dtoList = baseProcessDrawingsExtMapper.addInventoryList(vo);
        PageInfo<BaseProcessDrawingsDTO> pageInfo = new PageInfo<>(dtoList);
        PageInfoVO pageInfoVO = ResultUtil.successPageInfo();
        BeanUtils.copyProperties(pageInfo, pageInfoVO);
        pageInfoVO.setData(pageInfo.getList());
        return ResultUtil.success(pageInfoVO);

    }

    @Override
    public ResultVO addExcelProcessTime(List<BaseProcessDrawingsExcel> bmDemoExcelList) {
        for (BaseProcessDrawingsExcel baseProcessDrawingsExcel : bmDemoExcelList) {
            //去重
            Integer queryRemoval = baseProcessDrawingsExtMapper.queryRemoval(baseProcessDrawingsExcel.getCinvcode()) == null ? 0 : baseProcessDrawingsExtMapper.queryRemoval(baseProcessDrawingsExcel.getCinvcode());
            if (queryRemoval == 0) {
                Integer integer = baseProcessDrawingsExtMapper.queryId(baseProcessDrawingsExcel.getCinvcode());
                BaseProcessDrawings baseProcessDrawings = new BaseProcessDrawings();
                BeanUtils.copyProperties(baseProcessDrawingsExcel, baseProcessDrawings);
                baseProcessDrawings.setPId(integer);
                //保存主表
                baseProcessDrawingsMapper.insertSelective(baseProcessDrawings);
                BaseProcessDrawingsDetails baseProcessDrawingsDetails = new BaseProcessDrawingsDetails();
                baseProcessDrawingsDetails.setDrawingPath(baseProcessDrawingsExcel.getDrawingPath());
                baseProcessDrawingsDetails.setPdId(baseProcessDrawings.getId());
                if (baseProcessDrawingsExcel.getIsCard() == 1) {
                    baseProcessDrawingsDetails.setDrawingType(1);
                }
                if (baseProcessDrawingsExcel.getIsDrawing() == 1) {
                    baseProcessDrawingsDetails.setDrawingType(0);
                }
                //保存路径表
                baseProcessDrawingsDetailsMapper.insertSelective(baseProcessDrawingsDetails);
            }
        }
        return ResultUtil.success();
    }


}
