package org.yugong.auth.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 小天
 * @date 2019/12/12 20:27
 */
@Controller
public class IndexController {
    @RequestMapping(path = {"/index.htm", "/"})
    public String index() {
        return "forward:/admin/index.htm";
    }

    @RequestMapping(path = {"/login.htm"})
    public String login(HttpServletRequest request) {
        return "login";
    }

    @RequestMapping(path = {"/loginSuccess.htm"})
    public String loginSuccess(HttpServletRequest request) {
        return "loginSuccess";
    }


    @RequestMapping(path = {"/error", "/404", "/403"})
    public String error(HttpServletRequest request, Model model) {
        model.addAttribute("path", request.getRequestURI());
        return "error";
    }
}
