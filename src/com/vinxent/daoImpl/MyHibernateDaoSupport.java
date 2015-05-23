package com.vinxent.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 * ��չHibernateDaoSupport�࣬ʵ�ַ�ҳ����
 * @author vinxent
 *
 */
public class MyHibernateDaoSupport extends HibernateDaoSupport {
	
	/**
	 * ʹ��hql�����з�ҳ��ѯ
	 * @param hql ��Ҫ��ѯ��hql���
	 * @param offset ��һ����¼����
	 * @param pageSize  ÿҳ��Ҫ��ʾ�ļ�¼��
	 * @return ��ǰ���еļ�¼
	 */
	public List finByPage(final String hql, final int offset, final int pageSize) {
		//ͨ��һ��HibernateCallback������ִ�в�ѯ
		List list = getHibernateTemplate().execute(new HibernateCallback<List>() {

			@Override
			public List doInHibernate(Session session) throws HibernateException {
				//ִ��Hibernate��ҳ��ѯ
				List result = session.createQuery(hql)
						.setFirstResult(offset)
						.setMaxResults(pageSize)
						.list();
				return result;
			}
			
		});
		
		return list;
	}
	
	/**
	 * ʹ��hql�����з�ҳ��ѯ(һ������)
	 * @param hql ��Ҫ��ѯ��hql���
	 * @param offset ��һ����¼����
	 * @param value ����
	 * @param pageSize ÿҳ��Ҫ��ʾ�ļ�¼��
	 * @return
	 */
	public List findByPage(final String hql, final Object value, final int offset, final int pageSize) {
		
		List list = getHibernateTemplate()
				.execute(new HibernateCallback<List>() {

					@Override
					public List doInHibernate(Session session)
							throws HibernateException {
						List result = session.createQuery(hql)
								.setParameter(0, value)
								.setFirstResult(offset)
								.setMaxResults(pageSize)
								.list();
						return result;
					}
				});
		
		return list;
	}
	
	/**
	 * ʹ��hql�����з�ҳ��ѯ(�������)
	 * @param hql ��Ҫ��ѯ��hql���
	 * @param values ����
	 * @param offset ��һ����¼����
	 * @param pageSize ÿҳ��Ҫ��ʾ�ļ�¼��
	 * @return
	 */
	public List findByPage(final String hql, final Object[] values, final int offset, final int pageSize) {
		List list = getHibernateTemplate().execute(new HibernateCallback<List>() {

			@Override
			public List doInHibernate(Session session) throws HibernateException {
				//ִ��Hibernate��ҳ��ѯ
				Query query =  session.createQuery(hql);
				//�������
				for (int i=0; i<values.length; i++) {
					query.setParameter(i, values[i]);
				}
				
				List result = query.setFirstResult(offset)
						.setMaxResults(pageSize)
						.list();
				return result;
			}
		});
		
		return list;
	}
	
	

}
