package com.xg.java.springboot.user.impl.address.dao;

import com.xg.java.springboot.common.module.MyBatisDao;
import com.xg.java.springboot.user.api.address.model.Address;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class AddressDao extends MyBatisDao<Address>{
	
	/**
	 * 查询pid下的地区列表
	 *
	 * @param id 地址id
	 * @return 地址
	 */
	public Address findById(Integer id) {
		return getSqlSession().selectOne(sqlId("findById"), id);
	}
	
	/**
	 * 根据名称获取id
	 *
	 * @param name 地区名称
	 * @return 地区
	 */
	public Address findByName(String name) {
		return getSqlSession().selectOne(sqlId("findByName"), name);
	}
	
	/**
	 * 查询pid下的地址列表
	 *
	 * @param pid 父级id
	 * @return 地址列表
	 */
	public List<Address> findByPid(Integer pid) {
		return getSqlSession().selectList(sqlId("findByPid"), pid);
	}
	
	/**
	 * 查询某级别的地区列表
	 *
	 * @param level 级别
	 * @return 地区列表
	 */
	public List<Address> findByLevel(Integer level) {
		return getSqlSession().selectList(sqlId("findByLevel"), level);
	}
	
	/**
	 * 此新增的地址主键不采用自增策略，而是由调用者提供
	 *
	 * @param address 地址，包含期望的id值
	 * @return 添加成功与否
	 * @see MyBatisDao
	 */
	public Boolean createWithId(Address address) {
		return getSqlSession().insert(sqlId("createWithId"), address) == 1;
	}
	
}
