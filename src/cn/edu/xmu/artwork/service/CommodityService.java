package cn.edu.xmu.artwork.service;

import java.util.List;
import cn.edu.xmu.artwork.entity.*;

public interface CommodityService 
{
	public List<Commodity> getAllCommodity();
	
	public List<Commodity> getSomeCommodity(String condition);
	
	public void addCommodity(Commodity commodity);
	
	public void editCommodity(Commodity commodity);
}
