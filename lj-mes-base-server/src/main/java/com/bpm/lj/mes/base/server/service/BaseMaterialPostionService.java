package com.bpm.lj.mes.base.server.service;

import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.domain.BaseMaterialPostion;
import com.bpm.lj.mes.base.server.vo.BaseMaterialPostionVo;
import com.bpm.lj.mes.base.server.vo.MaterialPostionExcel;

import java.util.List;

public interface BaseMaterialPostionService {
    ResultVO pageList(BaseMaterialPostionVo vo);

    List<BaseMaterialPostionVo> excelList(BaseMaterialPostionVo vo);

    ResultVO addMaterialPostion(BaseMaterialPostion vo);

    ResultVO deleted(Integer id);

    ResultVO materialPostionList();

    ResultVO addExcelProcessTime(List<MaterialPostionExcel> excelList);

}