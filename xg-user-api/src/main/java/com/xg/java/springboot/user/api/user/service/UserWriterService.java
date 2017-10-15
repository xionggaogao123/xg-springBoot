package com.xg.java.springboot.user.api.user.service;

import com.xg.java.springboot.common.module.Response;
import com.xg.java.springboot.user.api.user.model.User;


public interface UserWriterService {

     /**
      * 添加用户
      * @param user
      * @return
      */
     Response<Integer> createUser(User user);

     /**
      * 删除用户
      * @param id
      * @return
      */
     Response<Integer> deleteUser(Long id);

     /**
      * 更新用户
      * @param user
      * @return
      */
     Response<Integer> updateUser(User user);

}
