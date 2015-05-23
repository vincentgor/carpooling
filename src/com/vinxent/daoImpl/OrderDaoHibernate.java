package com.vinxent.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.vinxent.dao.OrderDao;
import com.vinxent.model.Order;

/**
 * 拼单dao实现类，操作数据库
 * @author vinxent
 *
 */
public class OrderDaoHibernate extends HibernateDaoSupport implements OrderDao {

	@Override
	public Order get(Integer id) {
		return getHibernateTemplate().get(Order.class, id);
	}

	@Override
	public Integer save(Order order) {
		return (Integer) getHibernateTemplate().save(order);
	}

	@Override
	public void update(Order order) {
		getHibernateTemplate().update(order);
	}

	@Override
	public void delete(Order order) {
		getHibernateTemplate().delete(order);
	}

	@Override
	public void delete(Integer id) {
		getHibernateTemplate().delete(get(id));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Order> findAll() {
		return (List<Order>) getHibernateTemplate().find("from Order");
	}

}
