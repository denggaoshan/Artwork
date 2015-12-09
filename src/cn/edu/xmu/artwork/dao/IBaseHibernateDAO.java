package cn.edu.xmu.artwork.dao;

import org.hibernate.Session;

public interface IBaseHibernateDao 
{
	public Session getSession();
}