package cn.edu.xmu.artwork.service.imp;

import java.sql.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import cn.edu.xmu.artwork.dao.AdvertisementDao;
import cn.edu.xmu.artwork.dao.AdvertorialDao;
import cn.edu.xmu.artwork.dao.ChiefEditorDao;
import cn.edu.xmu.artwork.dao.DatePositionDao;
import cn.edu.xmu.artwork.entity.Advertisement;
import cn.edu.xmu.artwork.entity.Advertorial;
import cn.edu.xmu.artwork.entity.ChiefEditor;
import cn.edu.xmu.artwork.entity.DatePosition;
import cn.edu.xmu.artwork.entity.Information;
import cn.edu.xmu.artwork.service.AuditService;
import cn.edu.xmu.commom.utils.Utils;

public class AuditServiceImp implements AuditService{
	
	AdvertorialDao advertorialDao;
	AdvertisementDao advertisementDao;
	DatePositionDao datePositionDao;
	
	public DatePositionDao getDatePositionDao() {
		return datePositionDao;
	}

	public void setDatePositionDao(DatePositionDao datePositionDao) {
		this.datePositionDao = datePositionDao;
	}

	public AdvertorialDao getAdvertorialDao() {
		return advertorialDao;
	}

	public void setAdvertorialDao(AdvertorialDao advertorialDao) {
		this.advertorialDao = advertorialDao;
	}

	
	@Override
	public List<Advertorial> getAuditAdvertorials() {
		List<Advertorial> ret =getAdvertorialDao().findByProperty("verifyStatus",0);
		return ret;
	}
	
	@Override
	public List<Advertisement> getAuditAdvertisements() {
		List<Advertisement> ret =getAdvertisementDao().findByProperty("verifyStatus",0);
		return ret;
	}
	
	
	public AdvertisementDao getAdvertisementDao() {
		return advertisementDao;
	}

	public void setAdvertisementDao(AdvertisementDao advertisementDao) {
		this.advertisementDao = advertisementDao;
	}


	@Override
	public boolean passAudit(ChiefEditor chiefEditor,Information information) {
		Session s=getAdvertorialDao().getSession();
		
		Transaction tx=s.beginTransaction();
		s.update(information);
		information.setVerifyStatus((short) 1);
		
		Date begin = information.getBeginTime();
		Date end = information.getEndTime();

		int cmp = Utils.dateDiff(begin, end);
		//加到 DatePosition
		for(int i=0;i<cmp;i++){
			//创建
			
			DatePosition tmp = new DatePosition();
			tmp.setInformation(information);
			
			tmp.setDate(Utils.dateIncrease(begin,i));
			tmp.setPosition(information.getPosition());
			tmp.setSequence((short) 1);
			
			getDatePositionDao().save(tmp);
			
		}
		information.setChiefEditor(chiefEditor);
		tx.commit();
		return true;
	}

	@Override
	public boolean rejectAudit(ChiefEditor chiefEditor,Information information) {
		Session s=getAdvertorialDao().getSession();
		Transaction tx=s.beginTransaction();
		s.update(information);
		information.setVerifyStatus((short) 2);
		information.setChiefEditor(chiefEditor);
		tx.commit();
		return true;
	}
	
	
	public static void main(String args[]){
		AuditServiceImp auditServiceImp=new AuditServiceImp();
		auditServiceImp.setAdvertorialDao(new AdvertorialDao());
		auditServiceImp.setAdvertisementDao(new AdvertisementDao());
		auditServiceImp.setDatePositionDao(new DatePositionDao());
	
		ChiefEditorDao ced=new ChiefEditorDao();
		ChiefEditor ce=ced.findById("c890b3b6-3996-4908-bee0-306fbe3adaaf");
		
		//List<Advertorial> ret = auditServiceImp.getAuditAdvertorials();
		
		//auditServiceImp.passAudit(ce,ret.get(0));
		
		List<Advertisement> ret = auditServiceImp.getAuditAdvertisements();
		
		auditServiceImp.passAudit(ce,ret.get(0));
		System.out.println(ret.size());
		
	}

}
