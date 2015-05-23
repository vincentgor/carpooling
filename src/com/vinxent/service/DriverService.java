package com.vinxent.service;

import java.util.List;

import com.vinxent.model.Driver;

/**
 * 司机业务组件接口
 * @author vinxent
 *
 */
public interface DriverService {
	
	/**
	 * 司机注册
	 * @param guest
	 * @return
	 */
	public Integer addDriver(Driver driver);
	
	/**
	 * 查询司机
	 * @param id
	 * @return
	 */
	public Driver findDriver(Integer id);
	
	/**
	 * 更改信息
	 * @param guest
	 */
	public void updateDriver(Driver driver);
	
	/**
	 * 注销司机
	 * @param guest
	 */
	public void deleteDriver(Driver driver);
	
	/**
	 * 根据id注销司机
	 * @param id
	 */
	public void deleteDriver(Integer id);
	
	/**
	 * 查找所有司机
	 * @return
	 */
	public List<Driver> findAllDriver();
	
}
