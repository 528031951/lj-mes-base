package com.bpm.lj.mes.base.server.service;

import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.dto.BmLocationDTO;

import java.util.List;

public interface BmLocationService {

    /**
     * 新增/修改工厂
     *
     * @param bmLocationDTO
     * @return
     */
    ResultVO addBmLocation(BmLocationDTO bmLocationDTO);

    /**
     * 删除工厂
     *
     * @param id
     * @return
     */
    ResultVO deleteBmLocation(Long id);

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    ResultVO bmLocationtById(Long id);

    /**
     * 查询工厂
     *
     * @return
     */
    ResultVO queryBmLocation();
    ResultVO tree();

    ResultVO selectLine(Long id);

    ResultVO selectLineTree();

    /**
     * 仅仅查询车间和产线
     * @return
     */
    List<BmLocationDTO> workshopAndLine(Long type, Long pId);


}