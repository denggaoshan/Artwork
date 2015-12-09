package cn.edu.xmu.artwork.service.imp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.edu.xmu.artwork.dao.CommodityDao;
import cn.edu.xmu.artwork.entity.*;

import cn.edu.xmu.artwork.service.CommodityService;
import cn.edu.xmu.commom.utils.Utils;


public class CommodityServiceImp implements CommodityService
{
	private CommodityDao commodityDao;
	
	public void setCommodityDao(CommodityDao commodityDao)
	{
		this.commodityDao=commodityDao;
	}
	
	public CommodityDao getCommodityDao()
	{
		return this.commodityDao;
	}
	
	@Override
	public List<Commodity> getAllCommodity() 
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Commodity> getSomeCommodity(String condition) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editCommodity(Commodity commodity) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCommodity(Commodity commodity) {
		// TODO Auto-generated method stub
		
	}
}
