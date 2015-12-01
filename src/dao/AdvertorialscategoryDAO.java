package dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import entity.Advertorialscategory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Advertorialscategory entities. Transaction control of the save(), update()
 * and delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see entity.Advertorialscategory
 * @author MyEclipse Persistence Tools
 */
public class AdvertorialscategoryDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory
			.getLog(AdvertorialscategoryDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String ABSTRACT_ = "abstract_";

	public void save(Advertorialscategory transientInstance) {
		log.debug("saving Advertorialscategory instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Advertorialscategory persistentInstance) {
		log.debug("deleting Advertorialscategory instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Advertorialscategory findById(java.lang.String id) {
		log.debug("getting Advertorialscategory instance with id: " + id);
		try {
			Advertorialscategory instance = (Advertorialscategory) getSession()
					.get("entity.Advertorialscategory", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Advertorialscategory instance) {
		log.debug("finding Advertorialscategory instance by example");
		try {
			List results = getSession()
					.createCriteria("entity.Advertorialscategory")
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
		log.debug("finding Advertorialscategory instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Advertorialscategory as model where model."
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

	public List findByAbstract_(Object abstract_) {
		return findByProperty(ABSTRACT_, abstract_);
	}

	public List findAll() {
		log.debug("finding all Advertorialscategory instances");
		try {
			String queryString = "from Advertorialscategory";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Advertorialscategory merge(Advertorialscategory detachedInstance) {
		log.debug("merging Advertorialscategory instance");
		try {
			Advertorialscategory result = (Advertorialscategory) getSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Advertorialscategory instance) {
		log.debug("attaching dirty Advertorialscategory instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Advertorialscategory instance) {
		log.debug("attaching clean Advertorialscategory instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}