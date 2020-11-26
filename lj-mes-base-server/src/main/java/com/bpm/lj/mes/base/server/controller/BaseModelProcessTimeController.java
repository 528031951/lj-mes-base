package com.bpm.lj.mes.base.server.controller;

import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.enmus.ExcelType;
import com.bpm.common.service.util.ExcelExportStyle;
import com.bpm.common.service.util.ExcelUtil;
import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.dto.BaseModelProcessTimeDTO;
import com.bpm.lj.mes.base.server.service.BaseModelProcessTimeService;
import com.bpm.lj.mes.base.server.vo.BaseModelProcessTimeExcel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 物料属性维护.
 */
@RestController
@RequestMapping(value = "/modelProcessTime")
@Api(description = "机型工序工时维护")
public class BaseModelProcessTimeController {
    @Resource
    private BaseModelProcessTimeService baseModelProcessTimeService;

    @ApiOperation("新增/修改")
    @RequestMapping(value = "/addProcessTime", method = RequestMethod.POST)
    public ResultVO add(@RequestBody BaseModelProcessTimeDTO dto) {

        return baseModelProcessTimeService.addProcessTime(dto);
    }

    @ApiOperation("分页查询")
    @RequestMapping(
            value = {"/queryPageList"},
            method = {RequestMethod.GET}
    )
    public ResultVO selectPageList(BaseModelProcessTimeDTO dto) {
        return baseModelProcessTimeService.queryPageList(dto);
    }

    @ApiOperation("根据机器型号查详情")
    @RequestMapping(
            value = {"/queryPageDetails"},
            method = {RequestMethod.GET}
    )
    public ResultVO queryPageDetails(String machineCode) {
        return baseModelProcessTimeService.queryPageDetails(machineCode);
    }


    @ApiOperation("工作中心集合")
    @RequestMapping(
            value = {"/queryDepartment"},
            method = {RequestMethod.GET}
    )
    public ResultVO queryDepartment(Integer teamId) {
        return baseModelProcessTimeService.queryDepartment(teamId);
    }

    @ApiOperation("工序集合")
    @RequestMapping(
            value = {"/queryProcess"},
            method = {RequestMethod.GET}
    )
    public ResultVO queryProcess(Integer id) {
        return baseModelProcessTimeService.queryProcess(id);
    }

    @ApiOperation("班组集合")
    @RequestMapping(
            value = {"/teamList"},
            method = {RequestMethod.GET}
    )
    public ResultVO teamList() {
        return baseModelProcessTimeService.teamList();
    }

    @ApiOperation("模板导出excel数据")
    @RequestMapping(
            value = {"/exportExcelDemo"},
            method = {RequestMethod.GET}
    )
    public void exportExcelDemo(HttpServletResponse response) throws IOException {
        List<BaseModelProcessTimeExcel> bmDemoExcelList = new ArrayList<>();
        BaseModelProcessTimeExcel bmDemoExcel = new BaseModelProcessTimeExcel();
        bmDemoExcelList.add(bmDemoExcel);
        //设置样式参数
        ExportParams exportParams = new ExportParams(null, null, ExcelType.XSSF);
        exportParams.setStyle(ExcelExportStyle.class);
        //导出操作
        ExcelUtil.exportExcel(bmDemoExcelList, BaseModelProcessTimeExcel.class, "test", exportParams, response);
    }


    @ApiOperation("导入excel数据")
    @RequestMapping(
            value = {"/importExcel"},
            method = {RequestMethod.POST}
    )
    public ResultVO importExcelDemo(@RequestParam("file") MultipartFile file) throws IOException {
        //导入操作
        List<BaseModelProcessTimeExcel> bmDemoExcelList = ExcelUtil.importExcel(file, 0, 1, BaseModelProcessTimeExcel.class);

        return baseModelProcessTimeService.addExcelProcessTime(bmDemoExcelList);
    }
}