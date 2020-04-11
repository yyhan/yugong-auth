package org.yugong.auth.client;

import org.yugong.auth.client.entity.YgAuthority;
import org.yugong.auth.client.entity.YgUser;

import java.util.List;

/**
 * @author 小天
 * @date 2020/1/4 23:56
 */
public interface YgAuthService {

    YgUser login(Integer appId, String userAccount, String password);

    YgUser getUserByUserAccount(Integer appId, String userAccount);

    YgAuthority getAuthorityByCode(Integer appId, String authorityCode);

    boolean existUserAuthority(Integer appId, Integer userId, Integer authorityId);

    boolean existGroupAuthority(Integer appId, Integer userId, Integer authorityId);

    boolean existRoleAuthority(Integer appId, Integer userId, Integer authorityId);

    /**
     * 是否存在任意一个权限
     *
     * @param appId          应用Id
     * @param userId         用户Id
     * @param authorityCodes 多个权限标识
     *
     * @return true: 存在
     */
    boolean existAnyUserAuthority(Integer appId, Integer userId, List<String> authorityCodes);

    boolean existUserRole(Integer appId, Integer userId, String roleCode);

    boolean existUserGroup(Integer appId, Integer userId, String groupCode);

}
