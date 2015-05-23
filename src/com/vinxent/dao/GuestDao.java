package com.vinxent.dao;

import java.util.List;

import com.vinxent.model.Guest;

/**
 * 拼客dao接口，操作数据库
 * @author vinxent
 *
 */
public interface GuestDao {

	/**
	 * 根据主键获取Guest对象
	 * @param id
	 * @return
	 */
	public Guest get(Integer id);
	
	/**
	 * 保存
	 * @param guest
	 * @return
	 */
	public Integer save(Guest guest);
	
	/**
	 * 更新信息
	 * @param guest
	 */
	public void update(Guest guest);
	
	/**
	 * 删除
	 * @param guest
	 */
	public void delete(Guest guest);
	
	/**
	 * 根据id删除
	 * @param id
	 */
	public void delete(Integer id);
	
	/**
	 * 获取所有拼客信息
	 * @return
	 */
	public List<Guest> findAll();
	
	
}
