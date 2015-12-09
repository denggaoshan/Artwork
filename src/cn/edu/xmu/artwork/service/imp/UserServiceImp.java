package cn.edu.xmu.artwork.service.imp;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;


import cn.edu.xmu.artwork.dao.UserDao;
import cn.edu.xmu.artwork.entity.Artist;
import cn.edu.xmu.artwork.entity.User;
import cn.edu.xmu.artwork.service.UserService;
import cn.edu.xmu.commom.utils.Utils;

public class UserServiceImp implements UserService
{
    private UserDao userDao;
    
    public void setUserDao(UserDao userDao)
    {
    	this.userDao = userDao;
    }
    
    public UserDao getUserDao()
    {
    	return userDao;
    }

	@Override
	public boolean register(String username, String password, String nickName)
	{	
		Session s=getUserDao().getSession();
		Transaction tx=s.beginTransaction();
		
		User user = new User();
		user.setId(Utils.createGUID());
		user.setAccount(username);
		user.setPassword(Utils.MD5(password));
		user.setAvatar("/uploadImg/Avatar/default.png");
		user.setNickName(nickName);
		user.setBalance(0.0);
		user.setIsDisable(false);
		
		getUserDao().save(user);
		
		tx.commit();
		
		return true;
	}

	@Override
	public boolean login(String username, String password) 
	{
        String md5Tmp=Utils.MD5(password);	
		
		List<User> users= getUserDao().findByAccount(username);
		
		if(users.size()>0 && users.get(0).getPassword().equals(md5Tmp)) 
		{
			System.out.print(users.get(0).getNickName()+"--------------");
			Utils.setCurrentUser(users.get(0));
			getUserDao().getSession().clear();
			return true;
		}
		
		return false;
	}

	@Override
	public boolean userExists(String account) 
	{
		List<User> ret = getUserDao().findByAccount(account);
	    return !ret.isEmpty();
	}

	@Override
	public List<Artist> getAllArtists() 
	{	
		List<Artist> ret = getUserDao().findAllByClassName("Artist");
		return ret;
	}
}
