package com.bpm.lj.mes.base.server.service;

import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.dto.DemoAddDTO;
import com.bpm.lj.mes.base.server.dto.DemoQueryDTO;

public interface BmDemoService {

    /**
     * 新增/修改demo
     * @param demoAddDTO
     * @return
     */
    ResultVO addDemo(DemoAddDTO demoAddDTO);

    /**
     * 根据id删除demo
     * @param id
     * @return
     */
    ResultVO deleteDemo(Integer id);

    /**
     *
     * @param demoQueryDTO
     * @return
     */
    ResultVO findDemoPageList(DemoQueryDTO demoQueryDTO);
}
