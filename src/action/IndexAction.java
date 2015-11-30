package action;

import java.util.List;

import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.util.Assert;

import service.UserService;
import utils.Utils;


import com.opensymphony.xwork2.ActionSupport;

import entity.User;

import hibernate.SessionFactory;


public class IndexAction extends ActionSupport{
	
	 private UserService userService;
	    
	    public void setUserService(UserService userService){
	    	this.userService = userService;
	    }
	    
	    public UserService getUserService(){
	    	return userService;
	    }
	
	private List<User> artistList;
	
	public List<User> getArtistList(){
		return artistList;
	}
	
   
    public String execute(){
    	System.out.println("in index action");
		return "success";
    }
}