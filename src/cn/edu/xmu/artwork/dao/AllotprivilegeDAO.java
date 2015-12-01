package cn.edu.xmu.artwork.dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import cn.edu.xmu.artwork.entity.Allotprivilege;

/**
 * A data access object (DAO) providing persistence and search support for
 * Allotprivilege entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see cn.edu.xmu.artwork.entity.Allotprivilege
 * @author MyEclipse Persistence Tools
 */

public class AllotprivilegeDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(AllotprivilegeDAO.class);
	// property constants
	public static final String MASTER_TYPE = "masterType";
	public static final String MASTER_VALUE = "masterValue";

	public void save(Allotprivilege transientInstance) {
		log.debug("saving Allotprivilege instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Allotprivilege persistentInstance) {
		log.debug("deleting Allotprivilege instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Allotprivilege findById(java.lang.String id) {
		log.debug("getting Allotprivilege instance with id: " + id);
		try {
			Allotprivilege instance = (Allotprivilege) getSession().get(
					"cn.edu.xmu.artwork.entity.Allotprivilege", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Allotprivilege instance) {
		log.debug("finding Allotprivilege instance by example");
		try {
			List results = getSession()
					.createCriteria("cn.edu.xmu.artwork.entity.Allotprivilege")
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
		log.debug("finding Allotprivilege instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Allotprivilege as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByMasterType(Object masterType) {
		return findByProperty(MASTER_TYPE, masterType);
	}

	public List findByMasterValue(Object masterValue) {
		return findByProperty(MASTER_VALUE, masterValue);
	}

	public List findAll() {
		log.debug("finding all Allotprivilege instances");
		try {
			String queryString = "from Allotprivilege";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Allotprivilege merge(Allotprivilege detachedInstance) {
		log.debug("merging Allotprivilege instance");
		try {
			Allotprivilege result = (Allotprivilege) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Allotprivilege instance) {
		log.debug("attaching dirty Allotprivilege instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Allotprivilege instance) {
		log.debug("attaching clean Allotprivilege instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}