package com.yx.module.controller;

import com.yx.module.model.Result;
import com.yx.module.model.ResultUtil;
import com.yx.module.model.User;
import com.yx.module.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/getUser")
    public Result<List<User>> getUser(@RequestParam("index") Integer index){


        List<User> userList = userService.getUserList(index);

        return ResultUtil.success(userList);
    }
}
