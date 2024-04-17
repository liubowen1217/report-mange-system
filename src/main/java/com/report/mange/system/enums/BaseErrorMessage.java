package com.report.mange.system.enums;

/**
 * @ProjectName: cmc_meter
 * @Package: com.sgcc.eip.cmc.framework.error
 * @ClassName: BaseErrorMessage
 * @Author: 张燕鹏
 * @Description:
 * @Date: 2020/4/20 9:30
 * @Version: 1.0
 */
public enum BaseErrorMessage implements GetErrorMessage {
    BAD_REQUEST(400, "Bad Request"),
    UNAUTHORIZED(401, "Unauthorized"),
    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND(404, "Not Found"),
    REQUEST_TIMEOUT(408, "Request Timeout"),
    Repeated_Submission(499, "Repeated Submission"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
    BAD_GATEWAY(502, "Bad Gateway"),
    GATEWAY_TIMEOUT(504, "Gateway Timeout"),
    ONCE_SECURE_ERROR(4001, "Once Secure Error"),
    SIGNATRUE_ERROR(4002, "Signature Error");

    private int status;
    private String message;

    private BaseErrorMessage(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return this.status;
    }

    public String getMessage() {
        return this.message;
    }
}
