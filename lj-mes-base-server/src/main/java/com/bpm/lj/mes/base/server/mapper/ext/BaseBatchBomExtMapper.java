package com.bpm.lj.mes.base.server.mapper.ext;

import com.bpm.lj.mes.base.server.domain.BomOpcomponent;
import com.bpm.lj.mes.base.server.dto.BaseBatchBomDTO;
import com.bpm.lj.mes.base.server.vo.BaseBatchBomVo;

import java.util.List;

public interface BaseBatchBomExtMapper {
    List<BaseBatchBomVo> pageList(BaseBatchBomDTO dto);

    List<BaseBatchBomVo> bomList(BaseBatchBomVo vo);

    List<BomOpcomponent> chrildBomList(Integer bomId);

    List<String> componentCodeList(BaseBatchBomVo name);

    List<String> componentList(BaseBatchBomVo name);
}