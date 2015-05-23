package com.vinxent.serviceImpl;

import java.util.List;

import com.vinxent.dao.DriverDao;
import com.vinxent.model.Driver;
import com.vinxent.service.DriverService;

public class DriverServiceImpl implements DriverService {
	
	private DriverDao driverDao;

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

	
	public DriverDao getDriverDao() {
		return driverDao;
	}

	public void setDriverDao(DriverDao driverDao) {
		this.driverDao = driverDao;
	}

}
