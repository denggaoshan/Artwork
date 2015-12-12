package cn.edu.xmu.artwork.service.imp;

import java.sql.Date;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.edu.xmu.artwork.dao.AdvertisementDao;
import cn.edu.xmu.artwork.dao.AdvertorialDao;
import cn.edu.xmu.artwork.dao.EditorDao;
import cn.edu.xmu.artwork.dao.InformationDao;
import cn.edu.xmu.artwork.entity.*;
import cn.edu.xmu.artwork.service.InformationService;
import cn.edu.xmu.commom.utils.Utils;

public class InformationServiceImp implements InformationService
{
	private InformationDao informationDao;
	    
	public void setInformationDao(InformationDao informationDao)
	{
	     this.informationDao = informationDao;
	}
	    
	public InformationDao getInformationDao()
	{
	     return this.informationDao;
	}
	
	private AdvertisementDao advertisementDao;
	
	public AdvertisementDao getAdvertisementDao() 
	{
		return advertisementDao;
	}

	public void setAdvertisementDao(AdvertisementDao advertisementDao) 
	{
		this.advertisementDao = advertisementDao;
	}

	private AdvertorialDao advertorialDao;
	
	public AdvertorialDao getAdvertorialDao()
	{
		return advertorialDao;
	}

	public void setAdvertorialDao(AdvertorialDao advertorialDao) 
	{
		this.advertorialDao = advertorialDao;
	}

	
	@Override
	public ArrayList<Advertorial> getAdvertorial() 
	{
		ArrayList<Advertorial> ret = (ArrayList<Advertorial>) getAdvertorialDao().findAll();
		return ret;
	}

	@Override
	public Advertorial getAdvertorialById(String id) 
	{
		return getAdvertorialDao().findById(id);
	}

	
	@Override
	public boolean addAdvertorial(Editor editor, String title, String topic,
			String content, Date begin, Date end, Short position) {
		
		Session s=getInformationDao().getSession();
		Transaction tx=s.beginTransaction();
		
		Advertorial advertorial = new Advertorial();
		advertorial.setEditor(editor);
		advertorial.setTitle(title);
		advertorial.setTopic(topic);
		advertorial.setHomeImage("uploadImg/Advertorial/adv1.jpg");
		advertorial.setContent(content);
		advertorial.setBeginTime(begin);
		advertorial.setEndTime(end);
		advertorial.setPosition(position);
		
		advertorial.setVerifyStatus((short) 0);
		
		getInformationDao().save(advertorial);
		
		tx.commit();
		
		return false;
	}
	
	
	public static void main(String args[]){
		InformationServiceImp service = new InformationServiceImp();
		service.setInformationDao(new InformationDao());
		
		EditorDao editorDao = new EditorDao();
		Editor editor = editorDao.findById("cf00914b-243a-46eb-9c74-53c9602c0b6a");
		
		Date begin = Utils.getCurrentTime();
		
		begin.setDate(15);
		
		Date end =  Utils.getCurrentTime();
		end.setDate(20);
		
		service.addAdvertorial(editor, "软文1", "摘要", "content", begin, end, (short) 1);
		System.out.println("123");
	}
}
