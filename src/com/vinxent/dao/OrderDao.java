package com.vinxent.dao;

import java.util.List;

import com.vinxent.model.Order;

/**
 * ƴ��dao�ӿڣ��������ݿ�
 * @author vinxent
 *
 */
public interface OrderDao {

	/**
	 * ����������ȡOrder����
	 * @param id
	 * @return
	 */
	public Order get(Integer id);
	
	/**
	 * ����
	 * @param guest
	 * @return
	 */
	public Integer save(Order order);
	
	/**
	 * ������Ϣ
	 * @param order
	 */
	public void update(Order order);
	
	/**
	 * ɾ��
	 * @param order
	 */
	public void delete(Order order);
	
	/**
	 * ����idɾ��
	 * @param id
	 */
	public void delete(Integer id);
	
	/**
	 * ��ȡ����ƴ����Ϣ
	 * @return
	 */
	public List<Order> findAll();
	
}
