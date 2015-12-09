package cn.edu.xmu.artwork.dao;

import java.util.List;
import hibernate.SessionFactory;

import org.hibernate.Query;
import org.hibernate.Session;


public class BaseHibernateDao implements IBaseHibernateDao 
{
	public Session getSession() 
	{
		return SessionFactory.getSession();
	}
	
	public List findAllByClassName(String className)
	{
		try 
		{
			String queryString = "from "+className;
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		}
		catch (RuntimeException re)
		{
			throw re;
		}
	}
}