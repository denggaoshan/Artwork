package cn.edu.xmu.artwork.service.imp;

import java.sql.Date;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.edu.xmu.artwork.dao.AdvertisementDao;
import cn.edu.xmu.artwork.dao.AdvertorialDao;
import cn.edu.xmu.artwork.dao.ArtistDao;
import cn.edu.xmu.artwork.dao.DatePositionDao;
import cn.edu.xmu.artwork.dao.EditorDao;
import cn.edu.xmu.artwork.dao.InformationDao;
import cn.edu.xmu.artwork.entity.*;
import cn.edu.xmu.artwork.service.InformationService;
import cn.edu.xmu.commom.utils.Utils;

public class InformationServiceImp implements InformationService
{
	private AdvertorialDao advertorialDao;
	private AdvertisementDao advertisementDao;
	private DatePositionDao datePositionDao;
	

	public AdvertorialDao getAdvertorialDao() {
		return advertorialDao;
	}

	public void setAdvertorialDao(AdvertorialDao advertorialDao) {
		this.advertorialDao = advertorialDao;
	}

	public AdvertisementDao getAdvertisementDao() {
		return advertisementDao;
	}

	public void setAdvertisementDao(AdvertisementDao advertisementDao) {
		this.advertisementDao = advertisementDao;
	}

	public DatePositionDao getDatePositionDao() {
		return datePositionDao;
	}

	public void setDatePositionDao(DatePositionDao datePositionDao) {
		this.datePositionDao = datePositionDao;
	}

	@Override
	public ArrayList<Advertorial> getTodayAdvertorial() 
	{
		//获得今天所有的软文
		Date today = Utils.getCurrentTime();
		ArrayList<Advertorial> ret =(ArrayList<Advertorial>) getAdvertorialDao().findAllByDate(today);
		
		return ret;
	}
	
	@Override
	public ArrayList<Advertisement> getTodayAdvertisement() {
		//获得今天所有的软文
		Date today = Utils.getCurrentTime();
		ArrayList<Advertisement> ret =(ArrayList<Advertisement>) getAdvertisementDao().findAllByDate(today);
		return ret;
	}
	
	@Override
	public boolean addAdvertorial(Editor editor,String homeImg, Date begin, Date end,
			Short position, String title, String topic, String content) {
		
		Session s=getAdvertorialDao().getSession();
		Transaction tx=s.beginTransaction();
		
		Advertorial advertorial = new Advertorial();
		advertorial.setEditor(editor);
		advertorial.setTitle(title);
		advertorial.setTopic(topic);
		advertorial.setHomeImage(homeImg);
		advertorial.setContent(content);
		advertorial.setBeginTime(begin);
		advertorial.setEndTime(end);
		advertorial.setPosition(position);
		
		advertorial.setVerifyStatus((short) 0);
		
		getAdvertorialDao().save(advertorial);
		
		tx.commit();
		
		return true;
	}

	@Override
	public boolean addAdvertisement(Artist artist,String homeImg, Date begin, Date end,
			Short position) {
		
		Session s=getAdvertisementDao().getSession();
		Transaction tx=s.beginTransaction();
		
		Advertisement advertisement = new Advertisement();
		
		advertisement.setArtist(artist);
		
		advertisement.setHomeImage(homeImg);
		advertisement.setBeginTime(begin);
		advertisement.setEndTime(end);
		advertisement.setPosition(position);
		
		advertisement.setVerifyStatus((short) 0);
		
		getAdvertisementDao().save(advertisement);
		
		tx.commit();
		return false;
	}

/*
	public static void main(String args[]){
		InformationServiceImp service = new InformationServiceImp();
		service.setInformationDao(new InformationDao());
		
		
		EditorDao editorDao = new EditorDao();
		Editor editor = editorDao.findById("cf00914b-243a-46eb-9c74-53c9602c0b6a");
		
		
		ArtistDao artistDao = new ArtistDao();
		Artist artist = artistDao.findById("05ac05e3-6816-4136-b682-ee430a7ea12b");
		
		Date begin = Utils.getCurrentTime();
		begin.setDate(10);
		Date end =  Utils.getCurrentTime();
		end.setDate(20);
		
		//service.addAdvertisement(artist,"uploadImg/Advertorial/adv2.jpg" ,begin, end,(short) 2);
		service.addAdvertorial(editor, "uploadImg/Advertorial/adv2.jpg", begin, end, (short) 1,"软文2",  "摘要", "软文的内容");

		
		System.out.println("123");
	}
	*/
}
