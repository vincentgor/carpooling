package com.vinxent.serviceImpl;

import java.util.List;

import com.vinxent.dao.DriverDao;
import com.vinxent.model.Driver;
import com.vinxent.service.DriverService;

/**
 * ˾��ҵ�����ʵ����
 * @author vinxent
 *
 */
public class DriverServiceImpl implements DriverService {
	
	private DriverDao driverDao;   //˾��dao�ӿ�

	@Override
	public Integer addDriver(Driver driver) {
		return driverDao.save(driver);
	}

	@Override
	public Driver findDriver(Integer id) {
		return driverDao.get(id);
	}

	@Override
	public void updateDriver(Driver driver) {
		driverDao.update(driver);
	}

	@Override
	public void deleteDriver(Driver driver) {
		driverDao.delete(driver);
	}

	@Override
	public void deleteDriver(Integer id) {
		driverDao.delete(id);
	}

	@Override
	public List<Driver> findAllDriver() {
		return driverDao.findAll();
	}
	
	@Override
	public boolean login(Driver driver) {
		Driver driverTemp = driverDao.findByCellphone(driver.getCellphone());
		if(driverTemp==null) {
			System.out.println("�û��������ڣ��޷���¼");
			return false;
		}
		if (!driverTemp.getPassword().equals(driver.getPassword())) {
			System.out.println("���벻��ȷ���޷���¼");
			return false;
		}
		System.out.println("�ɹ���");
		return true;
	}
	
	@Override
	public boolean regist(Driver driver) {
		Driver driverTemp = driverDao.findByCellphone(driver.getCellphone());
		if(driverTemp!=null) {
			System.out.println("���ֻ������Ѿ�ע��");
			return false;
		}
		System.out.println(driverDao.save(driver));
		System.out.println("ע��ɹ�");
		return true;
	}
	
	
	public DriverDao getDriverDao() {
		return driverDao;
	}

	public void setDriverDao(DriverDao driverDao) {
		this.driverDao = driverDao;
	}
}
