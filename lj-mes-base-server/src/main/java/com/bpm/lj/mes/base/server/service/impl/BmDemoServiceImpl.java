package com.bpm.lj.mes.base.server.service.impl;

import com.bpm.lj.mes.base.common.vo.PageInfoVO;
import com.bpm.lj.mes.base.common.util.ResultUtil;
import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.domain.BmDemo;
import com.bpm.lj.mes.base.server.dto.BmDemoExcel;
import com.bpm.lj.mes.base.server.dto.DemoAddDTO;
import com.bpm.lj.mes.base.server.dto.DemoQueryDTO;
import com.bpm.lj.mes.base.server.mapper.base.BmDemoMapper;
import com.bpm.lj.mes.base.server.mapper.ext.BmDemoExtMapper;
import com.bpm.lj.mes.base.server.service.BmDemoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BmDemoServiceImpl implements BmDemoService {

    @Autowired
    private BmDemoMapper bmDemoMapper;

    @Autowired
    private BmDemoExtMapper bmDemoExtMapper;

    /**
     * 新增/修改demo
     * @param demoAddDTO
     * @return
     */
    @Override
    public ResultVO addDemo(DemoAddDTO demoAddDTO) {
        BmDemo bmDemo = new BmDemo();
        BeanUtils.copyProperties(demoAddDTO, bmDemo);
        if(demoAddDTO.getId() != null){//修改
            return ResultUtil.success(bmDemoMapper.updateByPrimaryKey(bmDemo));
        }else{//新增
            return ResultUtil.success(bmDemoMapper.insertSelective(bmDemo));
        }
    }

    /**
     * 根据id删除demo
     * @param id
     * @return
     */
    @Override
    public ResultVO deleteDemo(Integer id) {
        return ResultUtil.success(bmDemoMapper.deleteByPrimaryKey(id.longValue()));
    }

    /**
     * 分页查询demo
     * @param demoQueryDTO
     * @return
     */
    @Override
    public ResultVO findDemoPageList(DemoQueryDTO demoQueryDTO) {
        // 分页
        PageHelper.startPage(demoQueryDTO.getPageNum(), demoQueryDTO.getPageSize());
        List<BmDemoExcel> bmDemoExcelList = bmDemoExtMapper.findDemoPageList(demoQueryDTO);
        PageInfo<BmDemoExcel> pageInfo = new PageInfo<>(bmDemoExcelList);
        // copy数据
        PageInfoVO pageInfoVO = ResultUtil.successPageInfo();
        BeanUtils.copyProperties(pageInfo, pageInfoVO);
        pageInfoVO.setData(pageInfo.getList());
        return pageInfoVO;
    }

}
