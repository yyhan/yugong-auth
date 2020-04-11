package org.yugong.auth.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yugong.auth.common.DTRequest;
import org.yugong.auth.common.DTResponse;
import org.yugong.auth.entity.generate.Role;
import org.yugong.auth.service.RoleService;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 小天
 * @date 2020/4/11 20:45
 */
@Controller
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping(path = {"/admin/role/manager.htm"})
    public String roleManager(HttpServletRequest request) {
        return "admin/role/manager";
    }

    @ResponseBody
    @RequestMapping("/ajax/admin/role/pageList.htm")
    public DTResponse<Role> pageList(Integer appId, DTRequest dtRequest) {
        DTResponse<Role> response = new DTResponse<>(dtRequest);
        int total = roleService.count(appId);
        if (total == 0) {
            return response.empty();
        }
        return response.success(roleService.pageList(appId, dtRequest), total);
    }
}
