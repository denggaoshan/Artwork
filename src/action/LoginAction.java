package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import service.Service;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import entity.User;

public class LoginAction extends ActionSupport{
    private String userName;
    private String password;
    
	private String nickname;
	
	public void setNickname(String nickname){
		this.nickname = nickname;
	}
	
	public String getNickname(){
		return nickname;
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
 
    private Service service;
    
    public void setService(Service service){
    	this.service = service;
    }
    
    public Service getService(){
    	return service;
    }
    
    public String execute(){
    	getService().login(userName, password);
    	
    	 return "success";
    }
}