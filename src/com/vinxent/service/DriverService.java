package com.vinxent.service;

import java.util.List;

import com.vinxent.model.Driver;

/**
 * ˾��ҵ������ӿ�
 * @author vinxent
 *
 */
public interface DriverService {
	
	/**
	 * ˾��ע��
	 * @param guest
	 * @return
	 */
	public Integer addDriver(Driver driver);
	
	/**
	 * ��ѯ˾��
	 * @param id
	 * @return
	 */
	public Driver findDriver(Integer id);
	
	/**
	 * ������Ϣ
	 * @param guest
	 */
	public void updateDriver(Driver driver);
	
	/**
	 * ע��˾��
	 * @param guest
	 */
	public void deleteDriver(Driver driver);
	
	/**
	 * ����idע��˾��
	 * @param id
	 */
	public void deleteDriver(Integer id);
	
	/**
	 * ��������˾��
	 * @return
	 */
	public List<Driver> findAllDriver();
	
}
