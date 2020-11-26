package com.bpm.lj.mes.base.server.service;

import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.dto.BaseTeamDTO;
import com.bpm.lj.mes.base.server.dto.BaseTeamQueryDTO;

public interface BaseTeamService {

    /**
     * 新增/修改班组
     */
    ResultVO addTeam(BaseTeamDTO dto);

    /**
     * 删除班组
     */
    ResultVO deleteTeam(Long id);

    /**
     * 分页查询
     */
    ResultVO queryTeamList(BaseTeamQueryDTO dto);

    /**
     * 线长集合
     */
//    ResultVO queryLineSupervisorList();


    /**
     * 所有人员集合
     */
    ResultVO queryAllUserList();

    /**
     * 已选择的人员集合
     */
    ResultVO queryUserList(Long id);

    ResultVO queryInfoById(Long id);

    //查询工作中心
    ResultVO queryWorkCenter(Integer id);

    ResultVO queryEnbleWorkCenter(Integer id);
}