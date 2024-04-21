package com.report.mange.system.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("基础查询类")
public class BaseQuery {

    @ApiModelProperty(value = "每页行数", required = true, example = "20")
    private Integer pageSize = 20;

    @ApiModelProperty(value = "当前页数", required = true, example = "1")
    private Integer pageNum = 1;

    @ApiModelProperty(value = "数据权限编码")
    private String  inOrgCode ;

    @ApiModelProperty(value = "数据权限编码")
    private String  outOrgCode ;

    @ApiModelProperty(value = "排序条件")
    private String  orderBy ;

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public String getInOrgCode() {
        return inOrgCode;
    }

    public void setInOrgCode(String inOrgCode) {
        this.inOrgCode = inOrgCode;
    }

    public String getOutOrgCode() {
        return outOrgCode;
    }

    public void setOutOrgCode(String outOrgCode) {
        this.outOrgCode = outOrgCode;
    }

    @Override
    public String toString() {
        return "BaseQuery{" +
                "pageSize=" + pageSize +
                ", pageNum=" + pageNum +
                '}';
    }
}
