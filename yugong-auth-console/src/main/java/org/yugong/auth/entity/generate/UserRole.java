package org.yugong.auth.entity.generate;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 
 * 
 * @table sec_user_role
 * @author MyBatis Generator
 * @version 1.0.0
 */
public class UserRole implements Serializable {
    /**
     * 
     * 
     * @column sec_user_role.id
     */
    private Integer id;

    /**
     * 
     * 
     * @column sec_user_role.user_id
     */
    private Integer userId;

    /**
     * 
     * 
     * @column sec_user_role.role_id
     */
    private Integer roleId;

    /**
     * 
     * 
     * @column sec_user_role.create_time
     */
    private LocalDateTime createTime;

    /**
     * 
     * 
     * @column sec_user_role.update_time
     */
    private LocalDateTime updateTime;

    private static final long serialVersionUID = 1L;

    /**
     * @column sec_user_role.id
     * 
     * @return 
     */
    public Integer getId() {
        return id;
    }

    /**
     * @column sec_user_role.id
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @column sec_user_role.user_id
     * 
     * @return 
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @column sec_user_role.user_id
     * 
     * @param userId 
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @column sec_user_role.role_id
     * 
     * @return 
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * @column sec_user_role.role_id
     * 
     * @param roleId 
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * @column sec_user_role.create_time
     * 
     * @return 
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * @column sec_user_role.create_time
     * 
     * @param createTime 
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * @column sec_user_role.update_time
     * 
     * @return 
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * @column sec_user_role.update_time
     * 
     * @param updateTime 
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
}