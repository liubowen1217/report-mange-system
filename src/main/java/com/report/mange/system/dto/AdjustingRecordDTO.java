package com.report.mange.system.dto;

import javax.persistence.Column;
import java.util.Date;

public class AdjustingRecordDTO {
    /**
     * 备注
     */
    private String remark;


    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;
}
