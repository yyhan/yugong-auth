package org.yugong.auth.common;

/**
 * @author 小天
 * @date 2019/12/14 20:46
 */
public class PageInfo {
    /**
     * 偏移量
     */
    protected Integer offset;
    /**
     * 需要获取条数
     */
    protected Integer limit;

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
