package cn.edu.xmu.artwork.service.imp;

import java.util.ArrayList;

import cn.edu.xmu.artwork.dao.AdvertorialDAO;
import cn.edu.xmu.artwork.entity.Advertorial;
import cn.edu.xmu.artwork.service.AdvertorialService;



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
