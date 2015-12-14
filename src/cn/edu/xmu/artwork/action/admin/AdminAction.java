package cn.edu.xmu.artwork.action.admin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.util.Assert;

import cn.edu.xmu.artwork.entity.*;
import cn.edu.xmu.artwork.service.InformationService;
import cn.edu.xmu.artwork.service.UserService;
import cn.edu.xmu.commom.utils.Utils;

import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport
{
	
	//加载首页的内容
     public String execute()
     {
    	User user = Utils.getCurrentUser();
    	
    	if(user instanceof Editor){
    		Utils.setUserType("Editor");
    		return "editor";
    	}else if(user instanceof ChiefEditor){
    		Utils.setUserType("ChiefEditor");
    		return "chiefEditor";
    	}else if(user instanceof Manager){
    		Utils.setUserType("Manager");
    		return "manager";
    	}
    	
    	Assert.isNull(user,"如果看到这一行，说明是普通用户在后台登陆。未完成");
    	
    	return "error";
    }
}