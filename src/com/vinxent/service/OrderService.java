package com.vinxent.service;

import java.util.List;

import com.vinxent.model.Order;

/**
 * ƴ��ҵ������ӿ�
 * @author vinxent
 *
 */
public interface OrderService {
	
	/**
	 * ����ƴ��
	 * @param order
	 * @return
	 */
	public Integer addOrder(Order order);
	
	/**
	 * ��ѯƴ��
	 * @param id
	 * @return
	 */
	public Order findOrder(Integer id);
	
	/**
	 * ������Ϣ
	 * @param guest
	 */
	public void updateGuest(Order order);
	
	/**
	 * ע��ƴ��
	 * @param order
	 */
	public void deleteGuest(Order order);
	
	/**
	 * ����idע��ƴ��
	 * @param id
	 */
	public void deleteOrder(Integer id);
	
	/**
	 * ��������ƴ��
	 * @return
	 */
	public List<Order> findAllOrders();
	
	
}
