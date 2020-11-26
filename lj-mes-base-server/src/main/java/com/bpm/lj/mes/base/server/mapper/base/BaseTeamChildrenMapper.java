package com.bpm.lj.mes.base.server.mapper.base;

import com.bpm.lj.mes.base.server.domain.BaseTeamChildren;
import com.bpm.lj.mes.base.server.domain.BaseTeamChildrenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseTeamChildrenMapper {
    long countByExample(BaseTeamChildrenExample example);

    int deleteByExample(BaseTeamChildrenExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseTeamChildren record);

    int insertSelective(BaseTeamChildren record);

    List<BaseTeamChildren> selectByExample(BaseTeamChildrenExample example);

    BaseTeamChildren selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseTeamChildren record, @Param("example") BaseTeamChildrenExample example);

    int updateByExample(@Param("record") BaseTeamChildren record, @Param("example") BaseTeamChildrenExample example);

    int updateByPrimaryKeySelective(BaseTeamChildren record);

    int updateByPrimaryKey(BaseTeamChildren record);
}