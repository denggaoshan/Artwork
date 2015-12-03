package cn.edu.xmu.artwork.service.imp;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.edu.xmu.artwork.dao.RoleDAO;
import cn.edu.xmu.artwork.dao.UserDAO;
import cn.edu.xmu.artwork.entity.Role;
import cn.edu.xmu.artwork.entity.User;
import cn.edu.xmu.artwork.service.UserService;
import cn.edu.xmu.commom.utils.Utils;

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
		}
		else
		{
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
		user.setAvatar("uploadImg/Avatar/default.png");
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
		
		if(this.userExists(username)){
			Utils.setCurrentUser(user);
		}
		
		
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
