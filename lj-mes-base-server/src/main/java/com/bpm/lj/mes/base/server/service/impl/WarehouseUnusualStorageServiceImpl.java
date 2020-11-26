package com.bpm.lj.mes.base.server.service.impl;

import com.bpm.lj.mes.base.common.util.ResultUtil;
import com.bpm.lj.mes.base.common.vo.PageInfoVO;
import com.bpm.lj.mes.base.common.vo.ResultVO;
import com.bpm.lj.mes.base.server.domain.SupplierPurchaseDeliveryOrderDetails;
import com.bpm.lj.mes.base.server.domain.WarehouseUnusualStorage;
import com.bpm.lj.mes.base.server.dto.WarehouseSalesReturnDTO;
import com.bpm.lj.mes.base.server.dto.WarehouseUnusualStorageDTO;
import com.bpm.lj.mes.base.server.mapper.base.SupplierPurchaseDeliveryOrderDetailsMapper;
import com.bpm.lj.mes.base.server.mapper.base.WarehouseUnusualStorageMapper;
import com.bpm.lj.mes.base.server.mapper.ext.SupplierPurchaseDeliveryOrderDetailsExtMapper;
import com.bpm.lj.mes.base.server.mapper.ext.WarehouseUnusualStorageExtMapper;
import com.bpm.lj.mes.base.server.service.WarehouseUnusualStorageService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WarehouseUnusualStorageServiceImpl implements WarehouseUnusualStorageService {
    @Resource
    private WarehouseUnusualStorageMapper warehouseUnusualStorageMapper;
    @Resource
    private WarehouseUnusualStorageExtMapper warehouseUnusualStorageExtMapper;
    @Resource
    private SupplierPurchaseDeliveryOrderDetailsMapper supplierPurchaseDeliveryOrderDetailsMapper;
    @Resource
    private SupplierPurchaseDeliveryOrderDetailsExtMapper supplierPurchaseDeliveryOrderDetailsExtMapper;
    @Override
    public ResultVO quepageList(WarehouseUnusualStorageDTO dto) {
        PageHelper.startPage(dto.getPageNum(), dto.getPageSize());
        List<WarehouseUnusualStorageDTO> baseInventoryAttributesVos = warehouseUnusualStorageExtMapper.queryPageList(dto);
        PageInfo<WarehouseUnusualStorageDTO> pageInfo = new PageInfo<>(baseInventoryAttributesVos);
        PageInfoVO pageInfoVO = ResultUtil.successPageInfo();
        BeanUtils.copyProperties(pageInfo, pageInfoVO);
        pageInfoVO.setData(pageInfo.getList());
        return ResultUtil.success(pageInfoVO);
    }

    @Override
    public ResultVO salesReturn(WarehouseSalesReturnDTO dto) {
        SupplierPurchaseDeliveryOrderDetails supplierPurchaseDeliveryOrderDetails = new SupplierPurchaseDeliveryOrderDetails();
        Integer integer = supplierPurchaseDeliveryOrderDetailsExtMapper.queryId(dto);
        supplierPurchaseDeliveryOrderDetails.setId(integer);
        supplierPurchaseDeliveryOrderDetails.setRemark(dto.getExceptionRemarks());
        supplierPurchaseDeliveryOrderDetails.setSpecialNum(dto.getAbnormalNum());
        return ResultUtil.success();
    }

    @Override
    public ResultVO special(WarehouseSalesReturnDTO dto) {
        SupplierPurchaseDeliveryOrderDetails supplierPurchaseDeliveryOrderDetails = new SupplierPurchaseDeliveryOrderDetails();
        Integer integer = supplierPurchaseDeliveryOrderDetailsExtMapper.queryId(dto);
        supplierPurchaseDeliveryOrderDetails.setId(integer);
        supplierPurchaseDeliveryOrderDetails.setRemark(dto.getExceptionRemarks());
        supplierPurchaseDeliveryOrderDetails.setSpecialNum(dto.getAbnormalNum());
        return ResultUtil.success();
    }

    @Override
    public ResultVO close(Integer id) {
        WarehouseUnusualStorage warehouseUnusualStorage = new WarehouseUnusualStorage();
        warehouseUnusualStorage.setId(id);
        warehouseUnusualStorage.setStatus(0);
        warehouseUnusualStorageMapper.updateByPrimaryKeySelective(warehouseUnusualStorage);
        return ResultUtil.success();
    }

    @Override
    public ResultVO register(Integer id, Integer registerNum) {
        WarehouseUnusualStorage warehouseUnusualStorage = new WarehouseUnusualStorage();
        warehouseUnusualStorage.setId(id);
        warehouseUnusualStorage.setStatus(4);
        warehouseUnusualStorage.setRegisterNum(registerNum);
        warehouseUnusualStorageMapper.updateByPrimaryKeySelective(warehouseUnusualStorage);
        return ResultUtil.success();
    }


}
