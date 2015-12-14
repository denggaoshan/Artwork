package cn.edu.xmu.artwork.service;

import java.util.List;
import cn.edu.xmu.artwork.entity.Advertisement;
import cn.edu.xmu.artwork.entity.Advertorial;
import cn.edu.xmu.artwork.entity.ChiefEditor;
import cn.edu.xmu.artwork.entity.Information;

public interface AuditService {
	
	//获得未审核的软文
	public List<Advertorial> getAuditAdvertorials();
	
	//获得未审核的广告
	public List<Advertisement> getAuditAdvertisements();
		
	
	//通过审核
	public boolean passAudit(ChiefEditor chiefEditor,Information information);
	//拒绝审核
	public boolean rejectAudit(ChiefEditor chiefEditor,Information information);
}
