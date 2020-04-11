package org.yugong.auth.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yugong.auth.common.DTRequest;
import org.yugong.auth.common.DTResponse;
import org.yugong.auth.entity.generate.Group;
import org.yugong.auth.service.GroupService;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 小天
 * @date 2020/4/11 20:45
 */
@Controller
public class GroupController {
    @Autowired
    private GroupService groupService;

    @RequestMapping(path = {"/admin/group/manager.htm"})
    public String groupManager(HttpServletRequest request) {
        return "admin/group/manager";
    }

    @ResponseBody
    @RequestMapping("/ajax/admin/group/pageList.htm")
    public DTResponse<Group> pageList(Integer appId, DTRequest dtRequest) {
        DTResponse<Group> response = new DTResponse<>(dtRequest);
        int total = groupService.count(appId);
        if (total == 0) {
            return response.empty();
        }
        return response.success(groupService.pageList(appId, dtRequest), total);
    }
}
