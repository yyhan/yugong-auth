package org.yugong.auth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yugong.auth.common.BasePageRequest;
import org.yugong.auth.dao.generate.GroupMapper;
import org.yugong.auth.entity.generate.Group;
import org.yugong.auth.entity.generate.GroupExample;
import org.yugong.auth.service.GroupService;

import java.util.List;

/**
 * @author 小天
 * @date 2020/4/11 20:47
 */
@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupMapper groupMapper;

    @Override
    public Group get(Integer id) {
        return groupMapper.selectByPrimaryKey(id);
    }

    @Override
    public int count(Integer appId) {
        GroupExample example = new GroupExample();
        GroupExample.Criteria criteria = example.createCriteria();
        if (appId != null) {
            criteria.andAppIdEqualTo(appId);
        }
        return (int) groupMapper.countByExample(example);
    }

    @Override
    public List<Group> pageList(Integer appId, BasePageRequest pageRequest) {
        GroupExample example = new GroupExample();
        GroupExample.Criteria criteria = example.createCriteria();
        if (appId != null) {
            criteria.andAppIdEqualTo(appId);
        }
        example.setOrderByClause("group_id desc");
        example.setOffset(pageRequest.getStart());
        example.setLimit(pageRequest.getLength());
        return groupMapper.selectByExample(example);
    }
}
