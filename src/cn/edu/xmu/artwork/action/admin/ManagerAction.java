package cn.edu.xmu.artwork.action.admin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.Assert;

import cn.edu.xmu.artwork.entity.*;
import cn.edu.xmu.artwork.service.InformationService;
import cn.edu.xmu.artwork.service.UserService;
import cn.edu.xmu.commom.utils.Utils;

import com.opensymphony.xwork2.ActionSupport;

public class ManagerAction extends ActionSupport
{
	
	 private Manager manager;
	 private String chooseType;
	 
	 List showList;
	 
	 public String getChooseType() {
		return chooseType;
	}

	public void setChooseType(String chooseType) {
		this.chooseType = chooseType;
	}

	
	 
	private UserService userService;
	private InformationService informationService;
	 
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public List<User> getShowList() {
		return showList;
	}

	public void setShowList(List<User> showList) {
		this.showList = showList;
	}

	
	private void loadArtists(){
		showList = getUserService().getAllArtists();
	}
	
	private void loadUsers(){
		showList= getUserService().getAllUsers();
	}
	
	private void loadEditors(){
		showList= getUserService().getAllEditors();
	}
	
	private void loadAdvertorials(){
		showList= getInformationService().getAllAdvertorial();
	}
	
	private void loadAdvertisements(){
		showList= getInformationService().getAllAdvertisement();
	}
	
	
	
	public InformationService getInformationService() {
		return informationService;
	}

	public void setInformationService(InformationService informationService) {
		this.informationService = informationService;
	}

	private void loadChiefEditors(){
		showList= getUserService().getAllChiefEditors();
	}
	
	//加载首页的内容
     public String execute()
     {
    	manager = (Manager) Utils.getCurrentUser();
    	
    	Assert.notNull(manager);
    	
    	if(chooseType==null || chooseType.equals("user")){
    		Utils.setSession("showTableType","User");
    		loadUsers();
	    }else if(chooseType.equals("artist")){
	    	Utils.setSession("showTableType","User");
	    	loadArtists();
	    }else if(chooseType.equals("editor")){
	    	Utils.setSession("showTableType","User");
    		this.loadEditors();
    	}else if(chooseType.equals("chiefEditor")){
    		Utils.setSession("showTableType","User");
    		this.loadChiefEditors();
    	}else if(chooseType.equals("advertisement")){
    		Utils.setSession("showTableType","Advertisement");
    		this.loadAdvertisements();
    	}else if(chooseType.equals("advertorial")){
    		Utils.setSession("showTableType","Advertorial");
    		this.loadAdvertorials();
    	}
    	
    	return "success";
		 
    }
}