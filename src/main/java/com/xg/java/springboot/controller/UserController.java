package com.xg.java.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by xionggao on 2017/5/11.
 */
@RestController
@EnableWebMvc
@RequestMapping(value = "/api/user/")
public class UserController {

    @RequestMapping(value = "hello")
    public String hello (){
        return "hello world";
    }


}
