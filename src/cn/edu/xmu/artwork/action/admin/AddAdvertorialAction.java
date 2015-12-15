package cn.edu.xmu.artwork.action.admin;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import cn.edu.xmu.artwork.entity.Editor;
import cn.edu.xmu.artwork.entity.User;
import cn.edu.xmu.artwork.service.InformationService;
import cn.edu.xmu.commom.utils.ActionHelper;
import cn.edu.xmu.commom.utils.Utils;

import com.googlecode.jsonplugin.annotations.JSON;
import com.opensymphony.xwork2.ActionSupport;

public class AddAdvertorialAction extends ActionSupport
{
	private static final long serialVersionUID = 123L;

	public String execute()
    {
		Result = new HashMap<String, Object>();  
		System.out.print("in");
		User currentUser = Utils.getCurrentUser();
		if(!(currentUser instanceof Editor))
			return ActionHelper.FailMessage(Result, "没有权限！");
		if(!ActionHelper.CheckNotNull(homeImg))
    		return ActionHelper.FailMessage(Result,"首页图片未填写！");
		
		if(!ActionHelper.CheckNotNull(title))
    		return ActionHelper.FailMessage(Result,"标题未填写！");
		if(!ActionHelper.CheckNotNull(topic))
    		return ActionHelper.FailMessage(Result,"简要未填写！");
		if(!ActionHelper.CheckNotNull(content))
    		return ActionHelper.FailMessage(Result,"内容未填写！");
		
		Date begin = Date.valueOf(Utils.getRequest().getParameter("begin"));
		Date end = Date.valueOf(Utils.getRequest().getParameter("end"));
		Short position = Short.valueOf(Utils.getRequest().getParameter("position"));
		
		boolean result=getInformationService().addAdvertorial((Editor)currentUser, homeImg, begin, end, position, title, topic, content);
   	    
		if(result==false)
			return ActionHelper.FailMessage(Result,"系统错误！");
		else
			return ActionHelper.SuccessMessage(Result);
    }
	
	private Map<String,Object> Result;  
	private String homeImg;
	private String title;
	private String topic;
	private String content;
	private InformationService informationService;
	
	public Map<String, Object> getResult() {
		return Result;
	}

	@JSON(serialize=false)  
	public String getHomeImg() {
		return homeImg;
	}

	public void setHomeImg(String homeImg) {
		this.homeImg = homeImg;
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

	@JSON(serialize=false)  
	public InformationService getInformationService() 
	{
		return informationService;
	}

	public void setInformationService(InformationService informationService) 
	{
		this.informationService = informationService;
	}

}
