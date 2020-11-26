package com.bpm.lj.mes.base.server.service;

import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.dto.BaseProcessDrawingsDTO;
import com.bpm.lj.mes.base.server.vo.BaseProcessDrawingsExcel;
import com.bpm.lj.mes.base.server.vo.ProcessDrawingsVo;

import java.util.List;

public interface BaseProcessDrawingsService {
    ResultVO quueryPageList(BaseProcessDrawingsDTO dto);

    ResultVO addProcess(ProcessDrawingsVo vo);

    ResultVO addDrawingPath(BaseProcessDrawingsDTO vo);

    ResultVO addInventoryList(BaseProcessDrawingsDTO vo);

    ResultVO addExcelProcessTime(List<BaseProcessDrawingsExcel> bmDemoExcelList);


}