package com.xg.java.springboot.service;

import com.xg.java.springboot.module.Response;
import com.xg.java.springboot.mudule.User;

/**
 * Created by xionggao on 2017/6/26.
 */
public interface UserReadService {

    /**
     * 通过userId 获取到User
     * @param userId
     * @return
     */
    Response<User> getUserById(Long userId);

    /**
     * 用户信息分页显示
     * @return
     */

}
