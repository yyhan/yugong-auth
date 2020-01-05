package org.yugong.auth.entity.generate;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 
 * 
 * @table sec_user_group
 * @author MyBatis Generator
 * @version 1.0.0
 */
public class UserGroup implements Serializable {
    /**
     * 
     * 
     * @column sec_user_group.id
     */
    private Integer id;

    /**
     * 
     * 
     * @column sec_user_group.user_id
     */
    private Integer userId;

    /**
     * 
     * 
     * @column sec_user_group.group_id
     */
    private Integer groupId;

    /**
     * 
     * 
     * @column sec_user_group.create_time
     */
    private LocalDateTime createTime;

    /**
     * 
     * 
     * @column sec_user_group.update_time
     */
    private LocalDateTime updateTime;

    private static final long serialVersionUID = 1L;

    /**
     * @column sec_user_group.id
     * 
     * @return 
     */
    public Integer getId() {
        return id;
    }

    /**
     * @column sec_user_group.id
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @column sec_user_group.user_id
     * 
     * @return 
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @column sec_user_group.user_id
     * 
     * @param userId 
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @column sec_user_group.group_id
     * 
     * @return 
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * @column sec_user_group.group_id
     * 
     * @param groupId 
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * @column sec_user_group.create_time
     * 
     * @return 
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * @column sec_user_group.create_time
     * 
     * @param createTime 
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * @column sec_user_group.update_time
     * 
     * @return 
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * @column sec_user_group.update_time
     * 
     * @param updateTime 
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
}