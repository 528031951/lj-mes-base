package com.bpm.lj.mes.base.server.mapper.base;

import com.bpm.lj.mes.base.server.domain.BaseWarehouse;
import com.bpm.lj.mes.base.server.domain.BaseWarehouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseWarehouseMapper {
    long countByExample(BaseWarehouseExample example);

    int deleteByExample(BaseWarehouseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseWarehouse record);

    int insertSelective(BaseWarehouse record);

    List<BaseWarehouse> selectByExample(BaseWarehouseExample example);

    BaseWarehouse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseWarehouse record, @Param("example") BaseWarehouseExample example);

    int updateByExample(@Param("record") BaseWarehouse record, @Param("example") BaseWarehouseExample example);

    int updateByPrimaryKeySelective(BaseWarehouse record);

    int updateByPrimaryKey(BaseWarehouse record);
}