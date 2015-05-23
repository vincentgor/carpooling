package com.vinxent.service;

import java.util.List;

import com.vinxent.model.Guest;

public interface GuestService {
	
	/**
	 * ƴ��ע��
	 * @param guest
	 * @return
	 */
	public Integer addGuest(Guest guest);
	
	/**
	 * ��ѯƴ��
	 * @param id
	 * @return
	 */
	public Guest findGuest(Integer id);
	
	/**
	 * ������Ϣ
	 * @param guest
	 */
	public void updateGuest(Guest guest);
	
	/**
	 * ע��ƴ��
	 * @param guest
	 */
	public void deleteGuest(Guest guest);
	
	/**
	 * ����idע��ƴ��
	 * @param id
	 */
	public void deleteGuest(Integer id);
	
	/**
	 * ��������ƴ��
	 * @return
	 */
	public List<Guest> findAllGuests();
	
}
