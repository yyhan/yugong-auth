package org.yugong.auth.common;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * @author 小天
 * @date 2019/12/12 22:00
 */
public class BasePageResult<T> extends BaseResult<List<T>> implements Serializable {
    private Integer total;
    private Integer filteredTotal;

    public BasePageResult() {
    }

    public BasePageResult(Integer code, String message) {
        super(code, message);
    }

    public BasePageResult(List<T> data, Integer total, Integer filteredTotal) {
        super(data);
        this.total = total;
        this.filteredTotal = filteredTotal;
    }

    public BasePageResult(List<T> data) {
        super(data);
    }

    public static <U> BasePageResult<U> build(List<U> data) {
        return new BasePageResult<>(data);
    }

    public BasePageResult<T> success(List<T> data, Integer total) {
        super.success(data);
        this.total = total;
        this.filteredTotal = total;
        return this;
    }

    public BasePageResult<T> success(List<T> data, Integer total, Integer filteredTotal) {
        super.success(data);
        this.total = total;
        this.filteredTotal = filteredTotal;
        return this;
    }

    public BasePageResult<T> empty() {
        super.success(Collections.emptyList());
        this.total = 0;
        this.filteredTotal = 0;
        return this;
    }

    public BasePageResult<T> error(int code, String message) {
        super.error(code, message);
        return this;
    }

    public BasePageResult<T> error(int code, String message, Exception exception) {
        super.error(code, message, exception);
        return this;
    }

    public BasePageResult<T> withCode(int code) {
        super.withCode(code);
        return this;
    }

    public BasePageResult<T> withMessage(String message) {
        super.withMessage(message);
        return this;
    }

    public BasePageResult<T> withData(List<T> data) {
        super.withData(data);
        return this;
    }

    public Integer getTotal() {
        return this.total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getFilteredTotal() {
        return this.filteredTotal;
    }

    public void setFilteredTotal(Integer filteredTotal) {
        this.filteredTotal = filteredTotal;
    }
}
