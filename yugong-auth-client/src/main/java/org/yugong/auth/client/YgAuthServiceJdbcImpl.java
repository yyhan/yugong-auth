package org.yugong.auth.client;

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
    public YgUser login(String userAccount, String password) {
        if (StringUtils.isEmpty(userAccount)) {
            return null;
        }
        return exec(mapper -> {
            InternalUser user = mapper.getUserByUserAccount(userAccount);
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
    public YgUser getUserByUserAccount(String userAccount) {
        if (StringUtils.isEmpty(userAccount)) {
            return null;
        }
        return exec(mapper -> {
            InternalUser user = mapper.getUserByUserAccount(userAccount);
            if (user == null) {
                throw new UsernameNotFoundException("未找到用户： " + userAccount);
            }
            return new YgUser(user.getAppId(), user.getUserId(), user.getUserAccount(), user.getPassword(), user.getDisplayName());
        });
    }

    @Override
    public YgAuthority getAuthorityByCode(String authorityCode) {
        if (StringUtils.isEmpty(authorityCode)) {
            return null;
        }
        return exec(mapper -> {
            return mapper.getAuthorityByCode(authorityCode);
        });
    }

    @Override
    public boolean existUserAuthority(Integer userId, Integer authorityId) {
        if (userId == null || authorityId == null) {
            return false;
        }
        return exec(mapper -> {
            return mapper.existUserAuthority(userId, authorityId);
        });
    }

    @Override
    public boolean existGroupAuthority(Integer userId, Integer authorityId) {
        if (userId == null || authorityId == null) {
            return false;
        }
        return exec(mapper -> {
            return mapper.existGroupAuthority(userId, authorityId);
        });
    }

    @Override
    public boolean existRoleAuthority(Integer userId, Integer authorityId) {
        if (userId == null || authorityId == null) {
            return false;
        }
        return exec(mapper -> {
            return mapper.existRoleAuthority(userId, authorityId);
        });
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
