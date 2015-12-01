package service.imp;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import dao.RoleDAO;
import dao.UserDAO;
import entity.Role;
import entity.User;
import service.UserService;
import utils.Utils;

public class UserServiceImp implements UserService
{
	
    private UserDAO userDao;
    
    
    public void setUserDao(UserDAO userDao)
    {
    	this.userDao = userDao;
    }
    
    public UserDAO getUserDao()
    {
    	return userDao;
    }
	
    private RoleDAO roleDao;
    
    public void setRoleDao(RoleDAO roleDao)
    {
    	this.roleDao = roleDao;
    }
    
    public RoleDAO getRoleDao()
    {
    	return roleDao;
    }
    
	@Override
	public void login(String username, String password) 
	{
		String md5Tmp=Utils.MD5(password);	
		
		List<User> users= getUserDao().findByAccount(username);
		
		if(users.size()>0 && users.get(0).getPassword().equals(md5Tmp)) 
		{
			Utils.setCurrentUser(users.get(0));
		    System.out.print("success!!!");
		}
		else
		{
			System.out.print("fail!!!");
		}

	}

	@Override
	public void register(String username, String password, String nickName,
			String ip) {
		
		Session s=getUserDao().getSession();
		Transaction tx=s.beginTransaction();

		
		User user = new User();
		user.setGuid(Utils.createGUID());
		user.setAccount(username);
		user.setPassword(Utils.MD5(password));
		user.setAvatar("/uploadImg/default.png");
		user.setNickName(nickName);
		user.setBalance(0.0);
		user.setIsDisable(false);
		user.setLastLoginIp(ip);
		user.setRegisterTime(Utils.getCurrentTime());
		user.setLastLoginTime(Utils.getCurrentTime());
		user.setIsOnline(true);
		
		Role role = ((List<Role>)getRoleDao().findByName("buyer")).get(0);
		user.setRole(role);
		
		getUserDao().save(user);
		tx.commit();
		Utils.setCurrentUser(user);
	}

	@Override
	public List<User> getAllArtists() 
	{
		String hql = "from User as u where u.role.name='Artist' order by u.registerTime";
		
		List<User> ret=getUserDao().findByHQL(hql);	
		
		return ret;
	}

	@Override
	public boolean userExists(String account) 
	{
		// TODO Auto-generated method stub
	    List<User> ret = getUserDao().findByAccount(account);
	    return !ret.isEmpty();
	}
}
