package action;

import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.UserService;
import utils.Utils;


import com.opensymphony.xwork2.ActionSupport;

import entity.User;

import hibernate.SessionFactory;


public class LoginAction extends ActionSupport{
	
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
    
    public void setUserService(UserService userService){
    	this.userService = userService;
    }
    
    public UserService getUserService(){
    	return userService;
    }
   
    public String execute(){
    	System.out.println("Action "+userName+" "+password);
    	getUserService().login(userName, password);
    	User user = Utils.getCurrentUser();
    	if(user!=null){
    		return "success";
    	}else{
    		return "fail";
    	}
    	
    }
}