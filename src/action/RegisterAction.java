package action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

import service.UserService;
import utils.Utils;


import com.opensymphony.xwork2.ActionSupport;

import entity.User;

import hibernate.SessionFactory;

public class RegisterAction extends ActionSupport{
	
    private String userName;
    private String password;
    private String nickName;
    
    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    
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
    	HttpServletRequest request = ServletActionContext.getRequest();
    	String ip=Utils.getClientIpAddress(request);
    	
    	Assert.isTrue(userName!=null && password!=null&&nickName!=null&&ip!=null);
    	getUserService().register(userName, password, nickName,ip);
    	
    	User user = Utils.getCurrentUser();
    	if(user!=null){
    		return "success";
    	}
    	return "fail";
    	
    }
}