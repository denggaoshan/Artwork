package cn.edu.xmu.artwork.dao;

import java.sql.Timestamp;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import cn.edu.xmu.artwork.entity.Systemlog;

/**
 * A data access object (DAO) providing persistence and search support for
 * Systemlog entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.edu.xmu.artwork.entity.Systemlog
 * @author MyEclipse Persistence Tools
 */

public class SystemlogDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(SystemlogDAO.class);
	// property constants
	public static final String MESSAGE = "message";

	public void save(Systemlog transientInstance) {
		log.debug("saving Systemlog instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Systemlog persistentInstance) {
		log.debug("deleting Systemlog instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Systemlog findById(java.lang.String id) {
		log.debug("getting Systemlog instance with id: " + id);
		try {
			Systemlog instance = (Systemlog) getSession().get(
					"cn.edu.xmu.artwork.entity.Systemlog", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Systemlog instance) {
		log.debug("finding Systemlog instance by example");
		try {
			List results = getSession()
					.createCriteria("cn.edu.xmu.artwork.entity.Systemlog")
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
		log.debug("finding Systemlog instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Systemlog as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByMessage(Object message) {
		return findByProperty(MESSAGE, message);
	}

	public List findAll() {
		log.debug("finding all Systemlog instances");
		try {
			String queryString = "from Systemlog";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Systemlog merge(Systemlog detachedInstance) {
		log.debug("merging Systemlog instance");
		try {
			Systemlog result = (Systemlog) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Systemlog instance) {
		log.debug("attaching dirty Systemlog instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Systemlog instance) {
		log.debug("attaching clean Systemlog instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}