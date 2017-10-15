package com.xg.java.springboot.user.api.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by xionggao on 2017/6/26.
 * User 实体类
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable{

    private static final long serialVersionUID = 721509940348779517L;
    private Long id;
    private Long userId;
    private String userName;
    private String userGender;
    private String userTel;
    private Date userBirthday;
    private Date createTime;
    private Date updateTime;
    
}
