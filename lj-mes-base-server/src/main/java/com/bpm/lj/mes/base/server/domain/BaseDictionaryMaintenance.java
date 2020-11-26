package com.bpm.lj.mes.base.server.domain;

import java.util.Date;
import lombok.Data;

/**
 * 字典维护表
 */
@Data
public class BaseDictionaryMaintenance {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 父级id
     */
    private Integer parentId;

    /**
     * 编码
     */
    private String code;

    /**
     * 名称
     */
    private String name;

    /**
     * 状态（0-启用，1-停用）
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 创建人id
     */
    private Integer creatorId;

    /**
     * 修改人id
     */
    private Integer updaterId;
}