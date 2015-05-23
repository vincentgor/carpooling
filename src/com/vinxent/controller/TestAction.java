package com.vinxent.controller;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.vinxent.model.Guest;
import com.vinxent.model.Order;

public class TestAction extends ActionSupport {
	
	private List<Order> status;
	
	private Guest guest;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String test() throws Exception {
		System.out.println("Œ“µƒÍ«≥∆ «£∫"+guest.getNickName());
		return SUCCESS;
	}
	
	public String testJ() throws Exception {
		System.out.println("xxxxxx");
		status = new ArrayList<Order>();
		Order order = new Order();
		order.setGuestList(new ArrayList<Guest>());
		order.getGuestList().add(new Guest());
		status.add(order);
		return SUCCESS;
	}

	public List<Order> getStatus() {
		return status;
	}

	public void setStatus(List<Order> status) {
		this.status = status;
	}

	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}

	
}
