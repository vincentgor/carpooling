package com.vinxent.model;

import java.util.List;

/**
 * 订单类
 * @author vinxent
 *
 */
public class Order {
	
	private int id;
	private String number;         //拼单号
	private String createTime;     //创建时间
	private String startingPlace;   //出发地
	private String Destination;      //目的地
	private String startingTimeLeft;    //出发时间（左区间）
	private String startingTimeRight;   //出发时间（右区间）
	private int guestCount;        //拼客人数
	private float price;         //拼车单价
	private int driverID;         //司机id
	private int status;         //拼单状态
	private int currentCount;         //目前人数
	
	private List<Guest> guestList;   //同订单的拼客们
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getStartingPlace() {
		return startingPlace;
	}
	public void setStartingPlace(String startingPlace) {
		this.startingPlace = startingPlace;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	public String getStartingTimeLeft() {
		return startingTimeLeft;
	}
	public void setStartingTimeLeft(String startingTimeLeft) {
		this.startingTimeLeft = startingTimeLeft;
	}
	public String getStartingTimeRight() {
		return startingTimeRight;
	}
	public void setStartingTimeRight(String startingTimeRight) {
		this.startingTimeRight = startingTimeRight;
	}
	public int getGuestCount() {
		return guestCount;
	}
	public void setGuestCount(int guestCount) {
		this.guestCount = guestCount;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getDriverID() {
		return driverID;
	}
	public void setDriverID(int driverID) {
		this.driverID = driverID;
	}
	public List<Guest> getGuestList() {
		return guestList;
	}
	public void setGuestList(List<Guest> guestList) {
		this.guestList = guestList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getCurrentCount() {
		return currentCount;
	}
	public void setCurrentCount(int currentCount) {
		this.currentCount = currentCount;
	}

}
