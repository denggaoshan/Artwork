package cn.edu.xmu.artwork.action.admin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.Assert;

import cn.edu.xmu.artwork.entity.*;
import cn.edu.xmu.artwork.service.InformationService;
import cn.edu.xmu.artwork.service.UserService;
import cn.edu.xmu.commom.utils.Utils;

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
}