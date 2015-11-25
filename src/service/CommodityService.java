package service;

import java.util.ArrayList;

import entity.Commodity;

public interface CommodityService {

	//返回先按TOP MOST排 然后再按原来顺序排的排序好的数组
	public ArrayList<Commodity> getAllCommodity();
	
	
	public void addCommodity(Commodity commodity);
	public void editCommodity(Commodity commodity);
}
