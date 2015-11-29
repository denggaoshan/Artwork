package action;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.util.Assert;

import service.AdvertorialService;
import service.UserService;
import utils.Utils;


import com.opensymphony.xwork2.ActionSupport;

import entity.*;

import hibernate.SessionFactory;


public class IndexAction extends ActionSupport{
	
	 private UserService userService;
	    
	    public void setUserService(UserService userService){
	    	this.userService = userService;
	    }
	    
	    public UserService getUserService(){
	    	return userService;
	    }
	
	 private AdvertorialService advertorialService;
	 public void setAdvertorialService(AdvertorialService advertorialService){
	    	this.advertorialService = advertorialService;
	    }
	    
	 public AdvertorialService getAdvertorialService(){
	    return advertorialService;
	 }
	
	 
	List<User> artistList;
	public List<User> getArtistList(){
		return artistList;
	}
	
	List<Advertorial> advertorialList;
	public List<Advertorial> getAdvertorialList(){
		return advertorialList;
	}
	
    public String execute(){
    	artistList = getUserService().getAllArtists();
    	advertorialList = getAdvertorialService().getAdvertorial(); 
		 return "success";
    }
}