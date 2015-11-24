package dao;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import entity.User;

/**
 * A data access object (DAO) providing persistence and search support for User
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see entity.User
 * @author MyEclipse Persistence Tools
 */
public class UserDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(UserDAO.class);
	// property constants
	public static final String ACCOUNT = "account";
	public static final String PASSWORD = "password";
	public static final String AVATAR = "avatar";
	public static final String NICK_NAME = "nickName";
	public static final String AGE = "age";
	public static final String SEX = "sex";
	public static final String PHONE = "phone";
	public static final String MAILBOX = "mailbox";
	public static final String IS_CHECKED_MAILBOX = "isCheckedMailbox";
	public static final String IDENTITY = "identity";
	public static final String WEI_BO = "weiBo";
	public static final String BALANCE = "balance";
	public static final String IS_DISABLE = "isDisable";
	public static final String LAST_LOGIN_IP = "lastLoginIp";
	public static final String IS_ONLINE = "isOnline";

	public void save(User transientInstance) {
		log.debug("saving User instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(User persistentInstance) {
		log.debug("deleting User instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public User findById(java.lang.String id) {
		log.debug("getting User instance with id: " + id);
		try {
			User instance = (User) getSession().get("entity.User", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(User instance) {
		log.debug("finding User instance by example");
		try {
			List results = getSession().createCriteria("entity.User")
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
		log.debug("finding User instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from User as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAccount(Object account) {
		return findByProperty(ACCOUNT, account);
	}

	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List findByAvatar(Object avatar) {
		return findByProperty(AVATAR, avatar);
	}

	public List findByNickName(Object nickName) {
		return findByProperty(NICK_NAME, nickName);
	}

	public List findByAge(Object age) {
		return findByProperty(AGE, age);
	}

	public List findBySex(Object sex) {
		return findByProperty(SEX, sex);
	}

	public List findByPhone(Object phone) {
		return findByProperty(PHONE, phone);
	}

	public List findByMailbox(Object mailbox) {
		return findByProperty(MAILBOX, mailbox);
	}

	public List findByIsCheckedMailbox(Object isCheckedMailbox) {
		return findByProperty(IS_CHECKED_MAILBOX, isCheckedMailbox);
	}

	public List findByIdentity(Object identity) {
		return findByProperty(IDENTITY, identity);
	}

	public List findByWeiBo(Object weiBo) {
		return findByProperty(WEI_BO, weiBo);
	}

	public List findByBalance(Object balance) {
		return findByProperty(BALANCE, balance);
	}

	public List findByIsDisable(Object isDisable) {
		return findByProperty(IS_DISABLE, isDisable);
	}

	public List findByLastLoginIp(Object lastLoginIp) {
		return findByProperty(LAST_LOGIN_IP, lastLoginIp);
	}

	public List findByIsOnline(Object isOnline) {
		return findByProperty(IS_ONLINE, isOnline);
	}

	public List findAll() {
		log.debug("finding all User instances");
		try {
			String queryString = "from User";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public User merge(User detachedInstance) {
		log.debug("merging User instance");
		try {
			User result = (User) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(User instance) {
		log.debug("attaching dirty User instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(User instance) {
		log.debug("attaching clean User instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}