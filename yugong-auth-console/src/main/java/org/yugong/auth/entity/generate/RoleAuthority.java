package org.yugong.auth.entity.generate;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 
 * 
 * @table sec_role_authority
 * @author MyBatis Generator
 * @version 1.0.0
 */
public class RoleAuthority implements Serializable {
    /**
     * 
     * 
     * @column sec_role_authority.id
     */
    private Integer id;

    /**
     * 
     * 
     * @column sec_role_authority.role_id
     */
    private Integer roleId;

    /**
     * 
     * 
     * @column sec_role_authority.authority_id
     */
    private Integer authorityId;

    /**
     * 
     * 
     * @column sec_role_authority.create_time
     */
    private LocalDateTime createTime;

    /**
     * 
     * 
     * @column sec_role_authority.update_time
     */
    private LocalDateTime updateTime;

    private static final long serialVersionUID = 1L;

    /**
     * @column sec_role_authority.id
     * 
     * @return 
     */
    public Integer getId() {
        return id;
    }

    /**
     * @column sec_role_authority.id
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @column sec_role_authority.role_id
     * 
     * @return 
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * @column sec_role_authority.role_id
     * 
     * @param roleId 
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * @column sec_role_authority.authority_id
     * 
     * @return 
     */
    public Integer getAuthorityId() {
        return authorityId;
    }

    /**
     * @column sec_role_authority.authority_id
     * 
     * @param authorityId 
     */
    public void setAuthorityId(Integer authorityId) {
        this.authorityId = authorityId;
    }

    /**
     * @column sec_role_authority.create_time
     * 
     * @return 
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * @column sec_role_authority.create_time
     * 
     * @param createTime 
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * @column sec_role_authority.update_time
     * 
     * @return 
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * @column sec_role_authority.update_time
     * 
     * @param updateTime 
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
}