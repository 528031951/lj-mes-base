package com.bpm.lj.mes.base.server.mapper.ext;

import com.bpm.lj.mes.base.server.domain.BaseShift;
import com.bpm.lj.mes.base.server.dto.BmShiftDTO;

import java.util.List;

public interface BmShiftExtMapper {

    List<BaseShift> selectBmList(BmShiftDTO bmShiftDTO);

    BaseShift selectById(Integer id);

    void deleteById(Integer id);

    int queryByCode(BmShiftDTO bmShiftDTO);
}