package org.yugong.auth.common;

import java.io.Serializable;

/**
 * @author 小天
 * @date 2019/12/12 22:01
 */
public class BasePageRequest implements Serializable {
    private Integer length = 10;
    private Integer start = 0;
    private String orderField;
    private String orderDir;

    public BasePageRequest() {
    }

    public BasePageRequest(Integer length) {
        this.length = length;
    }

    public BasePageRequest(Integer start, Integer length) {
        this.length = length;
        this.start = start;
    }

    public BasePageRequest(Integer start, Integer length, String orderField, String orderDir) {
        this.length = length;
        this.start = start;
        this.orderField = orderField;
        this.orderDir = orderDir;
    }

    public Integer getLength() {
        return this.length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getStart() {
        return this.start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public String getOrderField() {
        return this.orderField;
    }

    public void setOrderField(String orderField) {
        this.orderField = orderField;
    }

    public String getOrderDir() {
        return this.orderDir;
    }

    public void setOrderDir(String orderDir) {
        this.orderDir = orderDir;
    }
}
