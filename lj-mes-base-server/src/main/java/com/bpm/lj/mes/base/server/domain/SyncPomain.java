package com.bpm.lj.mes.base.server.domain;

import java.util.Date;
import lombok.Data;

/**
 * 采购订单同步erp
 */
@Data
public class SyncPomain {
    private Integer id;

    /**
     * 采购订单号
     */
    private String ccode;

    /**
     * 时间
     */
    private Date ddate;
}