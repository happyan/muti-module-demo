package com.yx.module.service.impl;

import com.yx.module.dao.UserDao;
import com.yx.module.model.User;
import com.yx.module.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserList(int index) {
//        return userDao.getAll();
        return userDao.getAllItem(index);
    }

}
