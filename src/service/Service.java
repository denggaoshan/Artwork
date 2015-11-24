package service;

import java.util.ArrayList;

import entity.Commodity;
import entity.User;


public interface Service {
	
	public void login(String username,String password);
	
	public void register(String username,String password);
	
	public void addCommodity(Commodity commodity);
	
	public User getUser(String userId);
	
	public ArrayList<Commodity> getCommodities();
	
	public Commodity getCommdity(String commodityId);
	
}
