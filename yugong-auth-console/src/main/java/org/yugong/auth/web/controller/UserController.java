package org.yugong.auth.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yugong.auth.common.DTRequest;
import org.yugong.auth.common.DTResponse;
import org.yugong.auth.entity.generate.User;
import org.yugong.auth.service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @author 小天
 * @date 2019/12/26 22:55
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(path = {"/admin/user/manager.htm", "/admin"})
    public String userManager(HttpServletRequest request) {
        return "admin/userManager";
    }

    @ResponseBody
    @RequestMapping("/ajax/admin/user/pageList.htm")
    public DTResponse<User> pageList(String userAccount, String userName, DTRequest dtRequest) {
        return userService.pageList(userAccount, userName, dtRequest);
    }
}
