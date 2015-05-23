package com.vinxent.dao;

import java.util.List;

import com.vinxent.model.Driver;

/**
 * 司机dao接口，操作数据库
 * @author vinxent
 *
 */
public interface DriverDao {

	/**
	 * 根据主键获取Driver对象
	 * @param id
	 * @return
	 */
	public Driver get(Integer id);
	
	/**
	 * 保存
	 * @param guest
	 * @return
	 */
	public Integer save(Driver driver);
	
	/**
	 * 更新信息
	 * @param guest
	 */
	public void update(Driver driver);
	
	/**
	 * 删除
	 * @param guest
	 */
	public void delete(Driver driver);
	
	/**
	 * 根据id删除
	 * @param id
	 */
	public void delete(Integer id);
	
	/**
	 * 获取所有司机信息
	 * @return
	 */
	public List<Driver> findAll();
	
	
}
