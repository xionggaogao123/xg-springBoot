package com.xg.java.springboot.user.dao;

import com.xg.java.springboot.common.module.MyBatisDao;
import com.xg.java.springboot.user.api.bean.User;
import org.springframework.stereotype.Repository;

/**
 * Created by xionggao on 2017/6/27.
 *
 */
@Repository
public class UserDao extends MyBatisDao<User>{

    public User getUserById (Long id){
        return this.getSqlSession().selectOne(this.sqlId("getUserById"),id);
    }
}
