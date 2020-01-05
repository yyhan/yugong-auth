package org.yugong.auth.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author 小天
 * @date 2020/1/5 0:22
 */
@ConfigurationProperties(prefix = "yg.auth")
public class YgAuthProperties {

    private Boolean enable;
    private Boolean providerDubboEnable;
    private Boolean providerJdbcEnable;
    private Boolean providerJdbcMybatisEmbedEnable;

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public Boolean getProviderDubboEnable() {
        return providerDubboEnable;
    }

    public void setProviderDubboEnable(Boolean providerDubboEnable) {
        this.providerDubboEnable = providerDubboEnable;
    }

    public Boolean getProviderJdbcEnable() {
        return providerJdbcEnable;
    }

    public void setProviderJdbcEnable(Boolean providerJdbcEnable) {
        this.providerJdbcEnable = providerJdbcEnable;
    }

    public Boolean getProviderJdbcMybatisEmbedEnable() {
        return providerJdbcMybatisEmbedEnable;
    }

    public void setProviderJdbcMybatisEmbedEnable(Boolean providerJdbcMybatisEmbedEnable) {
        this.providerJdbcMybatisEmbedEnable = providerJdbcMybatisEmbedEnable;
    }
}
