package com.bpm.lj.mes.base.server.service.impl;

import com.bpm.lj.mes.base.common.util.ResultUtil;
import com.bpm.lj.mes.base.common.vo.PageInfoVO;
import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.domain.BaseLocation;
import com.bpm.lj.mes.base.server.domain.BaseModelProcessTime;
import com.bpm.lj.mes.base.server.dto.BaseModelProcessTimeDTO;
import com.bpm.lj.mes.base.server.mapper.base.BaseLocationMapper;
import com.bpm.lj.mes.base.server.mapper.base.BaseModelProcessTimeMapper;
import com.bpm.lj.mes.base.server.mapper.base.BaseStandaraProcessMapper;
import com.bpm.lj.mes.base.server.mapper.ext.BaseModelProcessTimeExtMapper;
import com.bpm.lj.mes.base.server.service.BaseModelProcessTimeService;
import com.bpm.lj.mes.base.server.vo.BaseModelProcessTimeExcel;
import com.bpm.lj.mes.base.server.vo.DeptVo;
import com.bpm.lj.mes.base.server.vo.ProcessVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class BaseModelProcessTimeServiceImpl implements BaseModelProcessTimeService {
    @Resource
    private BaseModelProcessTimeMapper baseModelProcessTimeMapper;
    @Resource
    private BaseModelProcessTimeExtMapper baseModelProcessTimeExtMapper;
    @Resource
    private BaseStandaraProcessMapper baseStandaraProcessMapper;
    @Resource
    private BaseLocationMapper baseLocationMapper;

    @Override
    public ResultVO queryPageList(BaseModelProcessTimeDTO dto) {
        PageHelper.startPage(dto.getPageNum(), dto.getPageSize());
        List<BaseModelProcessTimeDTO> dtoList = baseModelProcessTimeExtMapper.queryPageList(dto);
        PageInfo<BaseModelProcessTimeDTO> pageInfo = new PageInfo<>(dtoList);
        PageInfoVO pageInfoVO = ResultUtil.successPageInfo();
        BeanUtils.copyProperties(pageInfo, pageInfoVO);
        pageInfoVO.setData(pageInfo.getList());
        return ResultUtil.success(pageInfoVO);
    }

    @Override
    public ResultVO queryProcess(Integer id) {
        List<ProcessVo> processVos = baseModelProcessTimeExtMapper.queryProcess(id);
        return ResultUtil.success(processVos);
    }

    @Override
    public ResultVO queryDepartment(Integer teamId) {
        List<DeptVo> deptVos = baseModelProcessTimeExtMapper.queryDepartment(teamId);
        return ResultUtil.success(deptVos);
    }

    @Override
    public ResultVO addProcessTime(BaseModelProcessTimeDTO dto) {
        BaseModelProcessTime baseModelProcessTime = new BaseModelProcessTime();
        BeanUtils.copyProperties(dto, baseModelProcessTime);
        baseModelProcessTime.setCreateTime(new Date());
        if (null != dto.getBaseOperationId()) {
            List<ProcessVo> processVos = baseModelProcessTimeExtMapper.queryProcessName(dto.getBaseOperationId());
            baseModelProcessTime.setProcessCode(processVos.get(0).getProcessCode());
            baseModelProcessTime.setProcessName(processVos.get(0).getProcessName());
        }
        if (dto.getWorhcenterId() != null) {
            BaseLocation baseLocation = baseLocationMapper.selectByPrimaryKey(dto.getWorhcenterId());
            baseModelProcessTime.setWorhcenterCode(baseLocation.getCode());
            baseModelProcessTime.setWorhcenterName(baseLocation.getName());
        }
        if (dto.getId() == null) {
            baseModelProcessTimeMapper.insertSelective(baseModelProcessTime);
        } else {
            baseModelProcessTimeMapper.updateByPrimaryKeySelective(baseModelProcessTime);
        }
        return ResultUtil.success();
    }

    @Override
    public ResultVO addExcelProcessTime(List<BaseModelProcessTimeExcel> excelList) {

        for (BaseModelProcessTimeExcel baseModelProcessTimeExcel : excelList) {
            BaseModelProcessTime baseModelProcessTime = new BaseModelProcessTime();
            BeanUtils.copyProperties(baseModelProcessTimeExcel, baseModelProcessTime);
            baseModelProcessTime.setWorhcenterId(baseModelProcessTimeExtMapper.queryWorkId(baseModelProcessTimeExcel.getWorhcenterCode()));
            baseModelProcessTime.setBaseOperationId(baseModelProcessTimeExtMapper.queryProcessId(baseModelProcessTimeExcel.getProcessCode()));
            baseModelProcessTimeMapper.insertSelective(baseModelProcessTime);
        }
        return ResultUtil.success();
    }

    @Override
    public ResultVO queryPageDetails(String machineCode) {
        List<BaseModelProcessTimeDTO> baseModelProcessTimeDTOS = baseModelProcessTimeExtMapper.queryPageDetails(machineCode);
        return ResultUtil.success(baseModelProcessTimeDTOS);

    }

    @Override
    public ResultVO teamList() {
        return ResultUtil.success(baseModelProcessTimeExtMapper.teamList());
    }
}
