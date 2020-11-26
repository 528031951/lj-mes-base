package com.bpm.lj.mes.base.server.mapper.base;

import com.bpm.lj.mes.base.server.domain.BaseScheduling;
import com.bpm.lj.mes.base.server.domain.BaseSchedulingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseSchedulingMapper {
    long countByExample(BaseSchedulingExample example);

    int deleteByExample(BaseSchedulingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseScheduling record);

    int insertSelective(BaseScheduling record);

    List<BaseScheduling> selectByExample(BaseSchedulingExample example);

    BaseScheduling selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseScheduling record, @Param("example") BaseSchedulingExample example);

    int updateByExample(@Param("record") BaseScheduling record, @Param("example") BaseSchedulingExample example);

    int updateByPrimaryKeySelective(BaseScheduling record);

    int updateByPrimaryKey(BaseScheduling record);
}