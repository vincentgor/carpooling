package com.vinxent.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 * 扩展HibernateDaoSupport类，实现分页功能
 * @author vinxent
 *
 */
public class MyHibernateDaoSupport extends HibernateDaoSupport {
	
	/**
	 * 使用hql语句进行分页查询
	 * @param hql 需要查询的hql语句
	 * @param offset 第一条记录索引
	 * @param pageSize  每页需要显示的记录数
	 * @return 当前所有的记录
	 */
	public List finByPage(final String hql, final int offset, final int pageSize) {
		//通过一个HibernateCallback对象来执行查询
		List list = getHibernateTemplate().execute(new HibernateCallback<List>() {

			@Override
			public List doInHibernate(Session session) throws HibernateException {
				//执行Hibernate分页查询
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
	 * 使用hql语句进行分页查询(一个参数)
	 * @param hql 需要查询的hql语句
	 * @param offset 第一条记录索引
	 * @param value 参数
	 * @param pageSize 每页需要显示的记录数
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
	 * 使用hql语句进行分页查询(多个参数)
	 * @param hql 需要查询的hql语句
	 * @param values 参数
	 * @param offset 第一条记录索引
	 * @param pageSize 每页需要显示的记录数
	 * @return
	 */
	public List findByPage(final String hql, final Object[] values, final int offset, final int pageSize) {
		List list = getHibernateTemplate().execute(new HibernateCallback<List>() {

			@Override
			public List doInHibernate(Session session) throws HibernateException {
				//执行Hibernate分页查询
				Query query =  session.createQuery(hql);
				//传入参数
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
