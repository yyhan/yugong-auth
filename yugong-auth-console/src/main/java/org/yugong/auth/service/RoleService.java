package org.yugong.auth.service;

import org.yugong.auth.common.BasePageRequest;
import org.yugong.auth.entity.generate.Role;

import java.util.List;

/**
 * @author 小天
 * @date 2020/4/11 20:45
 */
public interface RoleService {

    Role get(Integer id);

    int count(Integer appId);

    List<Role> pageList(Integer appId, BasePageRequest pageRequest);
}
