package com.xg.java.springboot.user.impl.user.dao;

import com.xg.java.springboot.common.module.MyBatisDao;
import com.xg.java.springboot.user.api.user.model.User;
import org.springframework.stereotype.Repository;


@Repository
public class UserDao extends MyBatisDao<User> {

    public User getUserById (Long id){
        return this.getSqlSession().selectOne(this.sqlId("getUserById"),id);
    }
}
