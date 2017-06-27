package com.xg.java.springboot.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by xionggao on 2017/6/27.
 *
 */
@SpringBootApplication(scanBasePackages = "com.xg.java.springboot")
@MapperScan("com.xg.java.springboot.user.dao")
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }
}
