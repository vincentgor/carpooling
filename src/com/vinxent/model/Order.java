package com.vinxent.model;

import java.util.List;

/**
 * ������
 * @author vinxent
 *
 */
public class Order {
	
	private int id;
	private String number;         //ƴ����
	private String createTime;     //����ʱ��
	private String startingPlace;   //������
	private String Destination;      //Ŀ�ĵ�
	private String startingTimeLeft;    //����ʱ�䣨�����䣩
	private String startingTimeRight;   //����ʱ�䣨�����䣩
	private int guestCount;        //ƴ������
	private float price;         //ƴ������
	private int driverID;         //˾��id
	private int status;         //ƴ��״̬
	private int currentCount;         //Ŀǰ����
	
	private List<Guest> guestList;   //ͬ������ƴ����
	
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
