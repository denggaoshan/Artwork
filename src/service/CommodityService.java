package service;

import java.util.ArrayList;

import entity.Commodity;

public interface CommodityService {

	public ArrayList<Commodity> getAllCommodity();
	
	public void addCommodity(Commodity commodity);
	
	public void editCommodity(Commodity commodity);
}
