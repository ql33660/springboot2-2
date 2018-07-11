package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by qiao on 2018/7/2.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping("/test")
    @ResponseBody
    public User test() {
        return userService.queryOne(1);
    }

    @RequestMapping("/test2")
    public String test2(HttpSession session) {
        User user = userService.queryOne(1);
        session.setAttribute("user", user);
        return "index";
    }

    @RequestMapping("/test3")
    public String test3(HttpServletRequest req) {
        List<User> users = userService.queryAll();
        req.setAttribute("list", users);
        return "forward:/QueryAll.jsp";
    }
}
