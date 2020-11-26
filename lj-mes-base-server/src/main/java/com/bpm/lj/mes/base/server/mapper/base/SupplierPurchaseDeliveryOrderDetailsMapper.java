package com.bpm.lj.mes.base.server.mapper.base;

import com.bpm.lj.mes.base.server.domain.SupplierPurchaseDeliveryOrderDetails;
import com.bpm.lj.mes.base.server.domain.SupplierPurchaseDeliveryOrderDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierPurchaseDeliveryOrderDetailsMapper {
    long countByExample(SupplierPurchaseDeliveryOrderDetailsExample example);

    int deleteByExample(SupplierPurchaseDeliveryOrderDetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SupplierPurchaseDeliveryOrderDetails record);

    int insertSelective(SupplierPurchaseDeliveryOrderDetails record);

    List<SupplierPurchaseDeliveryOrderDetails> selectByExample(SupplierPurchaseDeliveryOrderDetailsExample example);

    SupplierPurchaseDeliveryOrderDetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SupplierPurchaseDeliveryOrderDetails record, @Param("example") SupplierPurchaseDeliveryOrderDetailsExample example);

    int updateByExample(@Param("record") SupplierPurchaseDeliveryOrderDetails record, @Param("example") SupplierPurchaseDeliveryOrderDetailsExample example);

    int updateByPrimaryKeySelective(SupplierPurchaseDeliveryOrderDetails record);

    int updateByPrimaryKey(SupplierPurchaseDeliveryOrderDetails record);
}