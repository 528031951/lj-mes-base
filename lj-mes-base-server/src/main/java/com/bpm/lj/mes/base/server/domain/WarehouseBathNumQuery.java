package com.bpm.lj.mes.base.server.domain;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 批号库存查询
 */
@Data
public class WarehouseBathNumQuery {
    private Integer id;

    /**
     * 单据编号
     */
    private String billNo;

    /**
     * 合同号
     */
    private String contractNo;

    /**
     * 批号
     */
    private String batchNo;

    /**
     * BOM编号
     */
    private String bomNo;

    /**
     * 物料类型
     */
    private String materialType;

    /**
     * 物料名称
     */
    private String materialName;

    /**
     * 物料型号
     */
    private String materialModel;

    /**
     * 单位
     */
    private String unit;

    /**
     * 需求数量
     */
    private BigDecimal demandNo;

    /**
     * 库存未锁定数量
     */
    private Integer inventoryNlockedNum;

    /**
     * 库存总量
     */
    private BigDecimal totalInventory;

    /**
     * 在制品数量
     */
    private BigDecimal makeNo;

    /**
     * 虚拟库存数量
     */
    private BigDecimal fictitiousInventoryQuantity;

    /**
     * 寄存库存量
     */
    private BigDecimal consignmentStock;

    /**
     * 采购已下单未发货
     */
    private BigDecimal purchaseOrderNotDelivered;

    /**
     * 采购已到货未入库
     */
    private BigDecimal purchaseOrderNotDeposit;

    /**
     * 采购未入库量
     */
    private BigDecimal purchaseQuantityNotDeposit;

    /**
     * 需购买量
     */
    private BigDecimal nPurchaseNum;

    /**
     * 最低库存量
     */
    private BigDecimal miniInventoryNum;

    /**
     * 最高库存量
     */
    private BigDecimal maxInventoryNum;

    /**
     * 采购周期
     */
    private String procurementCycle;

    /**
     * 锁定状态1锁定 0未锁定
     */
    private Integer lockStatus;

    private Date createTime;

    private Integer createrId;

    private Date updateTime;

    private Integer updaterId;

    /**
     * 锁定数量
     */
    private BigDecimal nlockedNum;
}