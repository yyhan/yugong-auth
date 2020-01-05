package org.yugong.auth.client.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * 用于 spring security 认证的用户实体
 *
 * @author 小天
 * @date 2019/12/19 22:40
 */
public class YgUser implements UserDetails {

    private Integer appId;
    private Integer userId;
    private String  userAccount;
    private String  password;
    private String  displayName;

    public YgUser(Integer appId, Integer userId, String userAccount, String password, String displayName) {
        this.appId = appId;
        this.userId = userId;
        this.userAccount = userAccount;
        this.password = password;
        this.displayName = displayName;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return userAccount;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Integer getUserId() {
        return userId;
    }

    /**
     * 清除敏感信息
     */
    public void clearSensitive() {
        this.password = null;
    }
}
