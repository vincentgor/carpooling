package com.vinxent.dao;

import java.util.List;

import com.vinxent.model.Order;

/**
 * 拼单dao接口，操作数据库
 * @author vinxent
 *
 */
public interface OrderDao {

	/**
	 * 根据主键获取Order对象
	 * @param id
	 * @return
	 */
	public Order get(Integer id);
	
	/**
	 * 保存
	 * @param guest
	 * @return
	 */
	public Integer save(Order order);
	
	/**
	 * 更新信息
	 * @param order
	 */
	public void update(Order order);
	
	/**
	 * 删除
	 * @param order
	 */
	public void delete(Order order);
	
	/**
	 * 根据id删除
	 * @param id
	 */
	public void delete(Integer id);
	
	/**
	 * 获取所有拼单信息
	 * @return
	 */
	public List<Order> findAll();
	
}
