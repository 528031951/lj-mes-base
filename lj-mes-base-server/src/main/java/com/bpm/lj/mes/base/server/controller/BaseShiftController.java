package com.bpm.lj.mes.base.server.controller;

import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.dto.BmShiftDTO;
import com.bpm.lj.mes.base.server.dto.BmShiftQueryDTO;
import com.bpm.lj.mes.base.server.service.BmShiftService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 班次管理controller
 */
@RestController
@RequestMapping(value = "/shift")
@Api(description = "班次管理")
public class BaseShiftController {
    @Autowired
    private BmShiftService bmShiftService;


    @ApiOperation("新增/修改班次")
    @RequestMapping(value = "/addShift" ,method = RequestMethod.POST)
    public ResultVO add(@RequestBody BmShiftDTO bmShiftDTO){

     return bmShiftService.addBmShift(bmShiftDTO);
    }

    @ApiOperation("根据设备id查询班次信息")
    @RequestMapping(
            value = {"/bmShiftById/{id}"},
            method = {RequestMethod.GET}
    )
    public ResultVO bmShiftById(@PathVariable Integer id) {

        return bmShiftService.bmShiftById(id);
    }

    @ApiOperation("删除班次")
    @RequestMapping(value = "/deleteEquipmentType/{id}" ,method = RequestMethod.DELETE)
    public ResultVO deleteBmShift(@PathVariable Integer id){
        return bmShiftService.deleteBmShift(id);
    }
    @ApiOperation("班次查询")
    @RequestMapping(
            value = {"/queryBmShift"},
            method = {RequestMethod.GET}
    )
    public ResultVO queryBmShift(BmShiftQueryDTO bmShiftQueryDTO) {
        BmShiftDTO bmShiftDTO=new BmShiftDTO();

        BeanUtils.copyProperties(bmShiftQueryDTO,bmShiftDTO);
        return bmShiftService.queryBmShift(bmShiftDTO);
    }



}
