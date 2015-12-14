package cn.edu.xmu.artwork.dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import cn.edu.xmu.artwork.entity.Advertisement;
import cn.edu.xmu.artwork.entity.Advertorial;
import cn.edu.xmu.artwork.entity.ChiefEditor;
import cn.edu.xmu.artwork.entity.Editor;
import cn.edu.xmu.artwork.service.imp.InformationServiceImp;
import cn.edu.xmu.commom.utils.Utils;

/**
 * A data access object (DAO) providing persistence and search support for
 * Advertorial entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see cn.edu.xmu.artwork.dao.Advertorial
 * @author MyEclipse Persistence Tools
 */

public class AdvertorialDao extends BaseHibernateDao 
{
	private static final Log log = LogFactory.getLog(AdvertorialDao.class);

	// property constants

	public void save(Advertorial transientInstance) 
	{
		log.debug("saving Advertorial instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		}
		catch (RuntimeException re) 
		{
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

	public Advertorial findById(java.lang.String id) 
	{
		log.debug("getting Advertorial instance with id: " + id);
		try {
			Advertorial instance = (Advertorial) getSession().get(
					"cn.edu.xmu.artwork.entity.Advertorial", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Advertorial instance) 
	{
		log.debug("finding Advertorial instance by example");
		try {
			List results = getSession()
					.createCriteria("cn.edu.xmu.artwork.entity.Advertorial")
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

	public List findAllByDatePos(Date today,short pos) 
	{
		String queryString = "select ad from Advertorial as ad,DatePosition as dp where ad.id=dp.information.id and dp.date"
				 + "= ?" + " and ad.position = ?";
		Query queryObject = getSession().createQuery(queryString);
		queryObject.setParameter(0, today);
		queryObject.setParameter(1, pos);
		return queryObject.list();
	}
	
	public List findAllByEditor(Editor editor)
	{
		String queryString = "select ad from Advertorial as ad where ad.editor.id = ?";
		Query queryObject = getSession().createQuery(queryString);
		queryObject.setParameter(0, editor.getId());
		
		return queryObject.list();
	}
	
	public List findAllByChiefEditor(ChiefEditor chiefEditor)
	{
		String queryString = "from Advertorial as ad where ad.chiefEditor.id = ? order by ad.verifyStatus";
		Query queryObject = getSession().createQuery(queryString);
		queryObject.setParameter(0, chiefEditor.getId());
		
		return queryObject.list();
	}
	
	public static void main(String args[]){
		AdvertorialDao advertorialDao = new AdvertorialDao();
		List<Advertorial> ret =advertorialDao.findAllByDatePos(Utils.getCurrentTime(),(short) 2);
		System.out.println(ret.size());
		Advertorial ad = ret.get(0);
		System.out.println(ad.getTitle());
		System.out.println(ad.getContent());
	}
}