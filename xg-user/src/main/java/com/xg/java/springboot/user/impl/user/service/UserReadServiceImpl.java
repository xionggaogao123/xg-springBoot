package com.xg.java.springboot.user.impl.user.service;

import com.google.common.base.Strings;
import com.xg.java.springboot.common.module.Response;
import com.xg.java.springboot.user.api.user.model.User;
import com.xg.java.springboot.user.api.user.service.UserReadService;
import com.xg.java.springboot.user.impl.user.dao.UserDao;
import io.terminus.boot.rpc.common.annotation.RpcProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by xionggao on 2017/6/27.
 *
 */
@Service
@Slf4j
@RpcProvider
public class UserReadServiceImpl implements UserReadService {

    private final UserDao userDao;
    
    @Autowired
    public UserReadServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Response<User> getUserById(Long id) {
        try {
            if(Strings.isNullOrEmpty(Long.toString(id))){
                return Response.fail("parameter.is.invalid");
            }
            User user = userDao.getUserById(id);
            return Response.ok(user);
        }catch (Exception e){
            log.error("find User By id fail cause:{}"+ e.getMessage());
            return Response.fail("find.User.fail");
        }
    }

    @Override
    public Response<List<User>> listUser() {
        return null;
    }

}
