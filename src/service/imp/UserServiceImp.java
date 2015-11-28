package service.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionContext;

import dao.UserDAO;
import entity.User;
import service.UserService;
import utils.Utils;

public class UserServiceImp implements UserService
{
    private UserDAO userDao;
    
    public void setUserDao(UserDAO userDao){
    	this.userDao = userDao;
    }
    
    public UserDAO getUserDao(){
    	return userDao;
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
	public void register(String username, String password, String Nickname) {
		// TODO Auto-generated method stub
		
	}
	
}
