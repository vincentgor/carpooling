package com.vinxent.service;

import java.util.List;

import com.vinxent.model.Guest;

/**
 * 拼客业务组件接口
 * @author vinxent
 *
 */
public interface GuestService {
	
	/**
	 * 拼客注册
	 * @param guest
	 * @return
	 */
	public Integer addGuest(Guest guest);
	
	/**
	 * 查询拼客
	 * @param id
	 * @return
	 */
	public Guest findGuest(Integer id);
	
	/**
	 * 更改信息
	 * @param guest
	 */
	public void updateGuest(Guest guest);
	
	/**
	 * 注销拼客
	 * @param guest
	 */
	public void deleteGuest(Guest guest);
	
	/**
	 * 根据id注销拼客
	 * @param id
	 */
	public void deleteGuest(Integer id);
	
	/**
	 * 查找所有拼客
	 * @return
	 */
	public List<Guest> findAllGuests();
	
	/**
	 * 拼客登录
	 * @return 登录成功与否
	 */
	public boolean login(Guest guest);

	/**
	 * 拼客注册
	 * @param guest
	 * @return 注册成功与否
	 */
	public boolean regist(Guest guest);
	
}
