package cn.edu.xmu.artwork.service;

import java.sql.Date;
import java.util.ArrayList;

import cn.edu.xmu.artwork.entity.*;

public interface InformationService 
{
	//获得首页今日的所有软文
	public ArrayList<Advertorial> getTodayAdvertorial();
	//获得首页今日的所有广告
	public ArrayList<Advertisement> getTodayAdvertisement();
	
	//添加软文
	public boolean addAdvertorial(Editor editor,String homeImg, Date begin, Date end, Short position,
			String title, String topic,String content);
	//添加广告
	public boolean addAdvertisement(Artist artist,String homeImg, Date begin, Date end, Short position
			);
	   
}
