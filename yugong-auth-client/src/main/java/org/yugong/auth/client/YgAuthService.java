package org.yugong.auth.client;

import org.yugong.auth.client.entity.YgAuthority;
import org.yugong.auth.client.entity.YgUser;

/**
 * @author 小天
 * @date 2020/1/4 23:56
 */
public interface YgAuthService {

    YgUser login(String userAccount, String password);

    YgUser getUserByUserAccount(String userAccount);

    YgAuthority getAuthorityByCode(String authorityCode);

    boolean existUserAuthority(Integer userId, Integer authorityId);

    boolean existGroupAuthority(Integer userId, Integer authorityId);

    boolean existRoleAuthority(Integer userId, Integer authorityId);

    boolean existUserRole(Integer userId, String roleCode);

    boolean existUserGroup(Integer userId, String groupCode);

}
