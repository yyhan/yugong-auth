package org.yugong.auth.service.impl;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.yugong.auth.common.DTRequest;
import org.yugong.auth.common.DTResponse;
import org.yugong.auth.dao.generate.UserMapper;
import org.yugong.auth.entity.generate.User;
import org.yugong.auth.entity.generate.UserExample;
import org.yugong.auth.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 小天
 * @date 2019/12/26 21:31
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User get(String userAccount) {
        if (StringUtils.isBlank(userAccount)) {
            return null;
        }
        UserExample example = new UserExample();
        example.createCriteria().andUserAccountEqualTo(userAccount);
        List<User> list = userMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(list)) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public DTResponse<User> pageList(String userAccount, String userName, DTRequest dtRequest) {
        DTResponse<User> response = new DTResponse<>(dtRequest);
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotEmpty(userAccount)) {
            criteria.andUserAccountEqualTo(userAccount);
        }

        int total = (int) userMapper.countByExample(example);
        if (total == 0) {
            response.empty();
        } else {
            example.setOffset(dtRequest.getStart());
            example.setLimit(dtRequest.getLength());
            List<User> list = userMapper.selectByExample(example);
            response.success(list, total);
        }
        return response;
    }
}
