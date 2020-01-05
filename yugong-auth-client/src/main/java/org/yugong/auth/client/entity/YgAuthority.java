package org.yugong.auth.client.entity;

import java.io.Serializable;

/**
 * @author 小天
 * @date 2020/1/5 0:33
 */
public class YgAuthority implements Serializable {
    /**
     * 权限Id
     */
    private Integer authorityId;
    /**
     * 应用Id
     *
     */
    private Integer appId;
    /**
     * 权限名称
     */
    private String authorityName;
    /**
     * 权限标识
     */
    private String authorityCode;
    /**
     * 权限内容
     */
    private String authorityContent;
    /**
     * 权限类型
     */
    private String authorityType;
    /**
     * 权限分组
     */
    private String authorityGroup;
    /**
     * 权限描述
     */
    private String authorityDesc;
    /**
     * 图标
     */
    private String authorityIcon;
    /**
     * 授权方式
     */
    private String authorizationType;

    public Integer getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(Integer authorityId) {
        this.authorityId = authorityId;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName;
    }

    public String getAuthorityCode() {
        return authorityCode;
    }

    public void setAuthorityCode(String authorityCode) {
        this.authorityCode = authorityCode;
    }

    public String getAuthorityContent() {
        return authorityContent;
    }

    public void setAuthorityContent(String authorityContent) {
        this.authorityContent = authorityContent;
    }

    public String getAuthorityType() {
        return authorityType;
    }

    public void setAuthorityType(String authorityType) {
        this.authorityType = authorityType;
    }

    public String getAuthorityGroup() {
        return authorityGroup;
    }

    public void setAuthorityGroup(String authorityGroup) {
        this.authorityGroup = authorityGroup;
    }

    public String getAuthorityDesc() {
        return authorityDesc;
    }

    public void setAuthorityDesc(String authorityDesc) {
        this.authorityDesc = authorityDesc;
    }

    public String getAuthorityIcon() {
        return authorityIcon;
    }

    public void setAuthorityIcon(String authorityIcon) {
        this.authorityIcon = authorityIcon;
    }

    public String getAuthorizationType() {
        return authorizationType;
    }

    public void setAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
    }
}
