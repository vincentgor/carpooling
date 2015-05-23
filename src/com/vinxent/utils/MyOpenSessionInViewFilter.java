package com.vinxent.utils;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.orm.hibernate4.support.OpenSessionInViewFilter;

/**
 * ��дopenSession��������hibernateдȨ��
 * @author vinxent
 *
 */
public class MyOpenSessionInViewFilter extends OpenSessionInViewFilter {

	@Override
	protected Session openSession(SessionFactory sessionFactory)
			throws DataAccessResourceFailureException {
		Session session = sessionFactory.openSession();
		//��дȨ��
		session.setFlushMode(FlushMode.AUTO);   
		return session;
	}
}
