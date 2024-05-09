package com.report.mange.system.utils;

import com.report.mange.system.enums.GetErrorMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(
        value = "ApiResult",
        description = "统一返回对象"
)
public class ApiResult<T> {
    @ApiModelProperty("表示Response信息成功")
    private boolean successful;
    @ApiModelProperty(
            value = "返回码",
            dataType = "int"
    )
    private Integer status;
    private String resultHint;
    private T data;
    private String errorPage;

    public ApiResult() {
    }

    private ApiResult(boolean successful, Integer status, String resultHint, T data, String errorPage) {
        this.successful = successful;
        this.status = status;
        this.data = data;
        this.resultHint = resultHint;
        this.errorPage = errorPage;
    }

    public static <T> ApiResult<T> ok() {
        return new ApiResult(true, 200, (String) null, (Object) null, (String) null);
    }

    public static <T> ApiResult<T> ok(T data) {
        return new ApiResult(true, 200, (String) null, data, (String) null);
    }

    public static <T> ApiResult<T> error(String getErrorMessage) {
        return new ApiResult(false, 500, getErrorMessage, (Object) null, (String) null);
    }

    public static <T> ApiResult<T> error(Integer status, String errorMessage) {
        return new ApiResult(false, status, errorMessage, (Object) null, (String) null);
    }

    public static <T> ApiResult<T> error(Integer status, T data) {
        return new ApiResult(false, status, null, data, (String) null);
    }

    public static <T> ApiResult<T> error(Integer status, String errorMessage, T data) {
        return new ApiResult(false, status, errorMessage, data, (String) null);
    }

    /**
     * @deprecated
     */
    @Deprecated
    public static <T> ApiResult<T> error(Integer code, String errorMessage, T data, String errorPage) {
        return new ApiResult(false, code, errorMessage, data, errorPage);
    }

    public boolean isSuccessful() {
        return this.successful;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getResultHint() {
        return this.resultHint;
    }

    public void setResultHint(String resultHint) {
        this.resultHint = resultHint;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getErrorPage() {
        return this.errorPage;
    }

    public void setErrorPage(String errorPage) {
        this.errorPage = errorPage;
    }
}
