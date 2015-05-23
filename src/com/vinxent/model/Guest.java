package com.vinxent.model;

/**
 * 拼客类
 * @author vinxent
 *
 */
public class Guest {
	
	private int id;
	private String nickName;    //昵称
	private String cellphone;   //手机号码
	private String password;    //密码
	
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
