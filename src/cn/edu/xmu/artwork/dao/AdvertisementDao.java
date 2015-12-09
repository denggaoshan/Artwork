package cn.edu.xmu.artwork.dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import cn.edu.xmu.artwork.entity.Advertisement;

/**
 * A data access object (DAO) providing persistence and search support for
 * Advertisement entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see cn.edu.xmu.artwork.dao.Advertisement
 * @author MyEclipse Persistence Tools
 */

public class AdvertisementDao extends BaseHibernateDao 
{
	private static final Log log = LogFactory.getLog(AdvertisementDao.class);

	// property constants

	public void save(Advertisement transientInstance) {
		log.debug("saving Advertisement instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Advertisement persistentInstance) {
		log.debug("deleting Advertisement instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Advertisement findById(java.lang.String id) {
		log.debug("getting Advertisement instance with id: " + id);
		try {
			Advertisement instance = (Advertisement) getSession().get(
					"cn.edu.xmu.artwork.entity.Advertisement", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Advertisement instance) {
		log.debug("finding Advertisement instance by example");
		try {
			List results = getSession()
					.createCriteria("cn.edu.xmu.artwork.entity.Advertisement")
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
		log.debug("finding Advertisement instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Advertisement as model where model."
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
		log.debug("finding all Advertisement instances");
		try {
			String queryString = "from Advertisement";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Advertisement merge(Advertisement detachedInstance) {
		log.debug("merging Advertisement instance");
		try {
			Advertisement result = (Advertisement) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Advertisement instance) {
		log.debug("attaching dirty Advertisement instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Advertisement instance) {
		log.debug("attaching clean Advertisement instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}