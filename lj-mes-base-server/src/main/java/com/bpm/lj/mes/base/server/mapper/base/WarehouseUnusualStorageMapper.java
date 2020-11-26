package com.bpm.lj.mes.base.server.mapper.base;

import com.bpm.lj.mes.base.server.domain.WarehouseUnusualStorage;
import com.bpm.lj.mes.base.server.domain.WarehouseUnusualStorageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarehouseUnusualStorageMapper {
    long countByExample(WarehouseUnusualStorageExample example);

    int deleteByExample(WarehouseUnusualStorageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WarehouseUnusualStorage record);

    int insertSelective(WarehouseUnusualStorage record);

    List<WarehouseUnusualStorage> selectByExample(WarehouseUnusualStorageExample example);

    WarehouseUnusualStorage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WarehouseUnusualStorage record, @Param("example") WarehouseUnusualStorageExample example);

    int updateByExample(@Param("record") WarehouseUnusualStorage record, @Param("example") WarehouseUnusualStorageExample example);

    int updateByPrimaryKeySelective(WarehouseUnusualStorage record);

    int updateByPrimaryKey(WarehouseUnusualStorage record);
}