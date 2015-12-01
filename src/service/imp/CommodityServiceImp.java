package service.imp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.CommodityDAO;
import entity.Commodity;
import service.CommodityService;
import utils.Utils;

public class CommodityServiceImp implements CommodityService
{
	private CommodityDAO commodityDao;
	
	public void setCommodityDao(CommodityDAO commodityDao)
	{
		this.commodityDao=commodityDao;
	}
	
	public CommodityDAO getCommodityDao()
	{
		return this.commodityDao;
	}
	
	@Override
	public List<Commodity> getAllCommodity() 
	{
		// TODO Auto-generated method stub
		List<Commodity> ret = getCommodityDao().findAll();
		return ret;
	}
	
	@Override
	public List<Commodity> getSomeCommodity(String condition) 
	{
		// TODO Auto-generated method stub
		String hql = "from Commodity as commodity where commodity.name like '%" + condition +"%'";
		
		List<Commodity> ret = getCommodityDao().findByHQL(hql);
		
		return ret;
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
