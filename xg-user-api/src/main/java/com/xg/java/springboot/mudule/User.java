package com.xg.java.springboot.mudule;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by xionggao on 2017/6/26.
 */
@Data
public class User implements Serializable{

    private Long id;
    private Long userId;
    private String userName;
    private String userGender;
    private String userTel;
    private Date userBirthday;
    private Date createTime;
    private Date updateTime;

}
