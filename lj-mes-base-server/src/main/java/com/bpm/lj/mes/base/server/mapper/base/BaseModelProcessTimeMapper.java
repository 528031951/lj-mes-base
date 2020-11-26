package com.bpm.lj.mes.base.server.mapper.base;

import com.bpm.lj.mes.base.server.domain.BaseModelProcessTime;
import com.bpm.lj.mes.base.server.domain.BaseModelProcessTimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseModelProcessTimeMapper {
    long countByExample(BaseModelProcessTimeExample example);

    int deleteByExample(BaseModelProcessTimeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseModelProcessTime record);

    int insertSelective(BaseModelProcessTime record);

    List<BaseModelProcessTime> selectByExample(BaseModelProcessTimeExample example);

    BaseModelProcessTime selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseModelProcessTime record, @Param("example") BaseModelProcessTimeExample example);

    int updateByExample(@Param("record") BaseModelProcessTime record, @Param("example") BaseModelProcessTimeExample example);

    int updateByPrimaryKeySelective(BaseModelProcessTime record);

    int updateByPrimaryKey(BaseModelProcessTime record);
}