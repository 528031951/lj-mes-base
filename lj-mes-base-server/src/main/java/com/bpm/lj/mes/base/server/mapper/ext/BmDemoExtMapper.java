package com.bpm.lj.mes.base.server.mapper.ext;

import com.bpm.lj.mes.base.server.dto.BmDemoExcel;
import com.bpm.lj.mes.base.server.dto.DemoQueryDTO;

import java.util.List;

public interface BmDemoExtMapper {

    /**
     * 分页查询demo
     * @param demoQueryDTO
     * @return
     */
    List<BmDemoExcel> findDemoPageList(DemoQueryDTO demoQueryDTO);
}