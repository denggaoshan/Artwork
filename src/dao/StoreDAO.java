package dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import entity.Store;

/**
 * A data access object (DAO) providing persistence and search support for Store
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see entity.Store
 * @author MyEclipse Persistence Tools
 */
public class StoreDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(StoreDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String KEYWORD = "keyword";
	public static final String HOME_IMAGE = "homeImage";
	public static final String TYPE = "type";
	public static final String VERIFY_STATUS = "verifyStatus";
	public static final String TOP_MOST = "topMost";
	public static final String SATISFACTION = "satisfaction";

	public void save(Store transientInstance) {
		log.debug("saving Store instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Store persistentInstance) {
		log.debug("deleting Store instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Store findById(java.lang.String id) {
		log.debug("getting Store instance with id: " + id);
		try {
			Store instance = (Store) getSession().get("entity.Store", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Store instance) {
		log.debug("finding Store instance by example");
		try {
			List results = getSession().createCriteria("entity.Store")
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
		log.debug("finding Store instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Store as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findByKeyword(Object keyword) {
		return findByProperty(KEYWORD, keyword);
	}

	public List findByHomeImage(Object homeImage) {
		return findByProperty(HOME_IMAGE, homeImage);
	}

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List findByVerifyStatus(Object verifyStatus) {
		return findByProperty(VERIFY_STATUS, verifyStatus);
	}

	public List findByTopMost(Object topMost) {
		return findByProperty(TOP_MOST, topMost);
	}

	public List findBySatisfaction(Object satisfaction) {
		return findByProperty(SATISFACTION, satisfaction);
	}

	public List findAll() {
		log.debug("finding all Store instances");
		try {
			String queryString = "from Store";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Store merge(Store detachedInstance) {
		log.debug("merging Store instance");
		try {
			Store result = (Store) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Store instance) {
		log.debug("attaching dirty Store instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Store instance) {
		log.debug("attaching clean Store instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}