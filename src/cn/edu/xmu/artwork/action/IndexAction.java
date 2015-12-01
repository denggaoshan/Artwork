package cn.edu.xmu.artwork.action;

import java.util.ArrayList;
import java.util.List;

import cn.edu.xmu.artwork.entity.*;
import cn.edu.xmu.artwork.service.AdvertorialService;
import cn.edu.xmu.artwork.service.UserService;

import com.opensymphony.xwork2.ActionSupport;



public class IndexAction extends ActionSupport
{
	
	 private UserService userService;
	    
	 public void setUserService(UserService userService)
	 {
	     this.userService = userService;
	 }
	    
	 public UserService getUserService()
	 {
	     return userService;
	 }
	
	 private AdvertorialService advertorialService;
	 
	 public void setAdvertorialService(AdvertorialService advertorialService)
	 {
	     this.advertorialService = advertorialService;
	 }
	    
	 public AdvertorialService getAdvertorialService()
	 {
	     return advertorialService;
	 }
	
	 List<User> artistList;
	
	 public List<User> getArtistList()
	 {
		return artistList;
	 }
	
	 List<Advertorial> advertorialListRight;
	 List<Advertorial> advertorialListLeft;
	 
	 public List<Advertorial> getAdvertorialListRight()
	 {
		return advertorialListRight;
	 }
	 
	 public List<Advertorial> getAdvertorialListLeft()
	 {
		return advertorialListLeft;
	 }
	
     public String execute()
     {
    	artistList = getUserService().getAllArtists();
    	List<Advertorial> tmp = getAdvertorialService().getAdvertorial(); 
    	advertorialListLeft= new ArrayList<Advertorial>();
    	advertorialListRight= new ArrayList<Advertorial>();
    	for(int i=0;i<tmp.size();i++){
    		if(i%2==0){
    			advertorialListLeft.add(tmp.get(i));
    		}else{
    			advertorialListRight.add(tmp.get(i));
    		}
    	}
		 return "success";
		 
    }
}