package com.xg.java.springboot.user.impl.address.service;

import com.xg.java.springboot.common.module.Response;
import com.xg.java.springboot.user.api.address.model.Address;
import com.xg.java.springboot.user.api.address.service.AddressReadService;

import java.util.List;

/**
 * Created by Intellij IDEA
 * Author: xionggao
 * Desc:
 * Date: 2017/10/15
 * Email: xionggao@terminus.io
 */
public class AddressReadServiceImpl implements AddressReadService {
	
	@Override
	public Response<List<Address>> listProvinces() {
		return null;
	}
	
	@Override
	public Response<List<Address>> citiesOf(Integer provinceId) {
		return null;
	}
	
	@Override
	public Response<List<Address>> regionsOf(Integer cityId) {
		return null;
	}
	
	@Override
	public Response<List<Address>> streetsOf(Integer regionId) {
		return null;
	}
	
	@Override
	public Response<List<Address>> childAddressOf(Integer addressId) {
		return null;
	}
	
	@Override
	public Response<Address> findById(Integer id) {
		return null;
	}
	
	@Override
	public Response<List<Integer>> ancestorsOf(Integer addressId) {
		return null;
	}
	
	@Override
	public Response<List<Address>> ancestorOfAddresses(Integer addressId) {
		return null;
	}
	
	@Override
	public Response<List<Address>> getTreeOf(Integer pid) {
		return null;
	}
	
	@Override
	public Response<Address> findByName(String name) {
		return null;
	}
}
