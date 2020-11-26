package com.bpm.lj.mes.base.server.domain;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 劳防用品使用
 */
@Data
public class WarehouseProtectionGroup {
    private Integer id;

    /**
     * 领用班组
     */
    private Integer deptId;

    /**
     * 劳防用品id
     */
    private Integer protectionId;

    /**
     * 申请数量
     */
    private BigDecimal applyNum;

    /**
     * 领用数量
     */
    private BigDecimal grandNum;

    /**
     * 领用时间
     */
    private Date grandDate;

    /**
     * 在使用数量
     */
    private BigDecimal inUseNum;

    private Date createTime;

    private Integer createrId;

    private Date updateTime;

    private Integer updaterId;
}