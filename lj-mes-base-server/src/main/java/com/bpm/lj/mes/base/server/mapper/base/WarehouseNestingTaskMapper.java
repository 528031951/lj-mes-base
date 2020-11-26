package com.bpm.lj.mes.base.server.mapper.base;

import com.bpm.lj.mes.base.server.domain.WarehouseNestingTask;
import com.bpm.lj.mes.base.server.domain.WarehouseNestingTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarehouseNestingTaskMapper {
    long countByExample(WarehouseNestingTaskExample example);

    int deleteByExample(WarehouseNestingTaskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WarehouseNestingTask record);

    int insertSelective(WarehouseNestingTask record);

    List<WarehouseNestingTask> selectByExample(WarehouseNestingTaskExample example);

    WarehouseNestingTask selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WarehouseNestingTask record, @Param("example") WarehouseNestingTaskExample example);

    int updateByExample(@Param("record") WarehouseNestingTask record, @Param("example") WarehouseNestingTaskExample example);

    int updateByPrimaryKeySelective(WarehouseNestingTask record);

    int updateByPrimaryKey(WarehouseNestingTask record);
}