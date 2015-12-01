package service;

import java.util.List;

import entity.Commodity;

public interface CommodityService 
{
	public List<Commodity> getAllCommodity();
	
	public List<Commodity> getSomeCommodity(String condition);
	
	public void addCommodity(Commodity commodity);
	
	public void editCommodity(Commodity commodity);
}
