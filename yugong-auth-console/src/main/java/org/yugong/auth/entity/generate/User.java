package org.yugong.auth.entity.generate;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 
 * 
 * @table sec_user
 * @author MyBatis Generator
 * @version 1.0.0
 */
public class User implements Serializable {
    /**
     * 
     * 
     * @column sec_user.user_id
     */
    private Integer userId;

    /**
     * 
     * 
     * @column sec_user.app_id
     */
    private Integer appId;

    /**
     * 用户账号
     * 
     * @column sec_user.user_account
     */
    private String userAccount;

    /**
     * 密码
     * 
     * @column sec_user.password
     */
    private String password;

    /**
     * 用户姓名
     * 
     * @column sec_user.user_name
     */
    private String userName;

    /**
     * 
     * 
     * @column sec_user.create_time
     */
    private LocalDateTime createTime;

    /**
     * 
     * 
     * @column sec_user.update_time
     */
    private LocalDateTime updateTime;

    private static final long serialVersionUID = 1L;

    /**
     * @column sec_user.user_id
     * 
     * @return 
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @column sec_user.user_id
     * 
     * @param userId 
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @column sec_user.app_id
     * 
     * @return 
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * @column sec_user.app_id
     * 
     * @param appId 
     */
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * @column sec_user.user_account
     * 
     * @return 用户账号
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * @column sec_user.user_account
     * 
     * @param userAccount 用户账号
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    /**
     * @column sec_user.password
     * 
     * @return 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * @column sec_user.password
     * 
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @column sec_user.user_name
     * 
     * @return 用户姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @column sec_user.user_name
     * 
     * @param userName 用户姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @column sec_user.create_time
     * 
     * @return 
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * @column sec_user.create_time
     * 
     * @param createTime 
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * @column sec_user.update_time
     * 
     * @return 
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * @column sec_user.update_time
     * 
     * @param updateTime 
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
}