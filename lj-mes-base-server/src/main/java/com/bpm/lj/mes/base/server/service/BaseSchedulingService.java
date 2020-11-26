package com.bpm.lj.mes.base.server.service;

import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.dto.BaseSchedulingDTO;

public interface BaseSchedulingService {

    /**
     * 新增/修改
     */
    ResultVO addLineSupervisor(BaseSchedulingDTO vo);

    /**
     * 删除
     */
    ResultVO deleteLineSupervisor(Long id);

    /**
     * 分页查询
     */
    ResultVO querySchedulingList(Integer year, Integer month);

    /**
     * 工作中心集合
     */
    ResultVO queryWorkshopList();

    /**
     * 产线集合
     */
    ResultVO queryProductionLineList(Long pId);

    /**
     * 班组集合
     */
    ResultVO queryTeamList();

    /**
     * 班次集合
     */
    ResultVO queryShiftList();

    /**
     * 根据日期回显
     */
    ResultVO echoList(String formatTime);
}