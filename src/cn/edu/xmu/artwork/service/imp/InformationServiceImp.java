package cn.edu.xmu.artwork.service.imp;

import java.util.ArrayList;

import cn.edu.xmu.artwork.dao.AdvertisementDao;
import cn.edu.xmu.artwork.dao.AdvertorialDao;
import cn.edu.xmu.artwork.dao.InformationDao;
import cn.edu.xmu.artwork.entity.*;
import cn.edu.xmu.artwork.service.InformationService;

public class InformationServiceImp implements InformationService
{
	private InformationDao informationDao;
	    
	public void setInformationDao(InformationDao informationDao)
	{
	     this.informationDao = informationDao;
	}
	    
	public InformationDao getInformationDao()
	{
	     return this.informationDao;
	}
	
	private AdvertisementDao advertisementDao;
	
	public AdvertisementDao getAdvertisementDao() 
	{
		return advertisementDao;
	}

	public void setAdvertisementDao(AdvertisementDao advertisementDao) 
	{
		this.advertisementDao = advertisementDao;
	}

	private AdvertorialDao advertorialDao;
	
	public AdvertorialDao getAdvertorialDao()
	{
		return advertorialDao;
	}

	public void setAdvertorialDao(AdvertorialDao advertorialDao) 
	{
		this.advertorialDao = advertorialDao;
	}

	
	@Override
	public ArrayList<Advertorial> getAdvertorial() 
	{
		// TODO Auto-generated method stub
		ArrayList<Advertorial> ret = (ArrayList<Advertorial>) getAdvertorialDao().findAll();
		return ret;
	}

	@Override
	public Advertorial getAdvertorialById(String id) 
	{
		// TODO Auto-generated method stub
		return getAdvertorialDao().findById(id);
	}
}
