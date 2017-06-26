-- 创建数据库
    CREATE database xionggao;

-- 创建数据表
  CREATE TABLE tb_user (
  id bigint(20) unsigned not NULL AUTO_INCREMENT COMMENT '主键',
  user_id bigint(20) NOT NULL COMMENT '用户id',
  user_name VARCHAR(20) DEFAULT NULL COMMENT '用户名',
  user_gender VARCHAR(11) DEFAULT NULL COMMENT '用户性别',
  user_tel VARCHAR(11) DEFAULT NULL COMMENT '用户电话号码',
  user_birthday  TIMESTAMP COMMENT '用户出生日期',
  create_time TIMESTAMP COMMENT '创建时间',
  update_time TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
  )ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='用户表';

