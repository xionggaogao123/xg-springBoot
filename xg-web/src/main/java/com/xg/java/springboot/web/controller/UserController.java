package com.xg.java.springboot.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xionggao on 2017/6/27.
 */
@RestController
public class UserController {

    @RequestMapping(value = "test")
    public String test() {
        return "hello world";
    }
}
