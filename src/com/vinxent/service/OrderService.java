package com.vinxent.service;

import java.util.List;

import com.vinxent.model.Order;

/**
 * 拼单业务组件接口
 * @author vinxent
 *
 */
public interface OrderService {
	
	/**
	 * 发起拼单
	 * @param order
	 * @return
	 */
	public Integer addOrder(Order order);
	
	/**
	 * 查询拼客
	 * @param id
	 * @return
	 */
	public Order findOrder(Integer id);
	
	/**
	 * 更改信息
	 * @param guest
	 */
	public void updateGuest(Order order);
	
	/**
	 * 注销拼单
	 * @param order
	 */
	public void deleteGuest(Order order);
	
	/**
	 * 根据id注销拼单
	 * @param id
	 */
	public void deleteOrder(Integer id);
	
	/**
	 * 查找所有拼单
	 * @return
	 */
	public List<Order> findAllOrders();
	
	
}
