package com.bpm.lj.mes.base.server.mapper.ext;

import com.bpm.lj.mes.base.server.dto.BaseSchedulingDTO;
import com.bpm.lj.mes.base.server.vo.BaseSchedulingVo;

import java.util.List;

public interface BaseSchedulingExtMapper {


    List<BaseSchedulingVo> querySchedulingList(BaseSchedulingDTO BaseSchedulingDTO);

    List<BaseSchedulingDTO> echoList(String formatTime);

    void deleteByTime(String time);
}