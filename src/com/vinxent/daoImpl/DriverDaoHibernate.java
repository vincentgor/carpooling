package com.vinxent.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.vinxent.dao.DriverDao;
import com.vinxent.model.Driver;

public class DriverDaoHibernate extends HibernateDaoSupport implements DriverDao {

	@Override
	public Driver get(Integer id) {
		return getHibernateTemplate().get(Driver.class, id);
	}

	@Override
	public Integer save(Driver driver) {
		return (Integer) getHibernateTemplate().save(driver);
	}

	@Override
	public void update(Driver driver) {
		getHibernateTemplate().update(driver);
	}

	@Override
	public void delete(Driver driver) {
		getHibernateTemplate().delete(driver);
	}

	@Override
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Driver> findAll() {
		return (List<Driver>) getHibernateTemplate().find("from Driver");
	}	

}
