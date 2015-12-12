package cn.edu.xmu.artwork.entity;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

public class Information 
{
	private String id;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHomeImage() {
		return homeImage;
	}
	public void setHomeImage(String homeImage) {
		this.homeImage = homeImage;
	}
	public Date getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Short getPosition() {
		return position;
	}
	public void setPosition(Short position) {
		this.position = position;
	}
	public ChiefEditor getChiefEditor() {
		return chiefEditor;
	}
	public void setChiefEditor(ChiefEditor chiefEditor) {
		this.chiefEditor = chiefEditor;
	}
	public Short getVerifyStatus() {
		return verifyStatus;
	}
	public void setVerifyStatus(Short verifyStatus) {
		this.verifyStatus = verifyStatus;
	}
	
	private String homeImage;//图片
	
	private Date beginTime;
	private Date endTime;
	
	private Short position;//上线位置 1为主页
	
	private ChiefEditor chiefEditor; //审核人
	private Short verifyStatus;//审核状态
	
	
}	
