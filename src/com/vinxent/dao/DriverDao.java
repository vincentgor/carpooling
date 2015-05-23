package com.vinxent.dao;

import java.util.List;

import com.vinxent.model.Driver;

/**
 * ˾��dao�ӿڣ��������ݿ�
 * @author vinxent
 *
 */
public interface DriverDao {

	/**
	 * ����������ȡDriver����
	 * @param id
	 * @return
	 */
	public Driver get(Integer id);
	
	/**
	 * ����
	 * @param guest
	 * @return
	 */
	public Integer save(Driver driver);
	
	/**
	 * ������Ϣ
	 * @param guest
	 */
	public void update(Driver driver);
	
	/**
	 * ɾ��
	 * @param guest
	 */
	public void delete(Driver driver);
	
	/**
	 * ����idɾ��
	 * @param id
	 */
	public void delete(Integer id);
	
	/**
	 * ��ȡ����˾����Ϣ
	 * @return
	 */
	public List<Driver> findAll();
	
	
}
