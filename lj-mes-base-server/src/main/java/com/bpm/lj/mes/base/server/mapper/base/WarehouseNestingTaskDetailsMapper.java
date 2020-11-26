package com.bpm.lj.mes.base.server.mapper.base;

import com.bpm.lj.mes.base.server.domain.WarehouseNestingTaskDetails;
import com.bpm.lj.mes.base.server.domain.WarehouseNestingTaskDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarehouseNestingTaskDetailsMapper {
    long countByExample(WarehouseNestingTaskDetailsExample example);

    int deleteByExample(WarehouseNestingTaskDetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WarehouseNestingTaskDetails record);

    int insertSelective(WarehouseNestingTaskDetails record);

    List<WarehouseNestingTaskDetails> selectByExample(WarehouseNestingTaskDetailsExample example);

    WarehouseNestingTaskDetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WarehouseNestingTaskDetails record, @Param("example") WarehouseNestingTaskDetailsExample example);

    int updateByExample(@Param("record") WarehouseNestingTaskDetails record, @Param("example") WarehouseNestingTaskDetailsExample example);

    int updateByPrimaryKeySelective(WarehouseNestingTaskDetails record);

    int updateByPrimaryKey(WarehouseNestingTaskDetails record);
}