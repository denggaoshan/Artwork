package action;

import org.springframework.util.Assert;

import service.AdvertorialService;
import utils.Utils;

import com.opensymphony.xwork2.ActionSupport;

import entity.Advertorial;

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
		return advertorial;
	}

	public String execute()
    {
		String id=  Utils.getRequest().getParameter("id");
   	    advertorial=getAdvertorialService().getAdvertorialById(id);
		
		return "success";
    }
}
