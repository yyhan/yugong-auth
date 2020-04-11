package org.yugong.auth.service;

import org.yugong.auth.common.BasePageRequest;
import org.yugong.auth.entity.generate.Application;

import java.util.List;

/**
 * @author 小天
 * @date 2020/4/11 20:24
 */
public interface ApplicationService {

    Application get(Integer id);

    int count();

    List<Application> pageList(BasePageRequest pageRequest);
}
