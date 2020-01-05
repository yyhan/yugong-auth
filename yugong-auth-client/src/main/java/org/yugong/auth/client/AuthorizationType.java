package org.yugong.auth.client;

/**
 * 授权方式枚举
 *
 * @author 小天
 * @date 2020/1/5 15:24
 */
public enum AuthorizationType {
    /**
     * 授权给所有用户
     */
    permit_all("permit_all", "授权给所有用户"),
    /**
     * 授权给所有已认证用户
     */
    authenticated("authenticated", "授权给所有已认证用户"),
    /**
     * 授权给用户
     */
    user("user", "授权给用户"),
    /**
     * 授权给组
     */
    group("group", "授权给组"),
    /**
     * 授权给角色
     */
    role("role", "授权给角色");

    public String value;
    public String desc;

    AuthorizationType(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public String getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }

    public static AuthorizationType parse(String value) {
        if (value == null) {
            return null;
        }
        switch (value) {
            case "permit_all":
                return permit_all;
            case "authenticated":
                return authenticated;
            case "user":
                return user;
            case "group":
                return group;
            case "role":
                return role;
            default:
                return null;
        }
    }
}
