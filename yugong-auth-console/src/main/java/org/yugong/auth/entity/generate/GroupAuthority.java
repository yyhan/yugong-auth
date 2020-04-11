package org.yugong.auth.entity.generate;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 
 * 
 * @table sec_group_authority
 * @author MyBatis Generator
 * @version 1.0.0
 */
public class GroupAuthority implements Serializable {
    /**
     * 
     * 
     * @column sec_group_authority.id
     */
    private Integer id;

    /**
     * 
     * 
     * @column sec_group_authority.group_id
     */
    private Integer groupId;

    /**
     * 
     * 
     * @column sec_group_authority.authority_id
     */
    private Integer authorityId;

    /**
     * 
     * 
     * @column sec_group_authority.create_time
     */
    private LocalDateTime createTime;

    /**
     * 
     * 
     * @column sec_group_authority.update_time
     */
    private LocalDateTime updateTime;

    private static final long serialVersionUID = 1L;

    /**
     * @column sec_group_authority.id
     * 
     * @return 
     */
    public Integer getId() {
        return id;
    }

    /**
     * @column sec_group_authority.id
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @column sec_group_authority.group_id
     * 
     * @return 
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * @column sec_group_authority.group_id
     * 
     * @param groupId 
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * @column sec_group_authority.authority_id
     * 
     * @return 
     */
    public Integer getAuthorityId() {
        return authorityId;
    }

    /**
     * @column sec_group_authority.authority_id
     * 
     * @param authorityId 
     */
    public void setAuthorityId(Integer authorityId) {
        this.authorityId = authorityId;
    }

    /**
     * @column sec_group_authority.create_time
     * 
     * @return 
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * @column sec_group_authority.create_time
     * 
     * @param createTime 
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * @column sec_group_authority.update_time
     * 
     * @return 
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * @column sec_group_authority.update_time
     * 
     * @param updateTime 
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
}