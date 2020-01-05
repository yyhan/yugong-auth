package org.yugong.auth.entity.generate;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 
 * 
 * @table sec_role
 * @author MyBatis Generator
 * @version 1.0.0
 */
public class Role implements Serializable {
    /**
     * 
     * 
     * @column sec_role.role_id
     */
    private Integer roleId;

    /**
     * 
     * 
     * @column sec_role.app_id
     */
    private Integer appId;

    /**
     * 角色名称
     * 
     * @column sec_role.role_name
     */
    private String roleName;

    /**
     * 角色描述
     * 
     * @column sec_role.role_desc
     */
    private String roleDesc;

    /**
     * 
     * 
     * @column sec_role.create_time
     */
    private LocalDateTime createTime;

    /**
     * 
     * 
     * @column sec_role.update_time
     */
    private LocalDateTime updateTime;

    private static final long serialVersionUID = 1L;

    /**
     * @column sec_role.role_id
     * 
     * @return 
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * @column sec_role.role_id
     * 
     * @param roleId 
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * @column sec_role.app_id
     * 
     * @return 
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * @column sec_role.app_id
     * 
     * @param appId 
     */
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * @column sec_role.role_name
     * 
     * @return 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @column sec_role.role_name
     * 
     * @param roleName 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * @column sec_role.role_desc
     * 
     * @return 角色描述
     */
    public String getRoleDesc() {
        return roleDesc;
    }

    /**
     * @column sec_role.role_desc
     * 
     * @param roleDesc 角色描述
     */
    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    /**
     * @column sec_role.create_time
     * 
     * @return 
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * @column sec_role.create_time
     * 
     * @param createTime 
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * @column sec_role.update_time
     * 
     * @return 
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * @column sec_role.update_time
     * 
     * @param updateTime 
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
}