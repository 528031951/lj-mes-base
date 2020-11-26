package com.bpm.lj.mes.base.server.mapper.base;

import com.bpm.lj.mes.base.server.domain.SyncPomain;
import com.bpm.lj.mes.base.server.domain.SyncPomainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyncPomainMapper {
    long countByExample(SyncPomainExample example);

    int deleteByExample(SyncPomainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SyncPomain record);

    int insertSelective(SyncPomain record);

    List<SyncPomain> selectByExample(SyncPomainExample example);

    SyncPomain selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SyncPomain record, @Param("example") SyncPomainExample example);

    int updateByExample(@Param("record") SyncPomain record, @Param("example") SyncPomainExample example);

    int updateByPrimaryKeySelective(SyncPomain record);

    int updateByPrimaryKey(SyncPomain record);
}