package com.bpm.lj.mes.base.server.mapper.base;

import com.bpm.lj.mes.base.server.domain.WarehouseTaskTimeSet;
import com.bpm.lj.mes.base.server.domain.WarehouseTaskTimeSetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarehouseTaskTimeSetMapper {
    long countByExample(WarehouseTaskTimeSetExample example);

    int deleteByExample(WarehouseTaskTimeSetExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WarehouseTaskTimeSet record);

    int insertSelective(WarehouseTaskTimeSet record);

    List<WarehouseTaskTimeSet> selectByExample(WarehouseTaskTimeSetExample example);

    WarehouseTaskTimeSet selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WarehouseTaskTimeSet record, @Param("example") WarehouseTaskTimeSetExample example);

    int updateByExample(@Param("record") WarehouseTaskTimeSet record, @Param("example") WarehouseTaskTimeSetExample example);

    int updateByPrimaryKeySelective(WarehouseTaskTimeSet record);

    int updateByPrimaryKey(WarehouseTaskTimeSet record);
}