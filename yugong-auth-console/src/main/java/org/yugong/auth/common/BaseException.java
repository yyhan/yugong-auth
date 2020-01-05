package org.yugong.auth.common;

/**
 * @author 小天
 * @date 2019/12/14 16:56
 */
public class BaseException extends RuntimeException {
    private Integer code;

    public BaseException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public BaseException(Integer code, String message, Throwable throwable) {
        super(message, throwable);
        this.code = code;
    }

    public BaseException(Integer code, Throwable throwable) {
        super(throwable);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
