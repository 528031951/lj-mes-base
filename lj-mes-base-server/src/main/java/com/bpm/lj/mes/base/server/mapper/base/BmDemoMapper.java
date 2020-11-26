package com.bpm.lj.mes.base.server.mapper.base;

import com.bpm.lj.mes.base.server.domain.BmDemo;
import com.bpm.lj.mes.base.server.domain.BmDemoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BmDemoMapper {
    long countByExample(BmDemoExample example);

    int deleteByExample(BmDemoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BmDemo record);

    int insertSelective(BmDemo record);

    List<BmDemo> selectByExample(BmDemoExample example);

    BmDemo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BmDemo record, @Param("example") BmDemoExample example);

    int updateByExample(@Param("record") BmDemo record, @Param("example") BmDemoExample example);

    int updateByPrimaryKeySelective(BmDemo record);

    int updateByPrimaryKey(BmDemo record);
}