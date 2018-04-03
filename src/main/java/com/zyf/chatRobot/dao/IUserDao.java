package com.zyf.chatRobot.dao;

import com.zyf.chatRobot.model.User;

public interface IUserDao {
    User selectUser(int id);
}
