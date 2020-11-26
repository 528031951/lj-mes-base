package com.bpm.lj.mes.base.server.mapper.ext;

import com.bpm.lj.mes.base.server.vo.BaseMaterialPostionVo;

import java.util.List;

public interface BaseMaterialPostionExtMapper {
    List<BaseMaterialPostionVo> pageList(BaseMaterialPostionVo vo);

    List<BaseMaterialPostionVo> material();

    List<BaseMaterialPostionVo> postionList();

    Integer warehouseIdByCode(String code);

    Integer inventoryIdByCode(String code);
}