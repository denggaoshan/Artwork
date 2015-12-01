package service.imp;

import java.util.ArrayList;

import dao.AdvertorialDAO;
import entity.Advertorial;

import service.AdvertorialService;

public class AdvertorialServiceImp implements AdvertorialService
{
	
	  private AdvertorialDAO advertorialDao;
	    
	  public void setAdvertorialDAO(AdvertorialDAO advertorialDao)
	  {
	    this.advertorialDao = advertorialDao;
	  }
	    
	  public AdvertorialDAO getAdvertorialDao()
	  {
	    return advertorialDao;
	  }
	
	@Override
	public ArrayList<Advertorial> getAdvertorial() 
	{
		ArrayList<Advertorial>ret =  (ArrayList<Advertorial>) getAdvertorialDao().findByTopMost("1");
		return ret;
	}

	@Override
	public Advertorial getAdvertorialById(String id) 
	{
		// TODO Auto-generated method stub
		return getAdvertorialDao().findById(id);
	}
	
	

}
