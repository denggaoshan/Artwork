package cn.edu.xmu.artwork.service.imp;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import cn.edu.xmu.artwork.dao.AdvertisementDao;
import cn.edu.xmu.artwork.dao.AdvertorialDao;
import cn.edu.xmu.artwork.dao.ArtistDao;
import cn.edu.xmu.artwork.dao.ChiefEditorDao;
import cn.edu.xmu.artwork.dao.DatePositionDao;
import cn.edu.xmu.artwork.dao.EditorDao;
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
	public ArrayList<Advertorial> getTodayAdvertorialByPos(short pos) 
	{
		//获得今天特定位置的所有软文
		Date today = Utils.getCurrentTime();
		ArrayList<Advertorial> ret =(ArrayList<Advertorial>) getAdvertorialDao().findAllByDatePos(today,pos);
		
		return ret;
	}
	
	
	@Override
	public ArrayList<Advertisement> getTodayAdvertisementByPos(short pos) 
	{
		//获得今天特定位置的所有软文
		Date today = Utils.getCurrentTime();
		ArrayList<Advertisement> ret =(ArrayList<Advertisement>) getAdvertisementDao().findAllByDate(today,pos);
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

	
	@Override
	public List<Advertorial> getAdvertorialByEditor(Editor editor) 
	{
		List<Advertorial> ret = getAdvertorialDao().findAllByEditor(editor);
		
		return ret;
	}

	
	@Override
	public List<Advertorial> getAdvertorialByChiefEditor(ChiefEditor chiefEditor) 
	{
		List<Advertorial> ret = getAdvertorialDao().findAllByChiefEditor(chiefEditor);
		return ret;
	}
	
	
	@Override
	public List<Advertisement> getAdvertisementByChiefEditor(ChiefEditor chiefEditor) 
	{
		List<Advertisement> ret = getAdvertisementDao().findAllByChiefEditor(chiefEditor);
		
		return ret;
	}
	
	
	@Override
	public List<Advertisement> getAdvertisementByArtist(Artist artist) 
	{
		List<Advertisement> ret = getAdvertisementDao().findAllByArtist(artist);
		
		return ret;
	}
	
	
	@Override
	public List<Advertorial> getAllAdvertorial() 
	{
		List<Advertorial> ret = getAdvertorialDao().findAll();
		return ret;
	}


	@Override
	public List<Advertisement> getAllAdvertisement() 
	{
		List<Advertisement> ret = getAdvertisementDao().findAll();
		return ret;
	}
	
	public static void main(String args[]){
		InformationServiceImp service = new InformationServiceImp();
		
		service.setAdvertisementDao(new AdvertisementDao());
		service.setAdvertorialDao(new AdvertorialDao());
		
		EditorDao editorDao = new EditorDao();
		Editor editor = editorDao.findById("cf00914b-243a-46eb-9c74-53c9602c0b6a");
		
		
		ArtistDao artistDao = new ArtistDao();
		Artist artist = artistDao.findById("57abc0e3-6d3e-44ec-9261-9ad0aa038f77");
		
		ChiefEditorDao ced=new ChiefEditorDao();
		ChiefEditor ce=ced.findById("c890b3b6-3996-4908-bee0-306fbe3adaaf");
		
		
		Date begin = Utils.getCurrentTime();
		begin.setDate(10);
		Date end =  Utils.getCurrentTime();
		end.setDate(20);
		
		//service.addAdvertisement(artist,"uploadImg/Advertorial/banner1.jpg" ,begin, end,(short) 1);
		//service.addAdvertorial(editor, "uploadImg/Advertorial/adv2.jpg", begin, end, (short) 2,"软文2",  "摘要", "软文的内容");
		
		//List<Advertorial> ret = service.getAdvertorialByEditor(editor);
		
		//List<Advertorial> ret = service.getAdvertorialByChiefEditor(ce);
		//List<Advertisement> ret = service.getAdvertisementByChiefEditor(ce);
		List<Advertisement> ret = service.getAdvertisementByArtist(artist);
		
		System.out.println(ret.size());
		
		System.out.println("123");
	}


}
