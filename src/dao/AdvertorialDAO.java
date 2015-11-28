package dao;

import java.sql.Timestamp;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import entity.Advertorial;

/**
 * A data access object (DAO) providing persistence and search support for
 * Advertorial entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see entity.Advertorial
 * @author MyEclipse Persistence Tools
 */
public class AdvertorialDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(AdvertorialDAO.class);
	// property constants
	public static final String TOPIC = "topic";
	public static final String ABSTRACT_ = "abstract_";
	public static final String CONTENT = "content";
	public static final String KEYWORD = "keyword";
	public static final String TARGET_TYPE = "targetType";
	public static final String TARGET_GUID = "targetGuid";
	public static final String POSITION = "position";
	public static final String CLICK_COUNT = "clickCount";
	public static final String TOP_MOST = "topMost";
	public static final String VERIFY_STATUS = "verifyStatus";
	public static final String HOME_IMAGE = "homeImage";
	public static final String IS_DISPLAY = "isDisplay";

	public void save(Advertorial transientInstance) {
		log.debug("saving Advertorial instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
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

	public Advertorial findById(java.lang.String id) {
		log.debug("getting Advertorial instance with id: " + id);
		try {
			Advertorial instance = (Advertorial) getSession().get(
					"entity.Advertorial", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Advertorial instance) {
		log.debug("finding Advertorial instance by example");
		try {
			List results = getSession().createCriteria("entity.Advertorial")
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

	public List findByTopic(Object topic) {
		return findByProperty(TOPIC, topic);
	}

	public List findByAbstract_(Object abstract_) {
		return findByProperty(ABSTRACT_, abstract_);
	}

	public List findByContent(Object content) {
		return findByProperty(CONTENT, content);
	}

	public List findByKeyword(Object keyword) {
		return findByProperty(KEYWORD, keyword);
	}

	public List findByTargetType(Object targetType) {
		return findByProperty(TARGET_TYPE, targetType);
	}

	public List findByTargetGuid(Object targetGuid) {
		return findByProperty(TARGET_GUID, targetGuid);
	}

	public List findByPosition(Object position) {
		return findByProperty(POSITION, position);
	}

	public List findByClickCount(Object clickCount) {
		return findByProperty(CLICK_COUNT, clickCount);
	}

	public List findByTopMost(Object topMost) {
		return findByProperty(TOP_MOST, topMost);
	}

	public List findByVerifyStatus(Object verifyStatus) {
		return findByProperty(VERIFY_STATUS, verifyStatus);
	}

	public List findByHomeImage(Object homeImage) {
		return findByProperty(HOME_IMAGE, homeImage);
	}

	public List findByIsDisplay(Object isDisplay) {
		return findByProperty(IS_DISPLAY, isDisplay);
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