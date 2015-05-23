package com.vinxent.serviceImpl;

import java.util.List;

import com.vinxent.dao.OrderDao;
import com.vinxent.model.Order;
import com.vinxent.service.OrderService;

/**
 * ƴ��ҵ�����ʵ����
 * @author vinxent
 *
 */
public class OrderServiceImpl implements OrderService {
	
	private OrderDao orderDao;   //ƴ��dao�ӿ�

	@Override
	public Integer addOrder(Order order) {
		long time = System.currentTimeMillis();
		order.setNumber(time+""+Math.round(Math.random() * 10000));     //�������ƴ����
		order.setCreateTime(String.valueOf(time));                     //����ʱ��
		order.setStatus(1);                                     //��ǰ״̬Ϊ1,��ʾ����δ��
		if(order.getDriverID()==0) {
			order.setCurrentCount(1);                                             //��˾������ƴ����
		}
		System.out.println("ƴ�������ɹ�");
		return orderDao.save(order);
	}

	@Override
	public Order findOrder(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateGuest(Order order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteGuest(Order order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOrder(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Order> findAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	public OrderDao getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

}
