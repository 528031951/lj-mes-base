package com.bpm.lj.mes.base.server.mapper.base;

import com.bpm.lj.mes.base.server.domain.WarehouseInventeIn;
import com.bpm.lj.mes.base.server.domain.WarehouseInventeInExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarehouseInventeInMapper {
    long countByExample(WarehouseInventeInExample example);

    int deleteByExample(WarehouseInventeInExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WarehouseInventeIn record);

    int insertSelective(WarehouseInventeIn record);

    List<WarehouseInventeIn> selectByExample(WarehouseInventeInExample example);

    WarehouseInventeIn selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WarehouseInventeIn record, @Param("example") WarehouseInventeInExample example);

    int updateByExample(@Param("record") WarehouseInventeIn record, @Param("example") WarehouseInventeInExample example);

    int updateByPrimaryKeySelective(WarehouseInventeIn record);

    int updateByPrimaryKey(WarehouseInventeIn record);
}