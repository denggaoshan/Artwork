package cn.edu.xmu.artwork.action;

import java.util.ArrayList;
import java.util.List;
import cn.edu.xmu.artwork.entity.*;
import cn.edu.xmu.artwork.service.InformationService;
import cn.edu.xmu.artwork.service.UserService;

import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport
{
	 private UserService userService;
	 private InformationService informationService;
	 
	 List<Artist> artistList;
	 List<Advertisement> advertisementList;
	 List<Advertorial> advertorialList;
	 

	 public UserService getUserService() {
		return userService;
	}


	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	public InformationService getInformationService() {
		return informationService;
	}


	public void setInformationService(InformationService informationService) {
		this.informationService = informationService;
	}


	public List<Artist> getArtistList() {
		return artistList;
	}


	public void setArtistList(List<Artist> artistList) {
		this.artistList = artistList;
	}


	public List<Advertisement> getAdvertisementList() {
		return advertisementList;
	}


	public void setAdvertisementList(List<Advertisement> advertisementList) {
		this.advertisementList = advertisementList;
	}


	public List<Advertorial> getAdvertorialList() {
		return advertorialList;
	}


	public void setAdvertorialList(List<Advertorial> advertorialList) {
		advertorialList = advertorialList;
	}


	//加载首页的内容
     public String execute()
     {
    	artistList = getUserService().getAllArtists();
    	advertisementList = getInformationService().getTodayAdvertisementByPos( (short) 1);
    	advertorialList =  getInformationService().getTodayAdvertorialByPos( (short) 2);
		
    	return "success";
		 
    }
}