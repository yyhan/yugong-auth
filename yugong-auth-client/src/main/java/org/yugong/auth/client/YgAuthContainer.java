package org.yugong.auth.client;

/**
 * @author 小天
 * @date 2020/4/11 21:26
 */
public class YgAuthContainer {
    private Integer appId;

    public YgAuthContainer(Integer appId) {
        this.appId = appId;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }
}
