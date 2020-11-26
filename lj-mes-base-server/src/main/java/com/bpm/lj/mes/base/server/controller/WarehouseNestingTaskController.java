//package com.bpm.lj.mes.base.server.controller;
//
//import com.bpm.lj.mes.base.common.vo.ResultVO;
//import com.bpm.lj.mes.base.server.dto.WarehouseNestingTaskDTO;
//import com.bpm.lj.mes.base.server.service.WarehouseNestingTaskService;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//import java.util.List;
//
///**
// * 物料属性维护.
// */
//@RestController
//@RequestMapping(value = "/nestingTask")
//@Api(description = "仓库管理-打套料任务")
//public class WarehouseNestingTaskController {
//    @Resource
//    private WarehouseNestingTaskService warehouseNestingTaskService;
//
//
//
//    @ApiOperation("分页查询")
//    @RequestMapping(
//            value = {"/selectPageList"},
//            method = {RequestMethod.GET}
//    )
//    public ResultVO selectPageList(WarehouseNestingTaskDTO dto) {
//        return warehouseNestingTaskService.pageList(dto);
//    }
//
//    @ApiOperation("发布")
//    @RequestMapping(
//            value = {"/updateStatus"},
//            method = {RequestMethod.GET}
//    )
//    public ResultVO updateStatus(Integer id) {
//        return warehouseNestingTaskService.updateStatus(id);
//    }
//
//    @ApiOperation("任务详情")
//    @RequestMapping(
//            value = {"/taskDetails"},
//            method = {RequestMethod.GET}
//    )
//    public ResultVO taskDetails(Integer id) {
//        return warehouseNestingTaskService.taskDetails(id);
//    }
//
//    @ApiOperation("物料明细")
//    @RequestMapping(
//            value = {"/details"},
//            method = {RequestMethod.GET}
//    )
//    public ResultVO details(Integer id) {
//        return warehouseNestingTaskService.details(id);
//    }
//
//    @ApiOperation("加急")
//    @RequestMapping(
//            value = {"/urgent"},
//            method = {RequestMethod.GET}
//    )
//    public ResultVO urgent(List<Integer> ids) {
//        return warehouseNestingTaskService.urgent(ids);
//    }
//
//}