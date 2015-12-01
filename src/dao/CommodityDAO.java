package dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import entity.Commodity;

/**
 * A data access object (DAO) providing persistence and search support for
 * Commodity entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see entity.Commodity
 * @author MyEclipse Persistence Tools
 */
public class CommodityDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(CommodityDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String PRICE = "price";
	public static final String BID_INCREMENT = "bidIncrement";
	public static final String ABSTRACT_ = "abstract_";
	public static final String DESCRIPTION = "description";
	public static final String KEYWORD = "keyword";
	public static final String HOME_IMAGE = "homeImage";
	public static final String PARAMETERS = "parameters";
	public static final String TYPE = "type";
	public static final String TOP_MOST = "topMost";
	public static final String DEAL_STATUS = "dealStatus";

	public void save(Commodity transientInstance) 
	{
		log.debug("saving Commodity instance");
		try
		{
			getSession().save(transientInstance);
			log.debug("save successful");
		}
		catch (RuntimeException re) 
		{
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Commodity persistentInstance) {
		log.debug("deleting Commodity instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public List findByHQL(String hql) 
	{
		log.debug("finding Commodity instance with query: " + hql);
		try 
		{
			Query queryObject = getSession().createQuery(hql);
			return queryObject.list();
		} 
		catch (RuntimeException re) 
		{
			log.error("find by queryString failed", re);
			throw re;
		}
	}
	
	public Commodity findById(java.lang.String id) {
		log.debug("getting Commodity instance with id: " + id);
		try {
			Commodity instance = (Commodity) getSession().get(
					"entity.Commodity", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Commodity instance) {
		log.debug("finding Commodity instance by example");
		try {
			List results = getSession().createCriteria("entity.Commodity")
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
		log.debug("finding Commodity instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Commodity as model where model."
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

	public List findByPrice(Object price) {
		return findByProperty(PRICE, price);
	}

	public List findByBidIncrement(Object bidIncrement) {
		return findByProperty(BID_INCREMENT, bidIncrement);
	}

	public List findByAbstract_(Object abstract_) {
		return findByProperty(ABSTRACT_, abstract_);
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

	public List findByParameters(Object parameters) {
		return findByProperty(PARAMETERS, parameters);
	}

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List findByTopMost(Object topMost) {
		return findByProperty(TOP_MOST, topMost);
	}

	public List findByDealStatus(Object dealStatus) {
		return findByProperty(DEAL_STATUS, dealStatus);
	}

	public List findAll() {
		log.debug("finding all Commodity instances");
		try {
			String queryString = "from Commodity";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Commodity merge(Commodity detachedInstance) {
		log.debug("merging Commodity instance");
		try {
			Commodity result = (Commodity) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Commodity instance) {
		log.debug("attaching dirty Commodity instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Commodity instance) {
		log.debug("attaching clean Commodity instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}