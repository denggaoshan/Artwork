package cn.edu.xmu.artwork.dao;

import cn.edu.xmu.artwork.entity.ChiefEditor;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * ChiefEditor entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see cn.edu.xmu.artwork.entity.ChiefEditor
 * @author MyEclipse Persistence Tools
 */

public class ChiefEditorDao extends BaseHibernateDao {
	private static final Log log = LogFactory.getLog(ChiefEditorDao.class);

	// property constants

	public void save(ChiefEditor transientInstance) {
		log.debug("saving ChiefEditor instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ChiefEditor persistentInstance) {
		log.debug("deleting ChiefEditor instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ChiefEditor findById(java.lang.String id) {
		log.debug("getting ChiefEditor instance with id: " + id);
		try {
			ChiefEditor instance = (ChiefEditor) getSession().get(
					"cn.edu.xmu.artwork.entity.ChiefEditor", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ChiefEditor instance) {
		log.debug("finding ChiefEditor instance by example");
		try {
			List results = getSession()
					.createCriteria("cn.edu.xmu.artwork.entity.ChiefEditor")
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
		log.debug("finding ChiefEditor instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ChiefEditor as model where model."
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
		log.debug("finding all ChiefEditor instances");
		try {
			String queryString = "from ChiefEditor";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ChiefEditor merge(ChiefEditor detachedInstance) {
		log.debug("merging ChiefEditor instance");
		try {
			ChiefEditor result = (ChiefEditor) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ChiefEditor instance) {
		log.debug("attaching dirty ChiefEditor instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ChiefEditor instance) {
		log.debug("attaching clean ChiefEditor instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}