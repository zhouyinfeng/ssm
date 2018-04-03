package com.zyf.chatRobot.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.deploy.net.HttpResponse;
import com.zyf.chatRobot.model.User;
import com.zyf.chatRobot.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping(value = "/showUser.do")
    public void selectUser(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        int userId = Integer.parseInt(req.getParameter("id"));
        User user= this.userService.selectUser(userId);
        ObjectMapper mapper = new ObjectMapper();
        resp.getWriter().write(mapper.writeValueAsString(user));
        resp.getWriter().close();
    }

}
