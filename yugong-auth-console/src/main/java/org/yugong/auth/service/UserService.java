package org.yugong.auth.service;

import org.yugong.auth.common.DTRequest;
import org.yugong.auth.common.DTResponse;
import org.yugong.auth.entity.generate.User;

/**
 * @author 小天
 * @date 2019/12/26 21:30
 */
public interface UserService {

    User get(String userAccount);

    DTResponse<User> pageList(String userAccount, String userName, DTRequest dtRequest);
}
