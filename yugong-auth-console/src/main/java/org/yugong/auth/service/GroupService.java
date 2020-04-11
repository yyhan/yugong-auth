package org.yugong.auth.service;

import org.yugong.auth.common.BasePageRequest;
import org.yugong.auth.entity.generate.Group;

import java.util.List;

/**
 * @author 小天
 * @date 2020/4/11 20:45
 */
public interface GroupService {

    Group get(Integer id);

    int count(Integer appId);

    List<Group> pageList(Integer appId, BasePageRequest pageRequest);
}
