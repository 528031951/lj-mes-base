package com.bpm.lj.mes.base.server.service;

import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.domain.BomOpcomponent;
import com.bpm.lj.mes.base.server.dto.BaseBatchBomDTO;
import com.bpm.lj.mes.base.server.vo.BaseBatchBomExcel;
import com.bpm.lj.mes.base.server.vo.BaseBatchBomVo;

import java.util.List;

public interface BaseBatchBomService {
    ResultVO pageList(BaseBatchBomDTO dto);

    ResultVO bomList(BaseBatchBomVo vo);

    ResultVO bindingBom(Integer id, Integer bomId);

    ResultVO chrildBom(Integer bomId);

    ResultVO addBom(BomOpcomponent bomOpcomponent);

    ResultVO deleteBom(List<Integer> id);

    ResultVO componentList(String name);

    ResultVO addBomExcel(List<BaseBatchBomExcel> excelList, Integer bomId);
}