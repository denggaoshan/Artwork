package cn.edu.xmu.artwork.dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import cn.edu.xmu.artwork.entity.DatePosition;

/**
 	* A data access object (DAO) providing persistence and search support for DatePosition entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see cn.edu.xmu.artwork.dao.DatePosition
  * @author MyEclipse Persistence Tools 
 */

public class DatePositionDao extends BaseHibernateDao  {
		 private static final Log log = LogFactory.getLog(DatePositionDao.class);
		//property constants
	public static final String SEQUENCE = "sequence";



    
    public void save(DatePosition transientInstance) {
        log.debug("saving DatePosition instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(DatePosition persistentInstance) {
        log.debug("deleting DatePosition instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    /*
    public DatePosition findById( cn.edu.xmu.artwork.dao.DatePositionId id) {
        log.debug("getting DatePosition instance with id: " + id);
        try {
            DatePosition instance = (DatePosition) getSession()
                    .get("cn.edu.xmu.artwork.dao.DatePosition", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    */
    
    public List findByExample(DatePosition instance) {
        log.debug("finding DatePosition instance by example");
        try {
            List results = getSession()
                    .createCriteria("cn.edu.xmu.artwork.dao.DatePosition")
                    .add(Example.create(instance))
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding DatePosition instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from DatePosition as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findBySequence(Object sequence
	) {
		return findByProperty(SEQUENCE, sequence
		);
	}
	

	public List findAll() {
		log.debug("finding all DatePosition instances");
		try {
			String queryString = "from DatePosition";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public DatePosition merge(DatePosition detachedInstance) {
        log.debug("merging DatePosition instance");
        try {
            DatePosition result = (DatePosition) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(DatePosition instance) {
        log.debug("attaching dirty DatePosition instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(DatePosition instance) {
        log.debug("attaching clean DatePosition instance");
        try {
            getSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}