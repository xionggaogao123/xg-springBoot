package com.xg.java.springboot.user.api.address.service;

import com.xg.java.springboot.common.module.Response;
import com.xg.java.springboot.user.api.address.model.Address;

import java.util.List;

/**
 * Created by Intellij IDEA
 * Author: xionggao
 * Desc:
 * Date: 2017/10/15
 * Email: xionggao@terminus.io
 */
public interface AddressReadService {
	
	/**
	 * 获取所有省份
	 *
	 * @return 省份列表
	 */
	Response<List<Address>> listProvinces();
	
	/**
	 * 某个省份的城市列表
	 *
	 * @param provinceId 省份id
	 * @return 城市列表
	 */
	Response<List<Address>> citiesOf(Integer provinceId);
	
	/**
	 * 获取某城市的地区列表
	 *
	 * @param cityId 城市id
	 * @return 地区列表
	 */
	Response<List<Address>> regionsOf(Integer cityId);
	
	/**
	 * 获取某地区的街道列表
	 *
	 * @param regionId 地区id
	 * @return 地区列表
	 */
	Response<List<Address>> streetsOf(Integer regionId);
	
	/**
	 * 获取某一个地址的所有下级地址
	 *
	 * @param addressId id
	 * @return 下级地址列表
	 */
	Response<List<Address>> childAddressOf(Integer addressId);
	
	/**
	 * 获取某个地址
	 *
	 * @param id 地址id
	 * @return 地址
	 */
	Response<Address> findById(Integer id);
	
	/**
	 * 某个地区的上级id列表
	 *
	 * @param addressId 地址id
	 * @return 其上级id列表
	 */
	Response<List<Integer>> ancestorsOf(Integer addressId);
	
	/**
	 * 某个地址的上级地址列表
	 *
	 * @param addressId 地址id
	 * @return 上级地址列表
	 */
	Response<List<Address>> ancestorOfAddresses(Integer addressId);
	
	/**
	 * 获取某个pid地址的地址列表
	 *
	 * @param pid 上级地址id
	 * @return 地址列表
	 */
	Response<List<Address>> getTreeOf(Integer pid);
	
	/**
	 * 根据名称查询地址信息
	 *
	 * @param name  名称
	 * @return  地址列表
	 */
	Response<Address> findByName(String name);
	
}
