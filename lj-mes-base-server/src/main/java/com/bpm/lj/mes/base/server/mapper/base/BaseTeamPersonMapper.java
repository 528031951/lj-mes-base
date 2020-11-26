package com.bpm.lj.mes.base.server.mapper.base;

import com.bpm.lj.mes.base.server.domain.BaseTeamPerson;
import com.bpm.lj.mes.base.server.domain.BaseTeamPersonExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseTeamPersonMapper {
    long countByExample(BaseTeamPersonExample example);

    int deleteByExample(BaseTeamPersonExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseTeamPerson record);

    int insertSelective(BaseTeamPerson record);

    List<BaseTeamPerson> selectByExample(BaseTeamPersonExample example);

    BaseTeamPerson selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseTeamPerson record, @Param("example") BaseTeamPersonExample example);

    int updateByExample(@Param("record") BaseTeamPerson record, @Param("example") BaseTeamPersonExample example);

    int updateByPrimaryKeySelective(BaseTeamPerson record);

    int updateByPrimaryKey(BaseTeamPerson record);
}