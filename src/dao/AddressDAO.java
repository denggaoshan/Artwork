package dao;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import entity.Address;

/**
 * A data access object (DAO) providing persistence and search support for
 * Address entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see entity.Address
 * @author MyEclipse Persistence Tools
 */
public class AddressDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(AddressDAO.class);
	// property constants
	public static final String MASTER_TYPE = "masterType";
	public static final String MASTER_VALUE = "masterValue";
	public static final String LOCATION = "location";
	public static final String POSTCODE = "postcode";
	public static final String PHONE = "phone";

	public void save(Address transientInstance) {
		log.debug("saving Address instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Address persistentInstance) {
		log.debug("deleting Address instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Address findById(java.lang.String id) {
		log.debug("getting Address instance with id: " + id);
		try {
			Address instance = (Address) getSession().get("entity.Address", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Address instance) {
		log.debug("finding Address instance by example");
		try {
			List results = getSession().createCriteria("entity.Address")
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
		log.debug("finding Address instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Address as model where model."
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

	public List findByLocation(Object location) {
		return findByProperty(LOCATION, location);
	}

	public List findByPostcode(Object postcode) {
		return findByProperty(POSTCODE, postcode);
	}

	public List findByPhone(Object phone) {
		return findByProperty(PHONE, phone);
	}

	public List findAll() {
		log.debug("finding all Address instances");
		try {
			String queryString = "from Address";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Address merge(Address detachedInstance) {
		log.debug("merging Address instance");
		try {
			Address result = (Address) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Address instance) {
		log.debug("attaching dirty Address instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Address instance) {
		log.debug("attaching clean Address instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}