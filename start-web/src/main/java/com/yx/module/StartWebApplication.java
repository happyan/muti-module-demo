package com.yx.module;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.yx.module.dao")
//@ComponentScan("com.yx.module.controller")
public class StartWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartWebApplication.class, args);
    }

}
