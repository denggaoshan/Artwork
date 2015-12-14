﻿package cn.edu.xmu.artwork.action;

import java.util.HashMap;
import java.util.Map;

import cn.edu.xmu.artwork.entity.*;

import cn.edu.xmu.artwork.service.UserService;
import cn.edu.xmu.commom.utils.ActionHelper;
import cn.edu.xmu.commom.utils.Utils;

import com.googlecode.jsonplugin.annotations.JSON;
import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport
{
	private static final long serialVersionUID = 1L;  
	
    private String username;
    private String password;
    private Map<String,Object> Result;  
    
    
    private User currentUser;
    
    public User getCurrentUser() 
    {
        return currentUser;
    }
    
    public void setCurrentUser(User currentUser) 
    {
        this.currentUser = currentUser;
    }
    
    public String execute()
    {
    	Result = new HashMap<String, Object>();  
    	
    	//参数检查
    	if(!ActionHelper.CheckNotNull(username))
    		return ActionHelper.FailMessage(Result,"用户名未填写！");
    	if(!ActionHelper.CheckNotNull(password))
    		return ActionHelper.FailMessage(Result,"密码未填写！");
    	
    	getUserService().login(username, password);
    	
    	currentUser = Utils.getCurrentUser();
    	
    	if(currentUser!=null){
    		return ActionHelper.SuccessMessage(Result);
    	}else{
    		return ActionHelper.FailMessage(Result,"用户名或密码错误！");
    	}
    }
    
    public Map<String, Object> getResult() {  
        return Result;  
    } 
    
    @JSON(serialize=false)  
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    @JSON(serialize=false)  
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
    
    @JSON(serialize=false)  
    public UserService getUserService(){
    	return userService;
    }

}