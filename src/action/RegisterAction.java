package action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.Service;

import com.opensymphony.xwork2.ActionSupport;

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
    
    private Service service;
    
    public void setService(Service service){
    	this.service = service;
    }
    
    public Service getService(){
    	return service;
    }
    
    public String execute(){
    	getService().register(userName, password);
    	
    	return "success";
    }
}