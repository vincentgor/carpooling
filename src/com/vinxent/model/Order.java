package com.vinxent.model;

import java.util.List;

public class Order {
	
	private String number;
	private String createTime;
	private String startingPlace;
	private String Destination;
	private String startingTimeLeft;
	private String startingTimeRight;
	private int guestCount;
	private float price;
	private int driverID;
	
	private List<Guest> guestList;
	
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

}
