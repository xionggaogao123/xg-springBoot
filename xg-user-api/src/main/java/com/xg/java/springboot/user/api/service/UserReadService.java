package com.xg.java.springboot.user.api.service;

import com.xg.java.springboot.common.module.Response;
import com.xg.java.springboot.user.api.bean.User;

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
