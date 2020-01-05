package org.yugong.auth.entity.generate;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 
 * 
 * @table sec_authority
 * @author MyBatis Generator
 * @version 1.0.0
 */
public class Authority implements Serializable {
    /**
     * 权限Id
     * 
     * @column sec_authority.authority_id
     */
    private Integer authorityId;

    /**
     * 
     * 
     * @column sec_authority.app_id
     */
    private Integer appId;

    /**
     * 权限名称
     * 
     * @column sec_authority.authority_name
     */
    private String authorityName;

    /**
     * 权限标识
     * 
     * @column sec_authority.authority_code
     */
    private String authorityCode;

    /**
     * 权限内容
     * 
     * @column sec_authority.authority_content
     */
    private String authorityContent;

    /**
     * 权限类型
     * 
     * @column sec_authority.authority_type
     */
    private String authorityType;

    /**
     * 权限分组
     * 
     * @column sec_authority.authority_group
     */
    private String authorityGroup;

    /**
     * 权限描述
     * 
     * @column sec_authority.authority_desc
     */
    private String authorityDesc;

    /**
     * 图标
     * 
     * @column sec_authority.authority_icon
     */
    private String authorityIcon;

    /**
     * 授权方式
     * 
     * @column sec_authority.authorization_type
     */
    private String authorizationType;

    /**
     * 排序
     * 
     * @column sec_authority.sort
     */
    private Integer sort;

    /**
     * 
     * 
     * @column sec_authority.create_time
     */
    private LocalDateTime createTime;

    /**
     * 
     * 
     * @column sec_authority.update_time
     */
    private LocalDateTime updateTime;

    private static final long serialVersionUID = 1L;

    /**
     * @column sec_authority.authority_id
     * 
     * @return 权限Id
     */
    public Integer getAuthorityId() {
        return authorityId;
    }

    /**
     * @column sec_authority.authority_id
     * 
     * @param authorityId 权限Id
     */
    public void setAuthorityId(Integer authorityId) {
        this.authorityId = authorityId;
    }

    /**
     * @column sec_authority.app_id
     * 
     * @return 
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * @column sec_authority.app_id
     * 
     * @param appId 
     */
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * @column sec_authority.authority_name
     * 
     * @return 权限名称
     */
    public String getAuthorityName() {
        return authorityName;
    }

    /**
     * @column sec_authority.authority_name
     * 
     * @param authorityName 权限名称
     */
    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName;
    }

    /**
     * @column sec_authority.authority_code
     * 
     * @return 权限标识
     */
    public String getAuthorityCode() {
        return authorityCode;
    }

    /**
     * @column sec_authority.authority_code
     * 
     * @param authorityCode 权限标识
     */
    public void setAuthorityCode(String authorityCode) {
        this.authorityCode = authorityCode;
    }

    /**
     * @column sec_authority.authority_content
     * 
     * @return 权限内容
     */
    public String getAuthorityContent() {
        return authorityContent;
    }

    /**
     * @column sec_authority.authority_content
     * 
     * @param authorityContent 权限内容
     */
    public void setAuthorityContent(String authorityContent) {
        this.authorityContent = authorityContent;
    }

    /**
     * @column sec_authority.authority_type
     * 
     * @return 权限类型
     */
    public String getAuthorityType() {
        return authorityType;
    }

    /**
     * @column sec_authority.authority_type
     * 
     * @param authorityType 权限类型
     */
    public void setAuthorityType(String authorityType) {
        this.authorityType = authorityType;
    }

    /**
     * @column sec_authority.authority_group
     * 
     * @return 权限分组
     */
    public String getAuthorityGroup() {
        return authorityGroup;
    }

    /**
     * @column sec_authority.authority_group
     * 
     * @param authorityGroup 权限分组
     */
    public void setAuthorityGroup(String authorityGroup) {
        this.authorityGroup = authorityGroup;
    }

    /**
     * @column sec_authority.authority_desc
     * 
     * @return 权限描述
     */
    public String getAuthorityDesc() {
        return authorityDesc;
    }

    /**
     * @column sec_authority.authority_desc
     * 
     * @param authorityDesc 权限描述
     */
    public void setAuthorityDesc(String authorityDesc) {
        this.authorityDesc = authorityDesc;
    }

    /**
     * @column sec_authority.authority_icon
     * 
     * @return 图标
     */
    public String getAuthorityIcon() {
        return authorityIcon;
    }

    /**
     * @column sec_authority.authority_icon
     * 
     * @param authorityIcon 图标
     */
    public void setAuthorityIcon(String authorityIcon) {
        this.authorityIcon = authorityIcon;
    }

    /**
     * @column sec_authority.authorization_type
     * 
     * @return 授权方式
     */
    public String getAuthorizationType() {
        return authorizationType;
    }

    /**
     * @column sec_authority.authorization_type
     * 
     * @param authorizationType 授权方式
     */
    public void setAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
    }

    /**
     * @column sec_authority.sort
     * 
     * @return 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * @column sec_authority.sort
     * 
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * @column sec_authority.create_time
     * 
     * @return 
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * @column sec_authority.create_time
     * 
     * @param createTime 
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * @column sec_authority.update_time
     * 
     * @return 
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * @column sec_authority.update_time
     * 
     * @param updateTime 
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
}