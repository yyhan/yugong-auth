package org.yugong.auth.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yugong.auth.common.DTRequest;
import org.yugong.auth.common.DTResponse;
import org.yugong.auth.entity.generate.Application;
import org.yugong.auth.service.ApplicationService;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 小天
 * @date 2020/4/11 20:27
 */
@Controller
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @RequestMapping(path = {"/admin/application/manager.htm"})
    public String userManager(HttpServletRequest request) {
        return "admin/application/manager";
    }

    @ResponseBody
    @RequestMapping("/ajax/admin/application/pageList.htm")
    public DTResponse<Application> pageList(DTRequest dtRequest) {
        DTResponse<Application> response = new DTResponse<>(dtRequest);
        int total = applicationService.count();
        if (total==0) {
            return response.empty();
        }
        return response.success(applicationService.pageList(dtRequest), total);
    }

}
