package com.bpm.lj.mes.base.server.domain;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * Bom子件表
 */
@Data
public class BomOpcomponent {
    private Integer autoid;

    private String caccId;

    private Integer opcomponentid;

    private String cinvcode;

    private Integer partid;

    private Integer bomid;

    private Integer irowno;

    private String cbomgrade;

    private String cinvcodeSub;

    private Integer partidSub;

    private String cbomattr;

    private String csupplytype;

    private BigDecimal baseqtyn;

    private BigDecimal baseqtyd;

    private BigDecimal compscrap;

    private BigDecimal ibomqty;

    private Date dcreatedate;

    private String cfree1;

    private String cfree2;
}