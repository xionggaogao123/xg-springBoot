package com.xg.java.springboot.user.serviceImpl;

import com.xg.java.springboot.common.module.Response;
import com.xg.java.springboot.user.api.bean.User;
import com.xg.java.springboot.user.api.service.UserReadService;
import org.springframework.stereotype.Service;

/**
 * Created by xionggao on 2017/6/27.
 */
@Service
public class UserReadServiceImpl implements UserReadService {
    @Override
    public Response<User> getUserById(Long userId) {
        return null;
    }
}
