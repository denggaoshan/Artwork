package dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import entity.Auction;

/**
 * A data access object (DAO) providing persistence and search support for
 * Auction entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see entity.Auction
 * @author MyEclipse Persistence Tools
 */
public class AuctionDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(AuctionDAO.class);
	// property constants
	public static final String PRICE = "price";

	public void save(Auction transientInstance) {
		log.debug("saving Auction instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Auction persistentInstance) {
		log.debug("deleting Auction instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Auction findById(java.lang.String id) {
		log.debug("getting Auction instance with id: " + id);
		try {
			Auction instance = (Auction) getSession().get("entity.Auction", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Auction instance) {
		log.debug("finding Auction instance by example");
		try {
			List results = getSession().createCriteria("entity.Auction")
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
		log.debug("finding Auction instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Auction as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPrice(Object price) {
		return findByProperty(PRICE, price);
	}

	public List findAll() {
		log.debug("finding all Auction instances");
		try {
			String queryString = "from Auction";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Auction merge(Auction detachedInstance) {
		log.debug("merging Auction instance");
		try {
			Auction result = (Auction) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Auction instance) {
		log.debug("attaching dirty Auction instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Auction instance) {
		log.debug("attaching clean Auction instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}