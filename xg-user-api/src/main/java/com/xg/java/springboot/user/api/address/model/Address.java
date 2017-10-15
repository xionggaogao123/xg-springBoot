package com.xg.java.springboot.user.api.address.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by Intellij IDEA
 * Author: xionggao
 * Desc:
 * Date: 2017/10/15
 * Email: xionggao@terminus.io
 */
@ApiModel("菜鸟地址信息")
@Data
public class Address implements Serializable {
	
	private static final long serialVersionUID = -2946470083851018171L;
	
	@ApiModelProperty("主键")
	private Integer id;
	
	@ApiModelProperty("父级id")
	private Integer pid;
	
	@ApiModelProperty("名称")
	private String name;
	
	@ApiModelProperty("级别")
	private Integer level;
	
	@ApiModelProperty("拼音")
	private String pinyin;
	
	@ApiModelProperty("英文名")
	private String englishName;
	
	@ApiModelProperty("/unicode")
	private String unicodeCode;
	
	@ApiModelProperty("排序号")
	private String orderNo;
	
}
