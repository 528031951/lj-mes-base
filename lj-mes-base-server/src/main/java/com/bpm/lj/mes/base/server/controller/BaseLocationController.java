package com.bpm.lj.mes.base.server.controller;

import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.dto.BmLocationDTO;
import com.bpm.lj.mes.base.server.service.BmLocationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 工厂建模.
 */
@RestController
@RequestMapping(value = "/location")
@Api(description = "工厂建模")
public class BaseLocationController {
    @Autowired
    private BmLocationService bmLocationService;

//    @Autowired
//    private BmEquipmentService bmEquipmentService;

    @ApiOperation("新增/修改工厂")
    @RequestMapping(value = "/addTeam", method = RequestMethod.POST)
    public ResultVO add(@RequestBody BmLocationDTO bmLocationDTO) {

        return bmLocationService.addBmLocation(bmLocationDTO);
    }

    @ApiOperation("根据设备id查询工厂信息")
    @RequestMapping(
            value = {"/bmTeamById/{id}"},
            method = {RequestMethod.GET}
    )
    public ResultVO bmTeamById(@PathVariable Long id) {

        return bmLocationService.bmLocationtById(id);
    }

    @ApiOperation("删除工厂")
    @RequestMapping(value = "/deleteTeamID/{id}", method = RequestMethod.DELETE)
    public ResultVO deleteBmTeam(@PathVariable Long id) {
        return bmLocationService.deleteBmLocation(id);
    }

    @ApiOperation("工厂查询")
    @RequestMapping(
            value = {"/queryLocation"},
            method = {RequestMethod.GET}
    )
    public ResultVO queryBmTeam() {


        return bmLocationService.queryBmLocation();
    }

//    @ApiOperation("设备查询")
//    @RequestMapping(
//            value = {"/queryEquipmentList"},
//            method = {RequestMethod.GET}
//    )
//    public ResultVO queryEquipmentList(EquipmentQueryDTO equipmentQueryDTO) {
//        return bmEquipmentService.selecteBmEquipmentList(equipmentQueryDTO);
//    }

    @ApiOperation("根据TYPE和PID去查")
    @RequestMapping(
            value = {"/workshopAndLine"},
            method = {RequestMethod.GET}
    )
    public List<BmLocationDTO> workshopAndLine(Long type, Long pId) {
        List<BmLocationDTO> bmLocationDTOS = bmLocationService.workshopAndLine(type, pId);
        return bmLocationDTOS;
    }


}
