package com.bpm.lj.mes.base.server.domain;

import java.util.Date;
import lombok.Data;

/**
 * 工厂建模表
 */
@Data
public class BaseLocation {
    private Integer id;

    /**
     * 类型，10：工厂，20：车间，30：工作中心
     */
    private Integer type;

    /**
     * 父ID
     */
    private Integer pId;

    /**
     * 编号
     */
    private String code;

    /**
     * 名称
     */
    private String name;

    private Date createTime;

    private Integer creatorId;

    private Date updateTime;

    private Integer updaterId;

    private Integer sort;
}