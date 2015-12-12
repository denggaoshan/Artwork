package cn.edu.xmu.artwork.service;

import java.util.List;

import cn.edu.xmu.artwork.entity.Advertorial;
import cn.edu.xmu.artwork.entity.Information;

public interface AuditService {
	
	//获得未审核的软文
	public List<Advertorial> getAuditAdvertorials();
	
	//通过审核
	public boolean passAudit(Information information);
	//拒绝审核
	public boolean rejectAudit(Information information);
}
