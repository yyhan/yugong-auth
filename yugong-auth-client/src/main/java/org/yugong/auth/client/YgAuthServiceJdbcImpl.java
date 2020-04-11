package org.yugong.auth.client;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.yugong.auth.client.entity.InternalUser;
import org.yugong.auth.client.entity.YgAuthority;
import org.yugong.auth.client.entity.YgUser;
import org.yugong.auth.client.mapper.YgAuthMapper;

import javax.annotation.Resource;
import java.util.List;
import java.util.function.Function;

/**
 * @author 小天
 * @date 2020/1/5 0:32
 */
public class YgAuthServiceJdbcImpl implements YgAuthService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private YgPasswordEncoder passwordEncoder;

    private SqlSessionFactory sqlSessionFactory;

    public YgAuthServiceJdbcImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    private <T> T exec(Function<YgAuthMapper, T> func) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            YgAuthMapper mapper = session.getMapper(YgAuthMapper.class);
            return func.apply(mapper);
        }
    }

    @Override
    public YgUser login(Integer appId, String userAccount, String password) {
        if (StringUtils.isEmpty(userAccount)) {
            return null;
        }
        return exec(mapper -> {
            InternalUser user = mapper.getUserByUserAccount(appId, userAccount);
            if (user == null) {
                throw new UsernameNotFoundException("未找到用户： " + userAccount);
            }
            if (passwordEncoder.matches(password, user.getPassword())) {
                return new YgUser(user.getAppId(), user.getUserId(), user.getUserAccount(), null, user.getDisplayName());
            }
            throw new BadCredentialsException("用户名或密码错误");
        });
    }

    @Override
    public YgUser getUserByUserAccount(Integer appId, String userAccount) {
        if (StringUtils.isEmpty(userAccount)) {
            return null;
        }
        return exec(mapper -> {
            InternalUser user = mapper.getUserByUserAccount(appId, userAccount);
            if (user == null) {
                throw new UsernameNotFoundException("未找到用户： " + userAccount);
            }
            return new YgUser(user.getAppId(), user.getUserId(), user.getUserAccount(), user.getPassword(), user.getDisplayName());
        });
    }

    @Override
    public YgAuthority getAuthorityByCode(Integer appId, String authorityCode) {
        if (StringUtils.isEmpty(authorityCode)) {
            return null;
        }
        return exec(mapper -> {
            return mapper.getAuthorityByCode(appId, authorityCode);
        });
    }

    @Override
    public boolean existUserAuthority(Integer appId, Integer userId, Integer authorityId) {
        if (userId == null || authorityId == null) {
            return false;
        }
        return exec(mapper -> {
            return mapper.existUserAuthority(userId, appId, authorityId);
        });
    }

    @Override
    public boolean existGroupAuthority(Integer appId, Integer userId, Integer authorityId) {
        if (userId == null || authorityId == null) {
            return false;
        }
        return exec(mapper -> {
            return mapper.existGroupAuthority(userId, appId, authorityId);
        });
    }

    @Override
    public boolean existRoleAuthority(Integer appId, Integer userId, Integer authorityId) {
        if (userId == null || authorityId == null) {
            return false;
        }
        return exec(mapper -> {
            return mapper.existRoleAuthority(userId, appId, authorityId);
        });
    }

    @Override
    public boolean existAnyUserAuthority(Integer appId, Integer userId, List<String> authorityCodes) {
        if (CollectionUtils.isEmpty(authorityCodes)) {
            return false;
        }
        for (String authorityCode : authorityCodes) {
            if(exec(mapper -> {
                return mapper.existUserAuthorityCode(userId, appId, authorityCode);
            })){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean existUserRole(Integer appId, Integer userId, String roleCode) {
        if (userId == null || appId == null || roleCode == null) {
            return false;
        }
        return exec(mapper -> {
            return mapper.existUserRole(userId, appId, roleCode);
        });
    }

    @Override
    public boolean existUserGroup(Integer appId, Integer userId, String groupCode) {
        return false;
    }
}
