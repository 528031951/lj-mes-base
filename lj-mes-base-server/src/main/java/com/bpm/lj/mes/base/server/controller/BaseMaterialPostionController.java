package com.bpm.lj.mes.base.server.controller;

import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.enmus.ExcelType;
import com.bpm.common.service.util.ExcelExportStyle;
import com.bpm.common.service.util.ExcelUtil;
import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.domain.BaseMaterialPostion;
import com.bpm.lj.mes.base.server.service.BaseMaterialPostionService;
import com.bpm.lj.mes.base.server.vo.BaseMaterialPostionVo;
import com.bpm.lj.mes.base.server.vo.MaterialPostionExcel;
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
 * 物料货位.
 */
@RestController
@RequestMapping(value = "/materialPostion")
@Api(description = "物料货位")
public class BaseMaterialPostionController {
    @Resource
    private BaseMaterialPostionService baseMaterialPostionService;

    @ApiOperation("新增/修改")
    @RequestMapping(value = "/addProcessTime", method = RequestMethod.POST)
    public ResultVO add(@RequestBody BaseMaterialPostion dto) {

        return baseMaterialPostionService.addMaterialPostion(dto);
    }

    @ApiOperation("分页查询")
    @RequestMapping(
            value = {"/queryPageList"},
            method = {RequestMethod.GET}
    )
    public ResultVO selectPageList(BaseMaterialPostionVo dto) {
        return baseMaterialPostionService.pageList(dto);
    }

    @ApiOperation("删除")
    @RequestMapping(
            value = {"/deleted"},
            method = {RequestMethod.GET}
    )
    public ResultVO deleted(Integer id) {
        return baseMaterialPostionService.deleted(id);
    }


    @ApiOperation("物料/货位集合")
    @RequestMapping(
            value = {"/queryProcess"},
            method = {RequestMethod.GET}
    )
    public ResultVO queryProcess() {
        return baseMaterialPostionService.materialPostionList();
    }


    @ApiOperation("导出excel数据")
    @RequestMapping(
            value = {"/exportExcel"},
            method = {RequestMethod.GET}
    )
    public void exportExcel(HttpServletResponse response, BaseMaterialPostionVo dto) throws IOException {
        List<BaseMaterialPostionVo> baseMaterialPostionVos = baseMaterialPostionService.excelList(dto);
        List<MaterialPostionExcel> bmDemoExcelList = new ArrayList<>();
        for (BaseMaterialPostionVo baseMaterialPostionVo : baseMaterialPostionVos) {
            MaterialPostionExcel bmDemoExcel = new MaterialPostionExcel();
            bmDemoExcel.setCinvCode(baseMaterialPostionVo.getCInvCode());
            bmDemoExcel.setCinvName(baseMaterialPostionVo.getCInvName());
            bmDemoExcel.setCposCode(baseMaterialPostionVo.getCPosCode());
            bmDemoExcel.setCposName(baseMaterialPostionVo.getCPosName());
            bmDemoExcelList.add(bmDemoExcel);
        }
        //设置样式参数
        ExportParams exportParams = new ExportParams(null, null, ExcelType.XSSF);
        exportParams.setStyle(ExcelExportStyle.class);
        //导出操作
        ExcelUtil.exportExcel(bmDemoExcelList, MaterialPostionExcel.class, "test", exportParams, response);
    }

    @ApiOperation("模板导出excel数据")
    @RequestMapping(
            value = {"/exportExcelDemo"},
            method = {RequestMethod.GET}
    )
    public void exportExcelDemo(HttpServletResponse response) throws IOException {
        List<MaterialPostionExcel> bmDemoExcelList = new ArrayList<>();
        MaterialPostionExcel bmDemoExcel = new MaterialPostionExcel();
        bmDemoExcelList.add(bmDemoExcel);
        //设置样式参数
        ExportParams exportParams = new ExportParams(null, null, ExcelType.XSSF);
        exportParams.setStyle(ExcelExportStyle.class);
        //导出操作
        ExcelUtil.exportExcel(bmDemoExcelList, MaterialPostionExcel.class, "test", exportParams, response);
    }

    @ApiOperation("导入excel数据")
    @RequestMapping(
            value = {"/importExcel"},
            method = {RequestMethod.POST}
    )
    public ResultVO importExcelDemo(@RequestParam("file") MultipartFile file) throws IOException {
        //导入操作
        List<MaterialPostionExcel> bmDemoExcelList = ExcelUtil.importExcel(file, 0, 1, MaterialPostionExcel.class);

        return baseMaterialPostionService.addExcelProcessTime(bmDemoExcelList);
    }

}