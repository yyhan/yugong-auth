package org.yugong.auth.client;

import org.yugong.auth.client.entity.YgAuthority;
import org.yugong.auth.client.entity.YgUser;

import java.util.List;

/**
 * @author 小天
 * @date 2020/1/5 0:32
 */
public class YgAuthServiceDubboImpl implements YgAuthService {

    @Override
    public YgUser login(Integer appId, String userAccount, String password) {
        return null;
    }

    @Override
    public YgUser getUserByUserAccount(Integer appId, String userAccount) {
        return null;
    }

    @Override
    public YgAuthority getAuthorityByCode(Integer appId, String authorityCode) {
        return null;
    }

    @Override
    public boolean existUserAuthority(Integer appId, Integer userId, Integer authorityId) {
        return false;
    }

    @Override
    public boolean existGroupAuthority(Integer appId, Integer userId, Integer authorityId) {
        return false;
    }

    @Override
    public boolean existRoleAuthority(Integer appId, Integer userId, Integer authorityId) {
        return false;
    }

    @Override
    public boolean existAnyUserAuthority(Integer appId, Integer userId, List<String> authorityCodes) {
        return false;
    }

    @Override
    public boolean existUserRole(Integer appId, Integer userId, String roleCode) {
        return false;
    }

    @Override
    public boolean existUserGroup(Integer appId, Integer userId, String groupCode) {
        return false;
    }
}
