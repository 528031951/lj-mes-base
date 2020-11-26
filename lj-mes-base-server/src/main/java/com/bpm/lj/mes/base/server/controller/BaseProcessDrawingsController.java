package com.bpm.lj.mes.base.server.controller;

import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.enmus.ExcelType;
import com.bpm.common.service.util.ExcelExportStyle;
import com.bpm.common.service.util.ExcelUtil;
import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.dto.BaseProcessDrawingsDTO;
import com.bpm.lj.mes.base.server.service.BaseProcessDrawingsService;
import com.bpm.lj.mes.base.server.vo.BaseProcessDrawingsExcel;
import com.bpm.lj.mes.base.server.vo.ProcessDrawingsVo;
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
 * 工艺图纸管理.
 */
@RestController
@RequestMapping(value = "/processDrawings")
@Api(description = "工艺图纸管理")
public class BaseProcessDrawingsController {
    @Resource
    private BaseProcessDrawingsService baseProcessDrawingsService;

    @ApiOperation("配置")
    @RequestMapping(value = "/addInventory", method = RequestMethod.POST)
    public ResultVO add(@RequestBody ProcessDrawingsVo dto) {

        return baseProcessDrawingsService.addProcess(dto);
    }

    @ApiOperation("新增")
    @RequestMapping(value = "/addDrawingPath", method = RequestMethod.POST)
    public ResultVO addDrawingPath(@RequestBody BaseProcessDrawingsDTO dto) {

        return baseProcessDrawingsService.addDrawingPath(dto);
    }

    @ApiOperation("新增物料分页列表")
    @RequestMapping(value = "/addInventoryList", method = RequestMethod.POST)
    public ResultVO addInventoryList(@RequestBody BaseProcessDrawingsDTO dto) {

        return baseProcessDrawingsService.addInventoryList(dto);
    }

    @ApiOperation("分页查询")
    @RequestMapping(
            value = {"/selectPageList"},
            method = {RequestMethod.GET}
    )
    public ResultVO selectPageList(BaseProcessDrawingsDTO dto) {
        return baseProcessDrawingsService.quueryPageList(dto);
    }

    @ApiOperation("模板导出excel数据")
    @RequestMapping(
            value = {"/exportExcel"},
            method = {RequestMethod.GET}
    )
    public void exportExcel(HttpServletResponse response) throws IOException {
        List<BaseProcessDrawingsExcel> bmDemoExcelList = new ArrayList<>();
        BaseProcessDrawingsExcel bmDemoExcel = new BaseProcessDrawingsExcel();
        bmDemoExcelList.add(bmDemoExcel);
        //设置样式参数
        ExportParams exportParams = new ExportParams(null, null, ExcelType.XSSF);
        exportParams.setStyle(ExcelExportStyle.class);
        //导出操作
        ExcelUtil.exportExcel(bmDemoExcelList, BaseProcessDrawingsExcel.class, "test", exportParams, response);
    }

    @ApiOperation("导入excel数据")
    @RequestMapping(
            value = {"/importExcel"},
            method = {RequestMethod.POST}
    )
    public ResultVO importExcelDemo(@RequestParam("file") MultipartFile file) throws IOException {
        //导入操作
        List<BaseProcessDrawingsExcel> bmDemoExcelList = ExcelUtil.importExcel(file, 0, 1, BaseProcessDrawingsExcel.class);

        return baseProcessDrawingsService.addExcelProcessTime(bmDemoExcelList);
    }

}