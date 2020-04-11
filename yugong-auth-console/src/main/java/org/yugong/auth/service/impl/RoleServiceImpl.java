package org.yugong.auth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yugong.auth.common.BasePageRequest;
import org.yugong.auth.dao.generate.RoleMapper;
import org.yugong.auth.entity.generate.Role;
import org.yugong.auth.entity.generate.RoleExample;
import org.yugong.auth.service.RoleService;

import java.util.List;

/**
 * @author 小天
 * @date 2020/4/11 20:46
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public Role get(Integer id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int count(Integer appId) {
        RoleExample example = new RoleExample();
        RoleExample.Criteria criteria = example.createCriteria();
        if (appId != null) {
            criteria.andAppIdEqualTo(appId);
        }
        return (int) roleMapper.countByExample(example);
    }

    @Override
    public List<Role> pageList(Integer appId, BasePageRequest pageRequest) {
        RoleExample example = new RoleExample();
        RoleExample.Criteria criteria = example.createCriteria();
        if (appId != null) {
            criteria.andAppIdEqualTo(appId);
        }
        example.setOrderByClause("role_id desc");
        example.setOffset(pageRequest.getStart());
        example.setLimit(pageRequest.getLength());
        return roleMapper.selectByExample(example);
    }
}
