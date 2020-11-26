package com.bpm.lj.mes.base.server.mapper.base;

import com.bpm.lj.mes.base.server.domain.BaseShift;
import com.bpm.lj.mes.base.server.domain.BaseShiftExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseShiftMapper {
    long countByExample(BaseShiftExample example);

    int deleteByExample(BaseShiftExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseShift record);

    int insertSelective(BaseShift record);

    List<BaseShift> selectByExample(BaseShiftExample example);

    BaseShift selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseShift record, @Param("example") BaseShiftExample example);

    int updateByExample(@Param("record") BaseShift record, @Param("example") BaseShiftExample example);

    int updateByPrimaryKeySelective(BaseShift record);

    int updateByPrimaryKey(BaseShift record);
}