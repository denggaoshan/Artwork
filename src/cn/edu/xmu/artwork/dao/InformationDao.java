package cn.edu.xmu.artwork.dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import cn.edu.xmu.artwork.entity.Advertorial;
import cn.edu.xmu.artwork.entity.Information;

/**
 * A data access object (DAO) providing persistence and search support for
 * Information entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see cn.edu.xmu.artwork.dao.Information
 * @author MyEclipse Persistence Tools
 */

public class InformationDao extends BaseHibernateDao 
{
	private static final Log log = LogFactory.getLog(InformationDao.class);
	// property constants
	public static final String TITLE = "title";
	public static final String HOME_IMAGE = "homeImage";
	public static final String TOPIC = "topic";
	public static final String CONTNET = "contnet";
	public static final String POSTION = "postion";
	public static final String VERIFY_STATUS = "verifyStatus";

	public void save(Information transientInstance) 
	{
		log.debug("saving Information instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Information persistentInstance) {
		log.debug("deleting Information instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Information findById(java.lang.String id) 
	{
		log.debug("getting Information instance with id: " + id);
		try {
			Information instance = (Information) getSession().get(
					"cn.edu.xmu.artwork.entity.Information", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Information instance) {
		log.debug("finding Information instance by example");
		try {
			List results = getSession()
					.createCriteria("cn.edu.xmu.artwork.entity.Information")
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
		log.debug("finding Information instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Information as model where model."
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

	public List findByHomeImage(Object homeImage) {
		return findByProperty(HOME_IMAGE, homeImage);
	}

	public List findByTopic(Object topic) {
		return findByProperty(TOPIC, topic);
	}

	public List findByContnet(Object contnet) {
		return findByProperty(CONTNET, contnet);
	}

	public List findByPostion(Object postion) {
		return findByProperty(POSTION, postion);
	}

	public List findByVerifyStatus(Object verifyStatus) {
		return findByProperty(VERIFY_STATUS, verifyStatus);
	}

	public List findAll() {
		log.debug("finding all Information instances");
		try {
			String queryString = "from Information";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Information merge(Information detachedInstance) {
		log.debug("merging Information instance");
		try {
			Information result = (Information) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Information instance) {
		log.debug("attaching dirty Information instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Information instance) {
		log.debug("attaching clean Information instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}