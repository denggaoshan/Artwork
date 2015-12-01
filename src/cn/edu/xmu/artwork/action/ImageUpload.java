package cn.edu.xmu.artwork.action;

import java.io.File;
import org.springframework.web.struts.ActionSupport;

import cn.edu.xmu.artwork.service.CommonService;

public class ImageUpload extends ActionSupport 
{
	public String execute()throws Exception
	{
		getCommonService().upLoadFile(getPicFileName(),getPic());
		
		return "success";
	}
	

	File pic;//图片文件
	String picContentType;
	String picFileName;//图片名
	String id;
	
	public String getId() 
	{
		return id;
	}

	public void setId(String id) 
	{
		this.id = id;
	}

	public File getPic() 
	{
		return this.pic;
	}
	
	public void setPic(File pic) 
	{
	    this.pic = pic;
	}
	
	public String getPicContentType() 
	{
		return picContentType;
	}
	
	public void setPicContentType(String picContentType) 
	{
	    this.picContentType = picContentType;
	}
	
	public void setPicFileName(String picFileName) 
	{
		this.picFileName = picFileName;
	}
	
	public String getPicFileName() 
	{
		return this.picFileName;	
	}
	
	private CommonService commonService;

	public CommonService getCommonService( ) 	
	{	
		return commonService;
	}
	
	public void setCommonService(CommonService commonService) 
	{
		this.commonService = commonService;
	}
	
}