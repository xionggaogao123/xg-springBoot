package com.xg.java.springboot.user.serviceImpl;

import com.google.common.base.Strings;
import com.google.common.base.Throwables;
import com.xg.java.springboot.common.module.Response;
import com.xg.java.springboot.user.api.bean.User;
import com.xg.java.springboot.user.api.service.UserReadService;
import com.xg.java.springboot.user.dao.UserDao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;

/**
 * Created by xionggao on 2017/6/27.
 *
 */
@Service
public class UserReadServiceImpl implements UserReadService {
    private Log logger = LogFactory.getLog(UserReadServiceImpl.class);

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
            logger.error("find User By id fail cause:{}"+ e.getMessage());
            return Response.fail("find.User.fail");
        }
    }

    @Override
    public Response<List<User>> listUser() {
        return null;
    }

}
