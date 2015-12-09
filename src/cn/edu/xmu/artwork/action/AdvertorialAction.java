package cn.edu.xmu.artwork.action;

import cn.edu.xmu.artwork.entity.Advertorial;
import cn.edu.xmu.artwork.service.InformationService;
import cn.edu.xmu.commom.utils.Utils;
import com.opensymphony.xwork2.ActionSupport;

public class AdvertorialAction extends ActionSupport
{
	private InformationService informationService;
	
	public InformationService getInformationService() 
	{
		return informationService;
	}

	public void setInformationService(InformationService informationService) 
	{
		this.informationService = informationService;
	}

	private Advertorial advertorial;
	
	public Advertorial getAdvertorial() 
	{
		return advertorial;
	}
	
	public String execute()
    {
		String id=  Utils.getRequest().getParameter("id");
   	    advertorial=getInformationService().getAdvertorialById(id);
   	    
   	    return "success";
    }
}
