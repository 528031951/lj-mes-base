package com.bpm.lj.mes.base.server.service.impl;


import com.bpm.lj.mes.base.common.util.ResultUtil;
import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.domain.BaseScheduling;
import com.bpm.lj.mes.base.server.domain.BaseShift;
import com.bpm.lj.mes.base.server.dto.*;
import com.bpm.lj.mes.base.server.mapper.base.BaseSchedulingMapper;
import com.bpm.lj.mes.base.server.mapper.ext.BaseLocationExtMapper;
import com.bpm.lj.mes.base.server.mapper.ext.BaseSchedulingExtMapper;
import com.bpm.lj.mes.base.server.mapper.ext.BaseTeamExtMapper;
import com.bpm.lj.mes.base.server.mapper.ext.BmShiftExtMapper;
import com.bpm.lj.mes.base.server.service.BaseSchedulingService;
import com.bpm.lj.mes.base.server.vo.BaseSchedulingVo;
import com.bpm.lj.mes.base.server.vo.BaseTeamVo;
import com.bpm.lj.mes.base.server.vo.ResultDateVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Service
public class BaseSchedulingServiceImpl implements BaseSchedulingService {
    @Resource
    private BaseSchedulingMapper baseSchedulingMapper;
    @Resource
    private BaseSchedulingExtMapper baseSchedulingExtMapper;
    @Resource
    private BaseLocationExtMapper bmLocationExtMapper;
    @Resource
    private BaseTeamExtMapper baseTeamExtMapper;
    @Resource
    private BmShiftExtMapper bmShiftExtMapper;

    @Override
    public ResultVO addLineSupervisor(BaseSchedulingDTO dto) {
        baseSchedulingExtMapper.deleteByTime(dto.getFormatTime());
        for (int i = 0; i < dto.getShiftIds().size(); i++) {
            BaseScheduling baseScheduling = new BaseScheduling();
            BeanUtils.copyProperties(dto, baseScheduling);
            baseScheduling.setShiftId(dto.getShiftIds().get(i));
            baseScheduling.setTeamId(dto.getTeamIds().get(i));
            baseSchedulingMapper.insertSelective(baseScheduling);
        }
        return ResultUtil.success();
    }

    @Override
    public ResultVO deleteLineSupervisor(Long id) {
        return null;
    }

    @Override
    public ResultVO querySchedulingList(Integer year, Integer month) {
        List<String> strList = new ArrayList<>();
        Calendar a = Calendar.getInstance();
        a.set(Calendar.YEAR, year);
        a.set(Calendar.MONTH, month - 1);
        a.set(Calendar.DATE, 1);
        a.roll(Calendar.DATE, -1);
        int maxDate = a.get(Calendar.DATE);
        String da = "";
        String mon = "";
        if (month < 10) {
            mon = "0" + month;
        } else {
            mon = month + "";
        }
        for (int i = 1; i <= maxDate; i++) {
            if (i < 10) {
                da = "0" + i;
            } else {
                da = i + "";
            }
            String aDate = String.valueOf(year) + "-" + mon + "-" + da;
            strList.add(aDate);
        }
        List<ResultDateVo> list = new ArrayList<>();
        for (String strDate : strList) {
            ResultDateVo resultDateVo = new ResultDateVo();
            BaseSchedulingDTO schedulingDTO = new BaseSchedulingDTO();
            schedulingDTO.setFormatTime(strDate);
            List<BaseSchedulingVo> baseSchedulingVos = baseSchedulingExtMapper.querySchedulingList(schedulingDTO);
            resultDateVo.setList(baseSchedulingVos);
            resultDateVo.setTime(strDate);
            list.add(resultDateVo);
        }
//        List<BaseSchedulingVo> baseSchedulingVos = baseSchedulingExtMapper.querySchedulingList(dto);
        return ResultUtil.success(list);
    }

    @Override
    public ResultVO queryWorkshopList() {
        BmLocationDTO bmLocationDTO = new BmLocationDTO();
        bmLocationDTO.setType(30);
        List<BmLocationDTO> dtoList = bmLocationExtMapper.queryNodeList(bmLocationDTO);
        List<BmLocationNodeDTO> workshopList = new ArrayList<>();
        dtoList.forEach(dto -> {
            BmLocationNodeDTO bmLocationNodeDTO = new BmLocationNodeDTO();
            BeanUtils.copyProperties(dto, bmLocationNodeDTO);
            workshopList.add(bmLocationNodeDTO);
        });

        return ResultUtil.success(workshopList);
    }

    @Override
    public ResultVO queryProductionLineList(Long pId) {
        BmLocationDTO bmLocationDTO = new BmLocationDTO();
        bmLocationDTO.setType(30);
        bmLocationDTO.setPId(pId.intValue());
        List<BmLocationDTO> dtoList = bmLocationExtMapper.queryNodeList(bmLocationDTO);
        List<BmLocationNodeDTO> productionLineList = new ArrayList<>();
        dtoList.forEach(dto -> {
            BmLocationNodeDTO bmLocationNodeDTO = new BmLocationNodeDTO();
            BeanUtils.copyProperties(dto, bmLocationNodeDTO);
            productionLineList.add(bmLocationNodeDTO);
        });

        return ResultUtil.success(productionLineList);
    }

    @Override
    public ResultVO queryTeamList() {
        BaseTeamQueryDTO baseTeamQueryDTO = new BaseTeamQueryDTO();
        baseTeamQueryDTO.setPageSize(99999);
        baseTeamQueryDTO.setTypeId(1);
        List<BaseTeamVo> baseTeamVos = baseTeamExtMapper.queryBaseTeam(baseTeamQueryDTO);
        return ResultUtil.success(baseTeamVos);
    }

    @Override
    public ResultVO queryShiftList() {
        BmShiftDTO bmShiftDTO = new BmShiftDTO();
        bmShiftDTO.setTypeId(1);
        bmShiftDTO.setPageSize(99999);
        List<BaseShift> bmShifts = bmShiftExtMapper.selectBmList(bmShiftDTO);
        return ResultUtil.success(bmShifts);
    }

    @Override
    public ResultVO echoList(String formatTime) {
        List<BaseSchedulingDTO> baseSchedulingDTOS = baseSchedulingExtMapper.echoList(formatTime);
        return ResultUtil.success(baseSchedulingDTOS);
    }


}
