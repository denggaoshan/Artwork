package cn.edu.xmu.artwork.action.admin;

import java.util.HashMap;
import java.util.Map;

import cn.edu.xmu.artwork.entity.*;
import cn.edu.xmu.artwork.service.AuditService;
import cn.edu.xmu.commom.utils.ActionHelper;
import cn.edu.xmu.commom.utils.Utils;

import com.googlecode.jsonplugin.annotations.JSON;
import com.opensymphony.xwork2.ActionSupport;

public class ChiefEditorAction extends ActionSupport {
	private static final long serialVersionUID = -6538049599778272437L;
	
	private Map<String, Object> Result;
	private AuditService auditService;

	public String PassAdvertorial() {
		Result = new HashMap<String, Object>();

		String id = Utils.getRequest().getParameter("id");
		
		User chiefEditor = Utils.getCurrentUser();
		if(!(chiefEditor instanceof ChiefEditor))
			return ActionHelper.FailMessage(Result, "没有权限！");
		
		boolean result=getAuditService().passAudit((ChiefEditor)chiefEditor, id);
   	    
		if(result==false)
			return ActionHelper.FailMessage(Result,"系统错误");
		else
			return ActionHelper.SuccessMessage(Result);
	}
	
	public String RejectAdvertorial() {
		Result = new HashMap<String, Object>();

		String id = Utils.getRequest().getParameter("id");
		
		User chiefEditor = Utils.getCurrentUser();
		if(!(chiefEditor instanceof ChiefEditor))
			return ActionHelper.FailMessage(Result, "没有权限！");
		
		boolean result=getAuditService().rejectAudit((ChiefEditor)chiefEditor, id);
   	    
		if(result==false)
			return ActionHelper.FailMessage(Result,"系统错误");
		else
			return ActionHelper.SuccessMessage(Result);
	}

	@JSON(serialize = false)
	public AuditService getAuditService() {
		return auditService;
	}

	public void setAuditService(AuditService auditService) {
		this.auditService = auditService;
	}
	
	public Map<String, Object> getResult() {
		return Result;
	}
}