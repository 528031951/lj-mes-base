package com.bpm.lj.mes.base.server.mapper.base;

import com.bpm.lj.mes.base.server.domain.BaseLocation;
import com.bpm.lj.mes.base.server.domain.BaseLocationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseLocationMapper {
    long countByExample(BaseLocationExample example);

    int deleteByExample(BaseLocationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseLocation record);

    int insertSelective(BaseLocation record);

    List<BaseLocation> selectByExample(BaseLocationExample example);

    BaseLocation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseLocation record, @Param("example") BaseLocationExample example);

    int updateByExample(@Param("record") BaseLocation record, @Param("example") BaseLocationExample example);

    int updateByPrimaryKeySelective(BaseLocation record);

    int updateByPrimaryKey(BaseLocation record);
}