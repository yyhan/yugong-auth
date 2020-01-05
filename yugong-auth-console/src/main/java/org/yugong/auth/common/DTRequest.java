package org.yugong.auth.common;

/**
 * @author 小天
 * @date 2019/12/12 22:00
 */
public class DTRequest extends BasePageRequest {
    private Integer draw = 0;

    public DTRequest() {
    }

    public Integer getDraw() {
        return this.draw;
    }

    public void setDraw(Integer draw) {
        this.draw = draw;
    }
}
