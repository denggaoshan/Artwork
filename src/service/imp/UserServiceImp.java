package service.imp;

import java.util.List;

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
	
	@Override
	public void register(User user) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login(String username, String password) 
	{
		String md5Tmp=Utils.MD5(password);	
		
		Session s=userDao.getSession();
		Transaction tx=s.beginTransaction();
		
		List<User> users=userDao.findByAccount(username);
		User user= userDao.findById("f09ab485-fff8-40de-b371-13e7fa6bb064");
		tx.commit();
		
		System.out.print(users.get(0).getPassword()+"\n");
		System.out.print(users.get(0).getNickName()+"\n");
		System.out.print(md5Tmp+"\n");
		if(users.size()>0 && users.get(0).getPassword().equals(md5Tmp)) 
		{
			ActionContext ctx = ActionContext.getContext();
			ctx.getSession().put("user", users.get(0));
			System.out.print("success!!!");
		}
		else
			System.out.print("fail!!!");
		
	}
	
	
}
