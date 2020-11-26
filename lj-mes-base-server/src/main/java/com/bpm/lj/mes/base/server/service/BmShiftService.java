package com.bpm.lj.mes.base.server.service;

import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.dto.BmShiftDTO;

/**
 * <p>Title: BmShiftService</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2020/5/22 7:55 上午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
public interface BmShiftService {
    /**
     * 新增/修改班次
     *
     * @param bmShiftDTO
     * @return
     */
    ResultVO addBmShift(BmShiftDTO bmShiftDTO);

    /**
     * 删除班次
     *
     * @param id
     * @return
     */
    ResultVO deleteBmShift(Integer id);


    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    ResultVO bmShiftById(Integer id);

    /**
     * 查询班次
     *
     * @return
     */
    ResultVO queryBmShift(BmShiftDTO bmShiftDTO);
}
