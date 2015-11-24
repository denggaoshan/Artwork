package dao;

import java.sql.Timestamp;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import entity.Orders;

/**
 * A data access object (DAO) providing persistence and search support for
 * Orders entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see entity.Orders
 * @author MyEclipse Persistence Tools
 */
public class OrdersDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(OrdersDAO.class);
	// property constants
	public static final String PRICE = "price";
	public static final String DISCOUNT_TYPE = "discountType";
	public static final String DISCOUNT_VALUE = "discountValue";
	public static final String DONE_PRICE = "donePrice";
	public static final String EXPRESS_NUMBER = "expressNumber";
	public static final String DEAL_STATUS = "dealStatus";

	public void save(Orders transientInstance) {
		log.debug("saving Orders instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Orders persistentInstance) {
		log.debug("deleting Orders instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Orders findById(java.lang.String id) {
		log.debug("getting Orders instance with id: " + id);
		try {
			Orders instance = (Orders) getSession().get("entity.Orders", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Orders instance) {
		log.debug("finding Orders instance by example");
		try {
			List results = getSession().createCriteria("entity.Orders")
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
		log.debug("finding Orders instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Orders as model where model."
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

	public List findByDiscountType(Object discountType) {
		return findByProperty(DISCOUNT_TYPE, discountType);
	}

	public List findByDiscountValue(Object discountValue) {
		return findByProperty(DISCOUNT_VALUE, discountValue);
	}

	public List findByDonePrice(Object donePrice) {
		return findByProperty(DONE_PRICE, donePrice);
	}

	public List findByExpressNumber(Object expressNumber) {
		return findByProperty(EXPRESS_NUMBER, expressNumber);
	}

	public List findByDealStatus(Object dealStatus) {
		return findByProperty(DEAL_STATUS, dealStatus);
	}

	public List findAll() {
		log.debug("finding all Orders instances");
		try {
			String queryString = "from Orders";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Orders merge(Orders detachedInstance) {
		log.debug("merging Orders instance");
		try {
			Orders result = (Orders) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Orders instance) {
		log.debug("attaching dirty Orders instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Orders instance) {
		log.debug("attaching clean Orders instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}