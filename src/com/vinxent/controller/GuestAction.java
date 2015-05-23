package com.vinxent.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.vinxent.model.Guest;
import com.vinxent.service.GuestService;

/**
 * ƴ��action�������������
 * @author vinxent
 *
 */
public class GuestAction extends ActionSupport {
	
	private GuestService guestService;    //ƴ��ҵ���߼����
	
	private Guest guest;  //ƴ����
	
	private int id;    
	private String nickName;   //�ǳ�
	private String cellphone;  //�ֻ�����
	private String password;   //����

	private static final long serialVersionUID = 1L;
	
	/**
	 * ����ƴ�ͣ���Ҫ��¼
	 * @return
	 * @throws Exception
	 */
	public String doLogin() throws Exception {
		return SUCCESS;
	}
	
	/**
	 * ����ƴ�ͣ���Ҫע��
	 * @return
	 * @throws Exception
	 */
	public String doRegist() throws Exception {
		return SUCCESS;
	}
	
	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public GuestService getGuestService() {
		return guestService;
	}

	public void setGuestService(GuestService guestService) {
		this.guestService = guestService;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
