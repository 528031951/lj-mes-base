package com.bpm.lj.mes.base.server.mapper.base;

import com.bpm.lj.mes.base.server.domain.BaseStandaraProcess;
import com.bpm.lj.mes.base.server.domain.BaseStandaraProcessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseStandaraProcessMapper {
    long countByExample(BaseStandaraProcessExample example);

    int deleteByExample(BaseStandaraProcessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseStandaraProcess record);

    int insertSelective(BaseStandaraProcess record);

    List<BaseStandaraProcess> selectByExample(BaseStandaraProcessExample example);

    BaseStandaraProcess selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseStandaraProcess record, @Param("example") BaseStandaraProcessExample example);

    int updateByExample(@Param("record") BaseStandaraProcess record, @Param("example") BaseStandaraProcessExample example);

    int updateByPrimaryKeySelective(BaseStandaraProcess record);

    int updateByPrimaryKey(BaseStandaraProcess record);
}