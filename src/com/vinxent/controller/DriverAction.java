package com.vinxent.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.vinxent.model.Driver;
import com.vinxent.service.DriverService;

/**
 * ˾��action�������������
 * @author vinxent
 *
 */
public class DriverAction extends ActionSupport {
	
	private DriverService driverService;   //˾��ҵ���߼����
	
	private Driver driver;  //˾����
	
	private int id;    
	private String nickName;   //�ǳ�
	private String cellphone;  //�ֻ�����
	private String password;   //����

	private static final long serialVersionUID = 1L;
	
	/**
	 * ����˾������Ҫ��¼
	 * @return
	 * @throws Exception
	 */
	public String doLogin() throws Exception {	
		driver.setCellphone(cellphone);
		driver.setPassword(password);
		if(driverService.login(driver)==true) {
			System.out.println("��¼�ɹ�");
			return SUCCESS;
		} else {
			System.out.println("��¼ʧ��");
			return ERROR;
		}
	}
	
	/**
	 * ����˾������Ҫע��
	 * @return
	 * @throws Exception
	 */
	public String doRegist() throws Exception {
		driver.setCellphone(cellphone);
		driver.setPassword(password);
		driver.setNickName(nickName);
		if(driverService.regist(driver)) {
			System.out.println("ע��ɹ�");
			return SUCCESS;
		} else {
			System.out.println("ע��ʧ��");
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
