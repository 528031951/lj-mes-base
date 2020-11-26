package com.bpm.lj.mes.base.server.service.impl;

import com.bpm.lj.mes.base.common.util.ResultUtil;
import com.bpm.lj.mes.base.common.vo.PageInfoVO;
import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.domain.BaseShift;
import com.bpm.lj.mes.base.server.domain.BaseShiftExample;
import com.bpm.lj.mes.base.server.dto.BmShiftDTO;
import com.bpm.lj.mes.base.server.mapper.base.BaseShiftMapper;
import com.bpm.lj.mes.base.server.mapper.ext.BmShiftExtMapper;
import com.bpm.lj.mes.base.server.service.BmShiftService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * <p>Title: BaseShiftServiceImpl</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2020/5/22 8:02 上午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
@Slf4j
@Service
public class BmShiftServiceImpl implements BmShiftService {
    @Autowired
    private BaseShiftMapper baseShiftMapper;

    @Autowired
    private BmShiftExtMapper baseShiftExtMapper;

    @Override
    public ResultVO addBmShift(BmShiftDTO baseShiftDTO) {
        int byCode = baseShiftExtMapper.queryByCode(baseShiftDTO);
        if (byCode != 0) {
            return ResultUtil.error("编码重复");
        }
        BaseShift baseShift = new BaseShift();
        Integer code = 200;
        BeanUtils.copyProperties(baseShiftDTO, baseShift);
        if (baseShiftDTO.getId() == null) {

            try {
                baseShift.setCreateTime(new Date());
                baseShift.setUpdateTime(new Date());
                int insert = baseShiftMapper.insert(baseShift);

                code = 200;
            } catch (Exception e) {
                log.error("异常：" + e.getMessage());
                code = 300;
            }
        } else {

            try {
                baseShift.setUpdateTime(new Date());

                baseShiftMapper.updateByPrimaryKeySelective(baseShift);
                code = 200;
            } catch (Exception e) {
                code = 300;
            }

        }


        return ResultUtil.success();

    }

    @Override
    public ResultVO deleteBmShift(Integer id) {
        Integer code = null;
        try {
            BaseShift baseShift = baseShiftExtMapper.selectById(id);
            if ("1".equals(baseShift.getIsEnable())) {
                return ResultUtil.error("启用状态的班次删除失败！");
            }
            baseShiftMapper.deleteByPrimaryKey(id);
            code = 200;
        } catch (Exception e) {
            code = 300;
        }

        if (code == 200) {
            return ResultUtil.success();
        } else {
            return ResultUtil.error("班次删除失败！");
        }
    }


    @Override
    public ResultVO bmShiftById(Integer id) {
        Integer code = null;
        BaseShift baseShift = new BaseShift();
        try {
            baseShift = baseShiftExtMapper.selectById(id);
            code = 200;
        } catch (Exception e) {
            code = 300;
        }

        if (code == 200) {
            return ResultUtil.success(baseShift);
        } else {
            return ResultUtil.error("查询失败！");
        }

    }

    @Override
    public ResultVO queryBmShift(BmShiftDTO baseShiftDTO) {
        PageHelper.startPage(baseShiftDTO.getPageNum(), baseShiftDTO.getPageSize());
        BaseShiftExample baseShiftExample = new BaseShiftExample();
        BeanUtils.copyProperties(baseShiftDTO, baseShiftExample);
        List<BaseShift> baseShifts = baseShiftExtMapper.selectBmList(baseShiftDTO);
//        List<BaseShift> BaseShifts = BaseShiftMapper.selectByExample(BaseShiftExample);
        PageInfo<BaseShift> pageInfo = new PageInfo<>(baseShifts);
        PageInfoVO pageInfoVO = ResultUtil.successPageInfo();
        BeanUtils.copyProperties(pageInfo, pageInfoVO);
        pageInfoVO.setData(pageInfo.getList());
        return ResultUtil.success(pageInfoVO);

    }


}
