package com.vinxent.model;

/**
 * ƴ����
 * @author vinxent
 *
 */
public class Guest {
	
	private int id;
	private String nickName;    //�ǳ�
	private String cellphone;   //�ֻ�����
	private String password;    //����
	
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
