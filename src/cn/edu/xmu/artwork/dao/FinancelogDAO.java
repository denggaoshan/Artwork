package cn.edu.xmu.artwork.dao;

import java.sql.Timestamp;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import cn.edu.xmu.artwork.entity.Financelog;

/**
 * A data access object (DAO) providing persistence and search support for
 * Financelog entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.edu.xmu.artwork.entity.Financelog
 * @author MyEclipse Persistence Tools
 */

public class FinancelogDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(FinancelogDAO.class);
	// property constants
	public static final String TYPE = "type";
	public static final String USER_GUID = "userGuid";
	public static final String ORDER_GUID = "orderGuid";
	public static final String PRICE = "price";
	public static final String STATUS = "status";

	public void save(Financelog transientInstance) {
		log.debug("saving Financelog instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Financelog persistentInstance) {
		log.debug("deleting Financelog instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Financelog findById(java.lang.String id) {
		log.debug("getting Financelog instance with id: " + id);
		try {
			Financelog instance = (Financelog) getSession().get(
					"cn.edu.xmu.artwork.entity.Financelog", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Financelog instance) {
		log.debug("finding Financelog instance by example");
		try {
			List results = getSession()
					.createCriteria("cn.edu.xmu.artwork.entity.Financelog")
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
		log.debug("finding Financelog instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Financelog as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List findByUserGuid(Object userGuid) {
		return findByProperty(USER_GUID, userGuid);
	}

	public List findByOrderGuid(Object orderGuid) {
		return findByProperty(ORDER_GUID, orderGuid);
	}

	public List findByPrice(Object price) {
		return findByProperty(PRICE, price);
	}

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List findAll() {
		log.debug("finding all Financelog instances");
		try {
			String queryString = "from Financelog";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Financelog merge(Financelog detachedInstance) {
		log.debug("merging Financelog instance");
		try {
			Financelog result = (Financelog) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Financelog instance) {
		log.debug("attaching dirty Financelog instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Financelog instance) {
		log.debug("attaching clean Financelog instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}