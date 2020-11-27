package com.bpm.lj.mes.base.server.service.impl;

import com.bpm.lj.mes.base.common.util.ResultUtil;
import com.bpm.lj.mes.base.common.vo.PageInfoVO;
import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.domain.BaseInventoryAttributes;
import com.bpm.lj.mes.base.server.dto.BaseInventoryAttributesDTO;
import com.bpm.lj.mes.base.server.dto.BaseInventoryAttributesExcel;
import com.bpm.lj.mes.base.server.dto.BaseInventoryAttributesQueryDTO;
import com.bpm.lj.mes.base.server.mapper.base.BaseInventoryAttributesMapper;
import com.bpm.lj.mes.base.server.mapper.ext.BaseInventoryAttributesExtMapper;
import com.bpm.lj.mes.base.server.service.BaseInventoryAttributesService;
import com.bpm.lj.mes.base.server.vo.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(rollbackFor = Exception.class)
public class BaseInventoryAttributesServiceImpl implements BaseInventoryAttributesService {
    @Resource
    private BaseInventoryAttributesMapper baseInventoryAttributesMapper;

    @Resource
    private BaseInventoryAttributesExtMapper baseInventoryAttributesExtMapper;

    @Override
    public ResultVO selectPageList(BaseInventoryAttributesQueryDTO vo) {
        PageHelper.startPage(vo.getPageNum(), vo.getPageSize());
        List<BaseInventoryAttributesVo> baseInventoryAttributesVos = baseInventoryAttributesExtMapper.selectPageList(vo);
        PageInfo<BaseInventoryAttributesVo> pageInfo = new PageInfo<>(baseInventoryAttributesVos);
        PageInfoVO pageInfoVO = ResultUtil.successPageInfo();
        BeanUtils.copyProperties(pageInfo, pageInfoVO);
        pageInfoVO.setData(pageInfo.getList());
        return ResultUtil.success(pageInfoVO);

    }

    /**
     * 修改或新增
     * @param dto
     * @return
     */
    @Override
    public ResultVO addInventory(BaseInventoryAttributesDTO dto) {
        BaseInventoryAttributes baseInventoryAttributes = new BaseInventoryAttributes();
        BeanUtils.copyProperties(dto, baseInventoryAttributes);
        if (dto.getId() == null) {
            baseInventoryAttributesMapper.insertSelective(baseInventoryAttributes);
        } else {
            baseInventoryAttributesMapper.updateByPrimaryKeySelective(baseInventoryAttributes);
        }
        return ResultUtil.success();
    }

    @Override
    public ResultVO deleted(Integer id) {
        baseInventoryAttributesMapper.deleteByPrimaryKey(id);
        return ResultUtil.success();
    }

    @Override
    public ResultVO materialList(String code) {
        BaseInventoryAttributesQueryDTO queryDTO = new BaseInventoryAttributesQueryDTO();
        queryDTO.setCInvCName(code);
        queryDTO.setPageSize(1000);
        List<BaseMaterialVo> baseMaterialVos = baseInventoryAttributesExtMapper.materialList(queryDTO);
        return ResultUtil.success(baseMaterialVos);
    }

    @Override
    public ResultVO materialType() {
        List<BaseMaterialVo> baseMaterialVos = baseInventoryAttributesExtMapper.materialType();
        return ResultUtil.success(baseMaterialVos);
    }

    @Override
    public ResultVO archivesList(BaseInventoryArchivesVo vo) {
        PageHelper.startPage(vo.getPageNum(), vo.getPageSize());
        List<BaseInventoryArchivesVo> baseInventoryArchivesVos = baseInventoryAttributesExtMapper.archivesList(vo);
        PageInfo<BaseInventoryArchivesVo> pageInfo = new PageInfo<>(baseInventoryArchivesVos);
        PageInfoVO pageInfoVO = ResultUtil.successPageInfo();
        BeanUtils.copyProperties(pageInfo, pageInfoVO);
        pageInfoVO.setData(pageInfo.getList());
        return ResultUtil.success(pageInfoVO);
    }


    /**
     * 导入
     * @param excelList
     */
    @Override
    public void addExcel(List<BaseInventoryAttributesExcel> excelList) {
        //新增
        List<BaseInventoryAttributes> attributesLists=new ArrayList<>();

        if(null!=excelList && excelList.size()>0){
          List<InventoryVo> autoIdList= baseInventoryAttributesExtMapper.selectAllByMateria(excelList);
          //根据返回数据查询数据库中是否存在
            if(null!=autoIdList && autoIdList.size()>0){
               List<BaseInventoryAttributes>  attributesList=baseInventoryAttributesExtMapper.selectInventoryAttributes(autoIdList);
               //存在则进行修改
               if(null!=attributesList && attributesList.size()>0){
                   List<BaseInventoryAttributes>  attributes= new ArrayList<>();
                   attributesList.forEach(v->{
                       List<InventoryVo> inventoryVoList = autoIdList.stream().filter(item -> item.getAutoId().equals(v.getPId())).collect(Collectors.toList());
                       if(null!=inventoryVoList && inventoryVoList.size()>0){
                           InventoryVo inventoryVo = inventoryVoList.get(0);
                           System.out.println(excelList);
                           List<BaseInventoryAttributesExcel> attributesExcels = excelList.stream().filter(item -> item.getCinvCode().equals(inventoryVo.getCinvCode())).collect(Collectors.toList());
                          if(null!=attributesExcels && attributesExcels.size()>0){
                              BaseInventoryAttributesExcel collect = attributesExcels.get(0);
                              v.setLibraryAge(collect.getLibraryAge());
                              v.setMiniStock(collect.getMiniStock());
                              v.setMaxStock(collect.getMaxStock());
                              v.setRequisitionDay(collect.getRequisitionDay());
                              attributes.add(v);
                              excelList.remove(collect);
                          }
                       }
                   });
                   //批量修改
                   baseInventoryAttributesExtMapper.updateInventoryAttributes(attributes);
               }
                //判断还有数据则新增
                if(null!=excelList && excelList.size()>0){
                    //不存在则新增
                    for (InventoryVo vo : autoIdList) {
                        BaseInventoryAttributes attributes=new BaseInventoryAttributes();
                        List<BaseInventoryAttributesExcel> attributesExcelList = excelList.stream().filter(item -> item.getCinvCode().equals(vo.getCinvCode())).collect(Collectors.toList());
                        if(null!=attributesExcelList && attributesExcelList.size()>0){
                            BaseInventoryAttributesExcel attributesExcel = attributesExcelList.get(0);
                            attributes.setPId(vo.getAutoId())
                                    .setMaxStock(attributesExcel.getMaxStock())
                                    .setMiniStock(attributesExcel.getMiniStock())
                                    .setLibraryAge(attributesExcel.getLibraryAge())
                                    .setRequisitionDay(attributesExcel.getRequisitionDay());
                            attributesLists.add(attributes);
                        }
                    }
                }
            }
        }
        //新增
        if(null!=attributesLists && attributesLists.size()>0){
            baseInventoryAttributesExtMapper.addInventoryAttributes(attributesLists);
        }
    }

    /**
     * 查询导出数据
     * @return
     */
    @Override
    public List<BaseInventoryAttributesExcelVo> queryInventoryExcel() {
        return baseInventoryAttributesExtMapper.selectListInventoryAttributes();
    }
}
