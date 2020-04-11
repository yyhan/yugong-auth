package org.yugong.auth.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.yugong.auth.client.entity.YgUser;

import javax.annotation.Resource;

/**
 * 用于 spring security 认证的用户查询 service
 *
 * @author 小天
 * @date 2019/12/19 22:35
 */
@Service
public class YgUserDetailsService implements UserDetailsService {

    @Autowired
    private YgAuthContainer ygAuthContainer;

    @Resource
    private YgAuthService ygAuthService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (username == null || username.isEmpty()) {
            throw new BadCredentialsException("请输入正确的用户名");
        }
        YgUser user = ygAuthService.getUserByUserAccount(ygAuthContainer.getAppId(), username);
        if (user == null) {
            throw new UsernameNotFoundException("未找到用户： " + username);
        }
        return user;
    }
}
