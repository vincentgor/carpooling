package com.vinxent.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.vinxent.model.Driver;
import com.vinxent.service.DriverService;

/**
 * 司机action，接收相关请求
 * @author vinxent
 *
 */
public class DriverAction extends ActionSupport {
	
	private DriverService driverService;   //司机业务逻辑组件
	
	private Driver driver;  //司机类
	
	private int id;    
	private String nickName;   //昵称
	private String cellphone;  //手机号码
	private String password;   //密码

	private static final long serialVersionUID = 1L;
	
	/**
	 * 我是司机，我要登录
	 * @return
	 * @throws Exception
	 */
	public String doLogin() throws Exception {	
		driver.setCellphone(cellphone);
		driver.setPassword(password);
		if(driverService.login(driver)==true) {
			System.out.println("登录成功");
			return SUCCESS;
		} else {
			System.out.println("登录失败");
			return ERROR;
		}
	}
	
	/**
	 * 我是司机，我要注册
	 * @return
	 * @throws Exception
	 */
	public String doRegist() throws Exception {
		driver.setCellphone(cellphone);
		driver.setPassword(password);
		driver.setNickName(nickName);
		if(driverService.regist(driver)) {
			System.out.println("注册成功");
			return SUCCESS;
		} else {
			System.out.println("注册失败");
			return ERROR;
		}
	}
	
	
	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
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

	public DriverService getDriverService() {
		return driverService;
	}

	public void setDriverService(DriverService driverService) {
		this.driverService = driverService;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
