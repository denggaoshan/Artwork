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
		System.out.println("in login function");
	}
	
}
