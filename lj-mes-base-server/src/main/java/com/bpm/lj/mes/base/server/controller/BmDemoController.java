package com.bpm.lj.mes.base.server.controller;


import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.bpm.common.service.util.ExcelExportStyle;
import com.bpm.common.service.util.ExcelUtil;
import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.dto.BmDemoExcel;
import com.bpm.lj.mes.base.server.dto.DemoAddDTO;
import com.bpm.lj.mes.base.server.dto.DemoQueryDTO;
import com.bpm.lj.mes.base.server.service.BmDemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * <p>Title: BmDemoController</p>
 * <p>Description: demo控制类</p>
 * <p>Company: http://www.wootion.com/</p>
 * <p>create date: 2020/04/03</p>
 *
 * @author :tanhuan
 * @version :1.0
 */
@RestController
@RequestMapping(value = "/demo")
@Api(description = "demo案例")
public class BmDemoController {

    @Autowired
    private BmDemoService bmDemoService;

    @ApiOperation("新增/修改demo")
    @RequestMapping(
            value = {"/addDemo"},
            method = {RequestMethod.POST}
    )
    public ResultVO addDemo(@RequestBody DemoAddDTO demoAddDTO) {
        return bmDemoService.addDemo(demoAddDTO);
    }

    @ApiOperation("根据id删除demo")
    @RequestMapping(
            value = {"/deleteDemo/{id}"},
            method = {RequestMethod.DELETE}
    )
    public ResultVO deleteDemo(@PathVariable Integer id) {
        return bmDemoService.deleteDemo(id);
    }

    @ApiOperation("分页查询demo")
    @RequestMapping(
            value = {"/findDemoPageList"},
            method = {RequestMethod.GET}
    )
    public ResultVO findDemoPageList(DemoQueryDTO demoQueryDTO) {
        return bmDemoService.findDemoPageList(demoQueryDTO);
    }


    @ApiOperation("demo导出excel数据")
    @RequestMapping(
            value = {"/exportExcelDemo"},
            method = {RequestMethod.GET}
    )
    public void exportExcelDemo(HttpServletResponse response, DemoQueryDTO demoQueryDTO) throws IOException {
        List<BmDemoExcel> bmDemoExcelList = (List<BmDemoExcel>) bmDemoService.findDemoPageList(demoQueryDTO).getData();
        //设置样式参数
        ExportParams exportParams = new ExportParams();
        exportParams.setStyle(ExcelExportStyle.class);
        //导出操作
        ExcelUtil.exportExcel(bmDemoExcelList, BmDemoExcel.class, "test", exportParams, response);
    }

    @ApiOperation("demo导入excel数据")
    @RequestMapping(
            value = {"/importExcelDemo"},
            method = {RequestMethod.POST}
    )
    public void importExcelDemo(@RequestParam("file") MultipartFile file) throws IOException {
        //导入操作
        List<BmDemoExcel> bmDemoExcelList = ExcelUtil.importExcel(file, 0, 1, BmDemoExcel.class);


    }


  /*  @ApiOperation("下载excel模板")
    @RequestMapping(
            value = {"/downloadExcelTemplate"},
            method = {RequestMethod.GET}
    )
    public void downloadExcelTemplate(HttpServletResponse response) throws Exception {
        List<BmDemoExcel> bmDemoExcelList = new ArrayList<BmDemoExcel>();
        BmDemoExcel bmDemoExcel = new BmDemoExcel();
        Object object = Tool.objectToMap(BmDemoExcel.class);
        bmDemoExcel = (BmDemoExcel) object;
        bmDemoExcelList.add(bmDemoExcel);
        ExportParams exportParams = new ExportParams();
        exportParams.setStyle(ExcelExportStyle.class);
        //导出操作
        ExcelUtil.exportExcel(bmDemoExcelList, BmDemoExcel.class, "template", exportParams, response);
    }*/


}
