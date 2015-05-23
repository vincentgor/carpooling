package com.vinxent.utils;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.orm.hibernate4.support.OpenSessionInViewFilter;

/**
 * 重写openSession方法，打开hibernate写权限
 * @author vinxent
 *
 */
public class MyOpenSessionInViewFilter extends OpenSessionInViewFilter {

	@Override
	protected Session openSession(SessionFactory sessionFactory)
			throws DataAccessResourceFailureException {
		Session session = sessionFactory.openSession();
		//打开写权限
		session.setFlushMode(FlushMode.AUTO);   
		return session;
	}
}
