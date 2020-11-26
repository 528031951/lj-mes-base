package com.bpm.lj.mes.base.server.mapper.ext;

import com.bpm.lj.mes.base.server.dto.BaseTeamDTO;
import com.bpm.lj.mes.base.server.dto.BaseTeamQueryDTO;
import com.bpm.lj.mes.base.server.vo.BaseTeamVo;
import com.bpm.lj.mes.base.server.vo.SysUserVo;

import java.util.List;

public interface BaseTeamExtMapper {

    List<SysUserVo> queryAllUser();

    List<SysUserVo> queryUser(Long id);

    /**
     * 班组查询
     *
     * @param
     * @return
     */
    List<BaseTeamVo> queryBaseTeam(BaseTeamQueryDTO dto);

    int queryByCode(BaseTeamDTO dto);

    List<Integer> queryChoosedUser();

    List<SysUserVo> queryWorkCenter();

    List<SysUserVo> queryEnableWorkCenterById(SysUserVo vo);

    Integer queryWorkCenterById(SysUserVo vo);

}