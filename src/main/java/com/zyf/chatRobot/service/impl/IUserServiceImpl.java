package com.zyf.chatRobot.service.impl;

import com.zyf.chatRobot.dao.IUserDao;
import com.zyf.chatRobot.model.User;
import com.zyf.chatRobot.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("userService")
public class IUserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public User selectUser(int id) {
        return this.userDao.selectUser(id);
    }
}
