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



# Dump of table tb_addresses
# ------------------------------------------------------------

DROP TABLE IF EXISTS `tb_addresses`;

CREATE TABLE `tb_addresses` (
  `id` bigint(20) NOT NULL,
  `pid` bigint(20) DEFAULT NULL COMMENT '父级ID',
  `name` varchar(50) DEFAULT NULL COMMENT '名称',
  `level` int(11) DEFAULT NULL COMMENT '级别',
  `pinyin` varchar(100) DEFAULT NULL COMMENT '拼音',
  `english_name` varchar(100) DEFAULT NULL COMMENT '英文名',
  `unicode_code` varchar(200) DEFAULT NULL COMMENT 'ASCII码',
  `order_no` varchar(32) DEFAULT NULL COMMENT '排序号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




