package org.yugong.auth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yugong.auth.common.BasePageRequest;
import org.yugong.auth.dao.generate.ApplicationMapper;
import org.yugong.auth.entity.generate.Application;
import org.yugong.auth.entity.generate.ApplicationExample;
import org.yugong.auth.service.ApplicationService;

import java.util.List;

/**
 * @author 小天
 * @date 2020/4/11 20:25
 */
@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    private ApplicationMapper applicationMapper;

    @Override
    public Application get(Integer id) {
        return applicationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int count() {
        return (int) applicationMapper.countByExample(new ApplicationExample());
    }

    @Override
    public List<Application> pageList(BasePageRequest pageRequest) {
        ApplicationExample example = new ApplicationExample();
        example.setOrderByClause("app_id desc");
        example.setOffset(pageRequest.getStart());
        example.setLimit(pageRequest.getLength());
        return applicationMapper.selectByExample(example);
    }
}
