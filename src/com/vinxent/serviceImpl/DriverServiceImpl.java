package com.vinxent.serviceImpl;

import java.util.List;

import com.vinxent.dao.DriverDao;
import com.vinxent.model.Driver;
import com.vinxent.service.DriverService;

/**
 * 司机业务组件实现类
 * @author vinxent
 *
 */
public class DriverServiceImpl implements DriverService {
	
	private DriverDao driverDao;   //司机dao接口

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
			System.out.println("用户名不存在，无法登录");
			return false;
		}
		if (!driverTemp.getPassword().equals(driver.getPassword())) {
			System.out.println("密码不正确，无法登录");
			return false;
		}
		System.out.println("成功啦");
		return true;
	}
	
	@Override
	public boolean regist(Driver driver) {
		Driver driverTemp = driverDao.findByCellphone(driver.getCellphone());
		if(driverTemp!=null) {
			System.out.println("此手机号码已经注册");
			return false;
		}
		System.out.println(driverDao.save(driver));
		System.out.println("注册成功");
		return true;
	}
	
	
	public DriverDao getDriverDao() {
		return driverDao;
	}

	public void setDriverDao(DriverDao driverDao) {
		this.driverDao = driverDao;
	}
}
