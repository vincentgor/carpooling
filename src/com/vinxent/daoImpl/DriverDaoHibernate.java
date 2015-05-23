package com.vinxent.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.vinxent.dao.DriverDao;
import com.vinxent.model.Driver;

/**
 * 司机dao实现类，操作数据库
 * @author vinxent
 *
 */
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

	@Override
	public Driver findByCellphone(String cellphone) {
		List list = getHibernateTemplate().find("from Driver as d where d.cellphone=?", cellphone);
		if (list.size()!=0) {
			return (Driver) list.get(0);
		}
		return null;
	}	

}
