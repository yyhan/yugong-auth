package org.yugong.auth.common;

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
        return this.getTotal();
    }

    public int getRecordsFiltered() {
        return this.getFilteredTotal();
    }

    public String getError() {
        return this.getMessage();
    }
}
