package com.zyf.chatRobot.dao;

import com.zyf.chatRobot.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IUserDaoTest {
    @Autowired
    private IUserDao dao;

    @Test
    public void testSelectUser() throws Exception {
        int id = 1;
        User user = dao.selectUser(id);
        System.out.println(user.getUsername());
    }

}
