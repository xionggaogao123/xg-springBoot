package com.xg.java.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xionggao on 2017/5/11.
 */

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {
    public static void main (String[] args){
        SpringApplication.run(Application.class);
    }
}
