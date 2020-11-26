package com.bpm.lj.mes.base.server.service;

import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.dto.BaseModelProcessTimeDTO;
import com.bpm.lj.mes.base.server.vo.BaseModelProcessTimeExcel;

import java.util.List;

public interface BaseModelProcessTimeService {
    ResultVO queryPageList(BaseModelProcessTimeDTO dto);

    ResultVO queryProcess(Integer id);

    ResultVO queryDepartment(Integer teamId);

    ResultVO addProcessTime(BaseModelProcessTimeDTO dto);

    ResultVO addExcelProcessTime(List<BaseModelProcessTimeExcel> excelList);

    ResultVO queryPageDetails(String machineCode);

    ResultVO teamList();

}