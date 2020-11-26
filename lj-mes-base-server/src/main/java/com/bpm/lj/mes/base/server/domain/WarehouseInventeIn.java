package com.bpm.lj.mes.base.server.domain;

import java.util.Date;
import lombok.Data;

/**
 * 虚拟入库
 */
@Data
public class WarehouseInventeIn {
    private Integer id;

    /**
     * 机型
     */
    private String machineModel;

    /**
     * 型号
     */
    private String model;

    /**
     * 要求出机时间
     */
    private Date reqDepartureDate;

    /**
     * 机器状态 1.完成
     */
    private Integer machineStatus;

    /**
     * 批号运算时间
     */
    private Date batchOperationDate;

    /**
     * 投料结束时间
     */
    private Date feedeEndDate;

    /**
     * 虚拟入库时间
     */
    private Date inventeInDate;

    /**
     * 虚拟入库进度
     */
    private Integer inventeInStatus;

    /**
     * 备注
     */
    private String remarks;

    private Date createTime;

    private Integer createrId;

    private Date updateTime;

    private Integer updaterId;

    /**
     * erp批号
     */
    private String erpBatchCode;
}