package com.vinxent.dao;

import java.util.List;

import com.vinxent.model.Guest;

/**
 * ƴ��dao�ӿڣ��������ݿ�
 * @author vinxent
 *
 */
public interface GuestDao {

	/**
	 * ����������ȡGuest����
	 * @param id
	 * @return
	 */
	public Guest get(Integer id);
	
	/**
	 * ����
	 * @param guest
	 * @return
	 */
	public Integer save(Guest guest);
	
	/**
	 * ������Ϣ
	 * @param guest
	 */
	public void update(Guest guest);
	
	/**
	 * ɾ��
	 * @param guest
	 */
	public void delete(Guest guest);
	
	/**
	 * ����idɾ��
	 * @param id
	 */
	public void delete(Integer id);
	
	/**
	 * ��ȡ����ƴ����Ϣ
	 * @return
	 */
	public List<Guest> findAll();
	
	
}
