package org.yugong.auth.entity.generate;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 
 * 
 * @table sec_application
 * @author MyBatis Generator
 * @version 1.0.0
 */
public class Application implements Serializable {
    /**
     * 
     * 
     * @column sec_application.app_id
     */
    private Integer appId;

    /**
     * 应用标识
     * 
     * @column sec_application.app_code
     */
    private String appCode;

    /**
     * 应用名称
     * 
     * @column sec_application.app_name
     */
    private String appName;

    /**
     * 
     * 
     * @column sec_application.create_time
     */
    private LocalDateTime createTime;

    /**
     * 
     * 
     * @column sec_application.update_time
     */
    private LocalDateTime updateTime;

    private static final long serialVersionUID = 1L;

    /**
     * @column sec_application.app_id
     * 
     * @return 
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * @column sec_application.app_id
     * 
     * @param appId 
     */
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * @column sec_application.app_code
     * 
     * @return 应用标识
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * @column sec_application.app_code
     * 
     * @param appCode 应用标识
     */
    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    /**
     * @column sec_application.app_name
     * 
     * @return 应用名称
     */
    public String getAppName() {
        return appName;
    }

    /**
     * @column sec_application.app_name
     * 
     * @param appName 应用名称
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * @column sec_application.create_time
     * 
     * @return 
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * @column sec_application.create_time
     * 
     * @param createTime 
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * @column sec_application.update_time
     * 
     * @return 
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * @column sec_application.update_time
     * 
     * @param updateTime 
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
}