package cn.edu.xmu.artwork.action.admin;

import java.util.ArrayList;
import java.util.List;

import cn.edu.xmu.artwork.dao.InformationDao;
import cn.edu.xmu.artwork.entity.*;
import cn.edu.xmu.artwork.service.InformationService;
import cn.edu.xmu.artwork.service.UserService;
import cn.edu.xmu.commom.utils.Utils;

import com.opensymphony.xwork2.ActionSupport;

public class ChiefEditorAction extends ActionSupport
{
	
	private ChiefEditor chiefEditor;
	private InformationService informationService;
	
	List showList;
	
	private String chooseType;
	
	public String getChooseType() {
		return chooseType;
	}

	public void setChooseType(String chooseType) {
		this.chooseType = chooseType;
	}

	public ChiefEditor getChiefEditor() {
		return chiefEditor;
	}

	public void setChiefEditor(ChiefEditor chiefEditor) {
		this.chiefEditor = chiefEditor;
	}
 
	public InformationService getInformationService() {
		return informationService;
	}

	public void setInformationService(InformationService informationService) {
		this.informationService = informationService;
	}

	public List getShowList() {
		return showList;
	}

	public void setShowList(List showList) {
		this.showList = showList;
	}

	private void loadChecked(){
		showList = this.getInformationService().getAdvertorialByChiefEditor(chiefEditor);
	}

	//加载首页的内容
     public String execute()
     {
    	chiefEditor = (ChiefEditor) Utils.getCurrentUser();
    	if(chooseType.equals("checked")){
    		//审核过的
    		Utils.setSession("showTableType","Advertorial");
    		loadChecked();
    	}else if(chooseType.equals("check")){
    		//等待审核的
    		
    	}
    	return "success";
		 
    }
}