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
	 * @param driver
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
	 * @param driver
	 */
	public void updateDriver(Driver driver);
	
	/**
	 * ע��˾��
	 * @param driver
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
	
	/**
	 * ˾����¼
	 * @return ��¼�ɹ����
	 */
	public boolean login(Driver driver);

	/**
	 * ˾��ע��
	 * @param driver
	 * @return ע��ɹ����
	 */
	public boolean regist(Driver driver);
	
}
