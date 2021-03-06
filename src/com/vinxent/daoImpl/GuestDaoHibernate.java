package com.vinxent.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.vinxent.dao.GuestDao;
import com.vinxent.model.Guest;

/**
 * 拼客dao实现类，操作数据库
 * @author vinxent
 *
 */
public class GuestDaoHibernate extends HibernateDaoSupport implements GuestDao {

	@Override
	public Guest get(Integer id) {
		return getHibernateTemplate().get(Guest.class, id);
	}

	@Override
	public Integer save(Guest guest) {
		return (Integer) getHibernateTemplate().save(guest);
	}

	@Override
	public void update(Guest guest) {
		getHibernateTemplate().update(guest);
	}

	@Override
	public void delete(Guest guest) {
		getHibernateTemplate().delete(guest);
	}

	@Override
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Guest> findAll() {
		return (List<Guest>) getHibernateTemplate().find("from Guest");
	}

	@Override
	public Guest findByCellphone(String cellphone) {
		List list = getHibernateTemplate().find("from Guest as g where g.cellphone=?", cellphone);
		if (list.size()!=0) {
			return (Guest) list.get(0);
		}
		return null;
	}	

}
