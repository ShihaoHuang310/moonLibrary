package com.moon.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    /**
     * 首页
     * @param session
     * @return
     */
    @RequestMapping({"/", "/index"})
    public String login(HttpSession session) {
        return "index";
    }
    /**
     * 跳转到登录页
     * @return
     */
    @RequestMapping({"/toLoginPage"})
    public String toLoginPage() {
        return "login";
    }
}
