package com.vinxent.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.vinxent.model.Order;
import com.vinxent.service.OrderService;

/**
 * ƴ��action
 * @author vinxent
 *
 */
public class OrderAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private Order order;  //����
	
	private OrderService orderService;   //˾��ҵ���߼����
	
	/**
	 * ����һ��ƴ��
	 * @return
	 * @throws Exception
	 */
	public String initiateOrder() throws Exception {
		int result = orderService.addOrder(order);
		if(result>0) {
			System.out.println("����ƴ���ɹ�");
			return SUCCESS;
		} else {
			System.out.println("����ƴ��ʧ��");
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
