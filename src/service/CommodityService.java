package service;

import java.util.ArrayList;

import entity.Commodity;

public interface CommodityService {

	//�����Ȱ�TOP MOST�� Ȼ���ٰ�ԭ��˳���ŵ�����õ�����
	public ArrayList<Commodity> getAllCommodity();
	
	
	public void addCommodity(Commodity commodity);
	public void editCommodity(Commodity commodity);
}
