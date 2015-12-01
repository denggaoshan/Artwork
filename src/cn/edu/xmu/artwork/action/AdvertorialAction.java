package cn.edu.xmu.artwork.action;

import org.springframework.util.Assert;


import cn.edu.xmu.artwork.entity.Advertorial;
import cn.edu.xmu.artwork.service.AdvertorialService;
import cn.edu.xmu.commom.utils.Utils;

import com.opensymphony.xwork2.ActionSupport;


public class AdvertorialAction extends ActionSupport
{
	private AdvertorialService advertorialService;
	
	public AdvertorialService getAdvertorialService() 
	{
		return advertorialService;
	}

	public void setAdvertorialService(AdvertorialService advertorialService) 
	{
		this.advertorialService = advertorialService;
	}

	private Advertorial advertorial;
	
	public Advertorial getAdvertorial() 
	{
		Assert.notNull(advertorial);
		return advertorial;
	}
	
	public String execute()
    {
		String id=  Utils.getRequest().getParameter("id");
   	    advertorial=getAdvertorialService().getAdvertorialById(id);
		Assert.notNull(advertorial);
   	    return "success";
		
    }
}
