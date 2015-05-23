package com.vinxent.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.vinxent.model.Order;
import com.vinxent.service.OrderService;

/**
 * 拼单action
 * @author vinxent
 *
 */
public class OrderAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private Order order;  //订单
	
	private OrderService orderService;   //司机业务逻辑组件
	
	/**
	 * 发起一次拼单
	 * @return
	 * @throws Exception
	 */
	public String initiateOrder() throws Exception {
		int result = orderService.addOrder(order);
		if(result>0) {
			System.out.println("发起拼单成功");
			return SUCCESS;
		} else {
			System.out.println("发起拼单失败");
			return ERROR;
		}
	}
	

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public OrderService getOrderService() {
		return orderService;
	}

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	
}
