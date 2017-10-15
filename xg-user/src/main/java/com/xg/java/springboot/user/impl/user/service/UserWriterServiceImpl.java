package com.xg.java.springboot.user.impl.user.service;

import com.xg.java.springboot.common.module.Response;
import com.xg.java.springboot.user.api.user.model.User;
import com.xg.java.springboot.user.api.user.service.UserWriterService;
import com.xg.java.springboot.user.impl.user.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xionggao on 2017/6/27.
 *
 */
@Service
public class UserWriterServiceImpl implements UserWriterService {

    private final UserDao userDao;

    @Autowired
    public UserWriterServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Response<Integer> createUser(User user) {
        return null;
    }

    @Override
    public Response<Integer> deleteUser(Long id) {
        return null;
    }

    @Override
    public Response<Integer> updateUser(User user) {
        return null;
    }
}
