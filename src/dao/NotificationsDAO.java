package dao;

import java.sql.Timestamp;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import entity.Notifications;

/**
 * A data access object (DAO) providing persistence and search support for
 * Notifications entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see entity.Notifications
 * @author MyEclipse Persistence Tools
 */
public class NotificationsDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(NotificationsDAO.class);
	// property constants
	public static final String TITLE = "title";
	public static final String NOTI_CONTENT = "notiContent";
	public static final String FROM_USER = "fromUser";
	public static final String TO_USER = "toUser";
	public static final String MESSAGE_TYPE = "messageType";
	public static final String IS_READ = "isRead";
	public static final String IS_HIDE = "isHide";

	public void save(Notifications transientInstance) {
		log.debug("saving Notifications instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Notifications persistentInstance) {
		log.debug("deleting Notifications instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Notifications findById(java.lang.String id) {
		log.debug("getting Notifications instance with id: " + id);
		try {
			Notifications instance = (Notifications) getSession().get(
					"entity.Notifications", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Notifications instance) {
		log.debug("finding Notifications instance by example");
		try {
			List results = getSession().createCriteria("entity.Notifications")
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
		log.debug("finding Notifications instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Notifications as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTitle(Object title) {
		return findByProperty(TITLE, title);
	}

	public List findByNotiContent(Object notiContent) {
		return findByProperty(NOTI_CONTENT, notiContent);
	}

	public List findByFromUser(Object fromUser) {
		return findByProperty(FROM_USER, fromUser);
	}

	public List findByToUser(Object toUser) {
		return findByProperty(TO_USER, toUser);
	}

	public List findByMessageType(Object messageType) {
		return findByProperty(MESSAGE_TYPE, messageType);
	}

	public List findByIsRead(Object isRead) {
		return findByProperty(IS_READ, isRead);
	}

	public List findByIsHide(Object isHide) {
		return findByProperty(IS_HIDE, isHide);
	}

	public List findAll() {
		log.debug("finding all Notifications instances");
		try {
			String queryString = "from Notifications";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Notifications merge(Notifications detachedInstance) {
		log.debug("merging Notifications instance");
		try {
			Notifications result = (Notifications) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Notifications instance) {
		log.debug("attaching dirty Notifications instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Notifications instance) {
		log.debug("attaching clean Notifications instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}