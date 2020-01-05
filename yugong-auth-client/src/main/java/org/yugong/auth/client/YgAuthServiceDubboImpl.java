package org.yugong.auth.client;

import org.yugong.auth.client.entity.YgAuthority;
import org.yugong.auth.client.entity.YgUser;

/**
 * @author 小天
 * @date 2020/1/5 0:32
 */
public class YgAuthServiceDubboImpl implements YgAuthService {

    @Override
    public YgUser login(String userAccount, String password) {
        return null;
    }

    @Override
    public YgUser getUserByUserAccount(String userAccount) {
        return null;
    }

    @Override
    public YgAuthority getAuthorityByCode(String authorityCode) {
        return null;
    }

    @Override
    public boolean existUserAuthority(Integer userId, Integer authorityId) {
        return false;
    }

    @Override
    public boolean existGroupAuthority(Integer userId, Integer authorityId) {
        return false;
    }

    @Override
    public boolean existRoleAuthority(Integer userId, Integer authorityId) {
        return false;
    }

    @Override
    public boolean existUserRole(Integer userId, String roleCode) {
        return false;
    }

    @Override
    public boolean existUserGroup(Integer userId, String groupCode) {
        return false;
    }
}
