package cn.edu.xmu.artwork.dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import cn.edu.xmu.artwork.entity.Advertorial;

/**
 * A data access object (DAO) providing persistence and search support for
 * Advertorial entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see cn.edu.xmu.artwork.dao.Advertorial
 * @author MyEclipse Persistence Tools
 */

public class AdvertorialDao extends BaseHibernateDao 
{
	private static final Log log = LogFactory.getLog(AdvertorialDao.class);

	// property constants

	public void save(Advertorial transientInstance) 
	{
		log.debug("saving Advertorial instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		}
		catch (RuntimeException re) 
		{
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Advertorial persistentInstance) {
		log.debug("deleting Advertorial instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Advertorial findById(java.lang.String id) 
	{
		log.debug("getting Advertorial instance with id: " + id);
		try {
			Advertorial instance = (Advertorial) getSession().get(
					"cn.edu.xmu.artwork.entity.Advertorial", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Advertorial instance) 
	{
		log.debug("finding Advertorial instance by example");
		try {
			List results = getSession()
					.createCriteria("cn.edu.xmu.artwork.entity.Advertorial")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Advertorial instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Advertorial as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all Advertorial instances");
		try {
			String queryString = "from Advertorial";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Advertorial merge(Advertorial detachedInstance) {
		log.debug("merging Advertorial instance");
		try {
			Advertorial result = (Advertorial) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Advertorial instance) {
		log.debug("attaching dirty Advertorial instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Advertorial instance) {
		log.debug("attaching clean Advertorial instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}