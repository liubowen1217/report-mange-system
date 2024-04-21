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
    private String type;
    private String resultHint;
    private T resultValue;
    private String errorPage;

    public ApiResult() {
    }

    private ApiResult(boolean successful, String type, String resultHint, T resultValue, String errorPage) {
        this.successful = successful;
        this.type = type;
        this.resultValue = resultValue;
        this.resultHint = resultHint;
        this.errorPage = errorPage;
    }

    public static <T> ApiResult<T> ok() {
        return new ApiResult(true, (String) null, (String) null, (Object) null, (String) null);
    }

    public static <T> ApiResult<T> ok(T data) {
        return new ApiResult(true, (String) null, (String) null, data, (String) null);
    }

    public static <T> ApiResult<T> error(GetErrorMessage getErrorMessage) {
        return new ApiResult(false, getErrorMessage.getStatus() + "", getErrorMessage.getMessage(), (Object) null, (String) null);
    }

    public static <T> ApiResult<T> error(Integer status, String errorMessage) {
        return new ApiResult(false, status + "", errorMessage, (Object) null, (String) null);
    }

    public static <T> ApiResult<T> error(Integer status, T data) {
        return new ApiResult(false, status + "", null, data, (String) null);
    }

    public static <T> ApiResult<T> error(Integer status, String errorMessage, T data) {
        return new ApiResult(false, status + "", errorMessage, data, (String) null);
    }

    /**
     * @deprecated
     */
    @Deprecated
    public static <T> ApiResult<T> error(String code, String errorMessage, T data, String errorPage) {
        return new ApiResult(false, code, errorMessage, data, errorPage);
    }

    public boolean isSuccessful() {
        return this.successful;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getResultHint() {
        return this.resultHint;
    }

    public void setResultHint(String resultHint) {
        this.resultHint = resultHint;
    }

    public T getResultValue() {
        return this.resultValue;
    }

    public void setResultValue(T resultValue) {
        this.resultValue = resultValue;
    }

    public String getErrorPage() {
        return this.errorPage;
    }

    public void setErrorPage(String errorPage) {
        this.errorPage = errorPage;
    }
}
