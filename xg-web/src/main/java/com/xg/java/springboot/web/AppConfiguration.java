package com.xg.java.springboot.web;

import com.xg.java.springboot.user.impl.UserConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@EnableWebMvc
@EnableAutoConfiguration
@Configuration
@Import({UserConfiguration.class})
public class AppConfiguration {


}
