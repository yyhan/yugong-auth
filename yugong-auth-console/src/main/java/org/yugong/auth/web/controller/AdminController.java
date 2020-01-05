package org.yugong.auth.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @author 小天
 * @date 2019/12/12 20:27
 */
@Controller
public class AdminController {

    @RequestMapping(path = {"/admin/index.htm", "/admin"})
    public String index(HttpServletRequest request) {
        return "admin/index";
    }
}
