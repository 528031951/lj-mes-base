package com.bpm.lj.mes.base.server.controller;


import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.dto.BaseSchedulingDTO;
import com.bpm.lj.mes.base.server.service.BaseSchedulingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/scheduling")
@Api(description = "排班管理")
public class BaseSchedulingController {
    @Resource
    private BaseSchedulingService baseSchedulingService;

    @ApiOperation("新增")
    @RequestMapping(
            value = {"/addScheduling"},
            method = {RequestMethod.POST}
    )
    public ResultVO addscheduling(@RequestBody BaseSchedulingDTO vo) {

        return baseSchedulingService.addLineSupervisor(vo);
    }

//    @ApiOperation("删除线长")
//    @RequestMapping(
//            value = {"/deleteLineSupervisor"},
//            method = {RequestMethod.GET}
//    )
//    public ResultVO deleteLineSupervisor(Long id) {
//
//        return baseLineSupervisorService.deleteLineSupervisor(id);
//    }

    @ApiOperation("查询LIST")
    @RequestMapping(
            value = {"/querySchedulingList"},
            method = {RequestMethod.GET}
    )
    public ResultVO queryLineSupervisorList(Integer year, Integer month) {
        return baseSchedulingService.querySchedulingList(year, month);
    }

    @ApiOperation("所有产线查询")
    @RequestMapping(
            value = {"/queryProductionLineList"},
            method = {RequestMethod.GET}
    )
    public ResultVO queryProductionLineList(Long pId) {

        return baseSchedulingService.queryProductionLineList(pId);
    }

    @ApiOperation("工作中心查询")
    @RequestMapping(
            value = {"/queryWorkshopList"},
            method = {RequestMethod.POST}
    )
    public ResultVO queryWorkshopList() {

        return baseSchedulingService.queryWorkshopList();
    }

    @ApiOperation("班组集合查询")
    @RequestMapping(
            value = {"/queryTeamList"},
            method = {RequestMethod.POST}
    )
    public ResultVO queryTeamList() {

        return baseSchedulingService.queryTeamList();
    }

    @ApiOperation("班次集合查询")
    @RequestMapping(
            value = {"/queryShiftList"},
            method = {RequestMethod.POST}
    )
    public ResultVO queryShiftList() {

        return baseSchedulingService.queryShiftList();
    }

    @ApiOperation("根据日期回显")
    @RequestMapping(
            value = {"/echoList"},
            method = {RequestMethod.GET}
    )
    public ResultVO echoList(String formatTime) {

        return baseSchedulingService.echoList(formatTime);
    }
}
