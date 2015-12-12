package cn.edu.xmu.artwork.entity;

import java.sql.Date;

public class Information 
{
	private String id;
	private String title;//标题
	private String homeImage;
	private String topic;//摘要
	private String content;//内容

	private ChiefEditor chiefEditor; //审核人
	private Editor editor;//作者
	
	private Date beginTime;
	private Date endTime;
	
	private Short position;
	
	private Short verifyStatus;//审核状态
	
	public ChiefEditor getChiefEditor() {
		return chiefEditor;
	}

	public void setChiefEditor(ChiefEditor chiefEditor) {
		this.chiefEditor = chiefEditor;
	}

	public Editor getEditor() {
		return editor;
	}

	public void setEditor(Editor editor) {
		this.editor = editor;
	}
	
	
	
	
	public String getId() 
	{
		return id;
	}
	
	public void setId(String id) 
	{
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getHomeImage() {
		return homeImage;
	}
	public void setHomeImage(String homeImage) {
		this.homeImage = homeImage;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
	public Short getVerifyStatus() {
		return verifyStatus;
	}
	public void setVerifyStatus(Short verifyStatus) {
		this.verifyStatus = verifyStatus;
	}
	
	
}	
