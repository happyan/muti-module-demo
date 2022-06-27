package com.yx.module.dao;

import com.yx.module.model.User;

import java.util.List;

public interface  UserDao {

    List<User> getAll();


    List<User> getAllItem(int index);
}
