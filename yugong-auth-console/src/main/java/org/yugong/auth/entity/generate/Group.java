package org.yugong.auth.entity.generate;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 
 * 
 * @table sec_group
 * @author MyBatis Generator
 * @version 1.0.0
 */
public class Group implements Serializable {
    /**
     * 
     * 
     * @column sec_group.group_id
     */
    private Integer groupId;

    /**
     * 
     * 
     * @column sec_group.app_id
     */
    private Integer appId;

    /**
     * 组标识
     * 
     * @column sec_group.group_code
     */
    private String groupCode;

    /**
     * 组名称
     * 
     * @column sec_group.group_name
     */
    private String groupName;

    /**
     * 组描述
     * 
     * @column sec_group.group_desc
     */
    private String groupDesc;

    /**
     * 父级组Id
     * 
     * @column sec_group.parent_group_id
     */
    private Integer parentGroupId;

    /**
     * 
     * 
     * @column sec_group.create_time
     */
    private LocalDateTime createTime;

    /**
     * 
     * 
     * @column sec_group.update_time
     */
    private LocalDateTime updateTime;

    private static final long serialVersionUID = 1L;

    /**
     * @column sec_group.group_id
     * 
     * @return 
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * @column sec_group.group_id
     * 
     * @param groupId 
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * @column sec_group.app_id
     * 
     * @return 
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * @column sec_group.app_id
     * 
     * @param appId 
     */
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * @column sec_group.group_code
     * 
     * @return 组标识
     */
    public String getGroupCode() {
        return groupCode;
    }

    /**
     * @column sec_group.group_code
     * 
     * @param groupCode 组标识
     */
    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    /**
     * @column sec_group.group_name
     * 
     * @return 组名称
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * @column sec_group.group_name
     * 
     * @param groupName 组名称
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * @column sec_group.group_desc
     * 
     * @return 组描述
     */
    public String getGroupDesc() {
        return groupDesc;
    }

    /**
     * @column sec_group.group_desc
     * 
     * @param groupDesc 组描述
     */
    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }

    /**
     * @column sec_group.parent_group_id
     * 
     * @return 父级组Id
     */
    public Integer getParentGroupId() {
        return parentGroupId;
    }

    /**
     * @column sec_group.parent_group_id
     * 
     * @param parentGroupId 父级组Id
     */
    public void setParentGroupId(Integer parentGroupId) {
        this.parentGroupId = parentGroupId;
    }

    /**
     * @column sec_group.create_time
     * 
     * @return 
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * @column sec_group.create_time
     * 
     * @param createTime 
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * @column sec_group.update_time
     * 
     * @return 
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * @column sec_group.update_time
     * 
     * @param updateTime 
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
}