package dao;

import java.sql.Timestamp;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import entity.Advertorials;

/**
 * A data access object (DAO) providing persistence and search support for
 * Advertorials entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see entity.Advertorials
 * @author MyEclipse Persistence Tools
 */
public class AdvertorialsDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(AdvertorialsDAO.class);
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
	public static final String ATTACHMENT = "attachment";

	public void save(Advertorials transientInstance) {
		log.debug("saving Advertorials instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Advertorials persistentInstance) {
		log.debug("deleting Advertorials instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Advertorials findById(java.lang.String id) {
		log.debug("getting Advertorials instance with id: " + id);
		try {
			Advertorials instance = (Advertorials) getSession().get(
					"entity.Advertorials", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Advertorials instance) {
		log.debug("finding Advertorials instance by example");
		try {
			List results = getSession().createCriteria("entity.Advertorials")
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
		log.debug("finding Advertorials instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Advertorials as model where model."
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

	public List findByAttachment(Object attachment) {
		return findByProperty(ATTACHMENT, attachment);
	}

	public List findAll() {
		log.debug("finding all Advertorials instances");
		try {
			String queryString = "from Advertorials";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Advertorials merge(Advertorials detachedInstance) {
		log.debug("merging Advertorials instance");
		try {
			Advertorials result = (Advertorials) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Advertorials instance) {
		log.debug("attaching dirty Advertorials instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Advertorials instance) {
		log.debug("attaching clean Advertorials instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}