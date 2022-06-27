package com.yx.module;

import com.yx.module.dao.UserDao;
import com.yx.module.model.User;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@MapperScan("com.yx.module.dao")
class MutiWeb2ApplicationTests {

    @Autowired
    UserDao userDao;

    @Test
    void contextLoads() {


        List<User> list = userDao.getAll();

        System.out.printf(list.toString());
    }

}
