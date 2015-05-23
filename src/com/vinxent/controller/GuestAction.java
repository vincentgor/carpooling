package com.vinxent.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.vinxent.model.Guest;
import com.vinxent.service.GuestService;

/**
 * 拼客action，接收相关请求
 * @author vinxent
 *
 */
public class GuestAction extends ActionSupport {
	
	private GuestService guestService;    //拼客业务逻辑组件
	
	private Guest guest;  //拼客类
	
	private int id;    
	private String nickName;   //昵称
	private String cellphone;  //手机号码
	private String password;   //密码

	private static final long serialVersionUID = 1L;
	
	/**
	 * 我是拼客，我要登录
	 * @return
	 * @throws Exception
	 */
	public String doLogin() throws Exception {
		return SUCCESS;
	}
	
	/**
	 * 我是拼客，我要注册
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
