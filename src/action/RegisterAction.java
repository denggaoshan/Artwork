package action;

import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.UserService;


import com.opensymphony.xwork2.ActionSupport;

import entity.User;

import hibernate.SessionFactory;

public class RegisterAction extends ActionSupport{
	
    private String userName;
    private String password;
    
    public String getUsername() {
        return userName;
    }
    public void setUsername(String username) {
        this.userName = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    private UserService userService;
    
    public void setUserService(UserService service){
    	this.userService = service;
    }
    
    public UserService getUserService(){
    	return userService;
    }
    
    public String execute(){
    	    	
    	User user = new User();
    	getUserService().register(user);
    	
    	Session session = SessionFactory.getSession();
    	session.saveOrUpdate(user);
    	
    	return "success";
    }
}