package cn.edu.xmu.artwork.service.imp;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.util.Assert;

import cn.edu.xmu.artwork.dao.AdvertorialDao;
import cn.edu.xmu.artwork.dao.DatePositionDao;
import cn.edu.xmu.artwork.dao.EditorDao;
import cn.edu.xmu.artwork.dao.InformationDao;
import cn.edu.xmu.artwork.entity.Advertorial;
import cn.edu.xmu.artwork.entity.DatePosition;
import cn.edu.xmu.artwork.entity.Editor;
import cn.edu.xmu.artwork.entity.Information;
import cn.edu.xmu.artwork.service.AuditService;
import cn.edu.xmu.commom.utils.Utils;

public class AuditServiceImp implements AuditService{
	
	AdvertorialDao advertorialDao;
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
	public boolean passAudit(Information information) {
		Session s=getAdvertorialDao().getSession();
		
		Transaction tx=s.beginTransaction();
		//s.update(information);
		//information.setVerifyStatus((short) 1);
		
		Date begin = information.getBeginTime();
		Date end = information.getEndTime();

		int cmp = Utils.dateDiff(begin, end);
		//加到 DatePosition
		for(int i=0;i<cmp;i++){
			//创建
			Session sd = getDatePositionDao().getSession();
			Transaction txd=sd.beginTransaction();
			
			DatePosition tmp = new DatePosition();
			tmp.setInformation(information);
			
			tmp.setDate(Utils.dateIncrease(begin,i));
			tmp.setPosition(information.getPosition());
			
			getDatePositionDao().save(tmp);
			txd.commit();
		}
		
		tx.commit();
		return true;
	}

	@Override
	public boolean rejectAudit(Information information) {
		Session s=getAdvertorialDao().getSession();
		Transaction tx=s.beginTransaction();
		s.update(information);
		information.setVerifyStatus((short) 2);
		tx.commit();
		return true;
	}
	
	public static void main(String args[]){
		AuditServiceImp auditServiceImp=new AuditServiceImp();
		auditServiceImp.setAdvertorialDao(new AdvertorialDao());
		auditServiceImp.setDatePositionDao(new DatePositionDao());
		
		List<Advertorial> ret = auditServiceImp.getAuditAdvertorials();
		Assert.notNull(ret);
		auditServiceImp.passAudit(ret.get(0));
		System.out.println(ret.size());
	}


}
