package com.yx.module;

import com.yx.module.dao.UserDao;
import com.yx.module.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;

public class UserTest {


    @Autowired
    UserDao userDao;

    @Test
    public void testUser() throws IOException {

        List<User> list = userDao.getAll();

        System.out.printf(list.toString());

    }

}
