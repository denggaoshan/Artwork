package cn.edu.xmu.artwork.action.admin;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.util.Assert;

import cn.edu.xmu.artwork.entity.*;
import cn.edu.xmu.artwork.service.InformationService;
import cn.edu.xmu.artwork.service.UserService;
import cn.edu.xmu.commom.utils.ActionHelper;
import cn.edu.xmu.commom.utils.Utils;

import com.googlecode.jsonplugin.annotations.JSON;
import com.opensymphony.xwork2.ActionSupport;

public class EditorAction extends ActionSupport
{
	
	private Editor editor;
	
	List showList;
	
	public List getShowList() {
		return showList;
	}

	public void setShowList(List showList) {
		this.showList = showList;
	}

	public InformationService getInformationService() {
		return informationService;
	}

	public void setInformationService(InformationService informationService) {
		this.informationService = informationService;
	}

	private InformationService informationService;
	
	public Editor getEditor() {
		return editor;
	}

	public void setEditor(Editor editor) {
		this.editor = editor;
	}
	
	public void loadAdvertorials(){
		showList = this.getInformationService().getAdvertorialByEditor(editor);
	}
	
	//加载首页的内容
     public String execute()
     {
    	
    	editor = (Editor) Utils.getCurrentUser();
    	Assert.notNull(editor);
    	
    	Utils.setSession("showTableType","Advertorial");
    	loadAdvertorials();
    	
    	return "success";
		 
    }
     
    private Map<String,Object> Result;  
 	private String homeImg;
 	private Date begin;
 	private Date end;
 	private Short position;
 	private String title;
 	private String topic;
 	private String content;
 	
 	public Map<String, Object> getResult() {
 		return Result;
 	}

 	public void setResult(Map<String, Object> result) {
 		Result = result;
 	}

 	@JSON(serialize=false)  
 	public String getHomeImg() {
 		return homeImg;
 	}

 	public void setHomeImg(String homeImg) {
 		this.homeImg = homeImg;
 	}

 	@JSON(serialize=false)  
 	public Date getBegin() {
 		return begin;
 	}

 	public void setBegin(Date begin) {
 		this.begin = begin;
 	}

 	@JSON(serialize=false)  
 	public Date getEnd() {
 		return end;
 	}

 	public void setEnd(Date end) {
 		this.end = end;
 	}

 	@JSON(serialize=false)  
 	public Short getPosition() {
 		return position;
 	}

 	public void setPosition(Short position) {
 		this.position = position;
 	}

 	@JSON(serialize=false)  
 	public String getTitle() {
 		return title;
 	}

 	public void setTitle(String title) {
 		this.title = title;
 	}

 	@JSON(serialize=false)  
 	public String getTopic() {
 		return topic;
 	}

 	public void setTopic(String topic) {
 		this.topic = topic;
 	}

 	@JSON(serialize=false)  
 	public String getContent() {
 		return content;
 	}

 	public void setContent(String content) {
 		this.content = content;
 	}
     
     public String addAdvertorial(){
    	 System.out.print("in");
 		User currentUser = Utils.getCurrentUser();
 		if(!(currentUser instanceof Editor))
 			return ActionHelper.FailMessage(Result, "没有权限！");
 		if(!ActionHelper.CheckNotNull(homeImg))
     		return ActionHelper.FailMessage(Result,"首页图片未填写！");
 		if(!ActionHelper.CheckNotNull(begin))
     		return ActionHelper.FailMessage(Result,"开始时间未填写！");
 		if(!ActionHelper.CheckNotNull(end))
     		return ActionHelper.FailMessage(Result,"结束时间未填写！");
 		if(!ActionHelper.CheckNotNull(position))
     		return ActionHelper.FailMessage(Result,"位置未填写！");
 		if(!ActionHelper.CheckNotNull(title))
     		return ActionHelper.FailMessage(Result,"标题未填写！");
 		if(!ActionHelper.CheckNotNull(topic))
     		return ActionHelper.FailMessage(Result,"简要未填写！");
 		if(!ActionHelper.CheckNotNull(content))
     		return ActionHelper.FailMessage(Result,"内容未填写！");
 		
 		boolean result=getInformationService().addAdvertorial((Editor)currentUser, homeImg, begin, end, position, title, topic, content);
    	    
 		if(result==false)
 			return ActionHelper.FailMessage(Result,"系统错误！");
 		else
 			return ActionHelper.SuccessMessage(Result);
     }
}