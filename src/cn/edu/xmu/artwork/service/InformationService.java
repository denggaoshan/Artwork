package cn.edu.xmu.artwork.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import cn.edu.xmu.artwork.entity.*;

public interface InformationService 
{
	//获得今日特定位置的所有软文
	public ArrayList<Advertorial> getTodayAdvertorialByPos(short pos);
	
	//获得今日特定位置的所有广告
	public ArrayList<Advertisement> getTodayAdvertisementByPos(short pos);
	
	//采编添加软文
	public boolean addAdvertorial(Editor editor,String homeImg, Date begin, Date end, Short position,
			String title, String topic,String content);
	
	//艺术家添加广告
	public boolean addAdvertisement(Artist artist,String homeImg, Date begin, Date end, Short position
			);
	
	//得到某个采编发布过的软文   
	public List<Advertorial> getAdvertorialByEditor(Editor editor);
	
	//得到某个主编审核过的软文
	public List<Advertorial> getAdvertorialByChiefEditor(ChiefEditor chiefEditor);
	
	//得到某个主编审核过的广告
	public List<Advertisement> getAdvertisementByChiefEditor(ChiefEditor chiefEditor);
    
	//得到某个艺术家发布过的广告
    public List<Advertisement> getAdvertisementByArtist(Artist artist);
    
    //得到所有软文
    public List<Advertorial> getAllAdvertorial();
   
    //得到所有广告
    public List<Advertisement> getAllAdvertisement();
}
