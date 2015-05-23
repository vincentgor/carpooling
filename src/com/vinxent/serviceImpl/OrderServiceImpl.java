package com.vinxent.serviceImpl;

import java.util.List;

import com.vinxent.dao.OrderDao;
import com.vinxent.model.Order;
import com.vinxent.service.OrderService;

/**
 * 拼单业务组件实现类
 * @author vinxent
 *
 */
public class OrderServiceImpl implements OrderService {
	
	private OrderDao orderDao;   //拼单dao接口

	@Override
	public Integer addOrder(Order order) {
		long time = System.currentTimeMillis();
		order.setNumber(time+""+Math.round(Math.random() * 10000));     //随机产生拼单号
		order.setCreateTime(String.valueOf(time));                     //创建时间
		order.setStatus(1);                                     //当前状态为1,表示人数未满
		if(order.getDriverID()==0) {
			order.setCurrentCount(1);                                             //（司机发起拼单）
		}
		System.out.println("拼单创建成功");
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
