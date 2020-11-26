package com.bpm.lj.mes.base.server.mapper.base;

import com.bpm.lj.mes.base.server.domain.BaseTeam;
import com.bpm.lj.mes.base.server.domain.BaseTeamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseTeamMapper {
    long countByExample(BaseTeamExample example);

    int deleteByExample(BaseTeamExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseTeam record);

    int insertSelective(BaseTeam record);

    List<BaseTeam> selectByExample(BaseTeamExample example);

    BaseTeam selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseTeam record, @Param("example") BaseTeamExample example);

    int updateByExample(@Param("record") BaseTeam record, @Param("example") BaseTeamExample example);

    int updateByPrimaryKeySelective(BaseTeam record);

    int updateByPrimaryKey(BaseTeam record);
}