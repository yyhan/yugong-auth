package org.yugong.auth.common;

import java.io.Serializable;

/**
 * @author 小天
 * @date 2019/12/12 21:43
 */
public class BaseResult<T> implements Serializable {
    private Integer code;
    private String message;
    private T data;
    private transient Exception exception;

    public BaseResult() {
    }

    public BaseResult(T data) {
        this.data = data;
    }

    public BaseResult(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public BaseResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <U> BaseResult<U> build() {
        return new BaseResult<>();
    }

    public static <U> BaseResult<U> build(U data) {
        return new BaseResult<>(data);
    }

    public BaseResult<T> success() {
        this.code = 0;
        return this;
    }

    public BaseResult<T> success(T data) {
        this.code = 0;
        this.data = data;
        return this;
    }

    public BaseResult<T> error(int code, String message) {
        this.code = code;
        this.message = message;
        return this;
    }

    public BaseResult<T> error(int code, String message, Exception exception) {
        this.code = code;
        this.message = message;
        this.exception = exception;
        return this;
    }

    public BaseResult<T> withCode(int code) {
        this.code = code;
        return this;
    }

    public BaseResult<T> withMessage(String message) {
        this.message = message;
        return this;
    }

    public BaseResult<T> withData(T data) {
        this.data = data;
        return this;
    }

    public boolean isSuccess() {
        return this.code == 0;
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Exception getException() {
        return this.exception;
    }

    public String toString() {
        if (this.data == null) {
            return this.exception == null ? String.format("code=%s,message=%s", this.code, this.message) : String.format("code=%s,message=%s,exception=%s", this.code, this.message, this.exception.getMessage());
        } else {
            return String.format("code=%s,message=%s,data=%s", this.code, this.message, this.data.toString());
        }
    }
}
