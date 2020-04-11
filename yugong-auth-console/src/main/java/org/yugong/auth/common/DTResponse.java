package org.yugong.auth.common;

import java.util.Collections;
import java.util.List;

/**
 * @author 小天
 * @date 2019/12/12 21:59
 */
public class DTResponse<T> extends BasePageResult<T> {
    private int draw;

    public DTResponse(int draw) {
        this.draw = draw;
    }

    public DTResponse(DTRequest dtRequest) {
        this.draw = dtRequest.getDraw();
    }

    public DTResponse(int draw, int code, String message) {
        super(code, message);
        this.draw = draw;
    }

    public DTResponse(int draw, List<T> data, Integer total, Integer filteredTotal) {
        super(data, total, filteredTotal);
        this.draw = draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getDraw() {
        return this.draw;
    }

    public int getRecordsTotal() {
        if (super.total == null) {
            return 0;
        }
        return super.total;
    }

    public int getRecordsFiltered() {
        if (super.filteredTotal == null) {
            return 0;
        }
        return super.filteredTotal;
    }

    public String getError() {
        return this.getMessage();
    }

    @Override
    public DTResponse<T> success(List<T> data, Integer total) {
        super.success(data, total, total);
        return this;
    }

    @Override
    public DTResponse<T> success(List<T> data, Integer total, Integer filteredTotal) {
        super.success(data, total, filteredTotal);
        return this;
    }

    @Override
    public DTResponse<T> empty() {
        super.empty();
        return this;
    }

    @Override
    public DTResponse<T> error(int code, String message) {
        super.error(code, message);
        return this;
    }

    @Override
    public DTResponse<T> error(int code, String message, Exception exception) {
        super.error(code, message, exception);
        return this;
    }

    @Override
    public DTResponse<T> withCode(int code) {
        super.withCode(code);
        return this;
    }

    @Override
    public DTResponse<T> withMessage(String message) {
        super.withMessage(message);
        return this;
    }

    @Override
    public DTResponse<T> withData(List<T> data) {
        super.withData(data);
        return this;
    }
}
