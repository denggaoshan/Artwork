package cn.edu.xmu.artwork.action.admin;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import cn.edu.xmu.artwork.entity.*;
import cn.edu.xmu.artwork.service.InformationService;
import cn.edu.xmu.commom.utils.ActionHelper;
import cn.edu.xmu.commom.utils.Utils;

import com.googlecode.jsonplugin.annotations.JSON;
import com.opensymphony.xwork2.ActionSupport;

public class EditorAction extends ActionSupport {
	private static final long serialVersionUID = 7057116320047807974L;

	private Map<String, Object> Result;
	private Editor editor;
	private InformationService informationService;

	public String AddAdvertorial() {
		Result = new HashMap<String, Object>();

		Date begin = ActionHelper.LoadDateParameters("begin");
		Date end = ActionHelper.LoadDateParameters("end");
		Short position = ActionHelper.LoadShortParameters("position");

		if (!ActionHelper.CheckNotNull(begin))
			return ActionHelper.FailMessage(Result, "开始日期错误！");
		if (!ActionHelper.CheckNotNull(end))
			return ActionHelper.FailMessage(Result, "开始日期错误！");
		if (!ActionHelper.CheckNotNull(position))
			return ActionHelper.FailMessage(Result, "位置错误！");

		String homeImg = Utils.getRequest().getParameter("homeImg");
		String title = Utils.getRequest().getParameter("title");
		String topic = Utils.getRequest().getParameter("topic");
		String content = Utils.getRequest().getParameter("content");

		User currentUser = Utils.getCurrentUser();
		if (!(currentUser instanceof Editor))
			return ActionHelper.FailMessage(Result, "没有权限！");
		if (!ActionHelper.CheckNotNull(homeImg))
			return ActionHelper.FailMessage(Result, "首页图片未填写！");
		if (!ActionHelper.CheckNotNull(title))
			return ActionHelper.FailMessage(Result, "标题未填写！");
		if (!ActionHelper.CheckNotNull(topic))
			return ActionHelper.FailMessage(Result, "简要未填写！");
		if (!ActionHelper.CheckNotNull(content))
			return ActionHelper.FailMessage(Result, "内容未填写！");

		boolean result = getInformationService().addAdvertorial(
				(Editor) currentUser, homeImg, begin, end, position, title,
				topic, content);

		if (result == false)
			return ActionHelper.FailMessage(Result, "系统错误！");
		else
			return ActionHelper.SuccessMessage(Result);
	}

	@JSON(serialize = false)
	public InformationService getInformationService() {
		return informationService;
	}

	public void setInformationService(InformationService informationService) {
		this.informationService = informationService;
	}

	@JSON(serialize = false)
	public Editor getEditor() {
		return editor;
	}

	public void setEditor(Editor editor) {
		this.editor = editor;
	}

	public Map<String, Object> getResult() {
		return Result;
	}
}