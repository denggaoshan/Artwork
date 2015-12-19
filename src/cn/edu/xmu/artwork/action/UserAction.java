package cn.edu.xmu.artwork.action;

import java.util.HashMap;
import java.util.Map;

import cn.edu.xmu.artwork.entity.*;

import cn.edu.xmu.artwork.service.UserService;
import cn.edu.xmu.commom.utils.ActionHelper;
import cn.edu.xmu.commom.utils.Utils;

import com.googlecode.jsonplugin.annotations.JSON;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private static final long serialVersionUID = 6764551730460447147L;

	private Map<String, Object> Result;
	private User currentUser;
	private UserService userService;

	public String Login() {
		Result = new HashMap<String, Object>();

		String username = Utils.getRequest().getParameter("username");
		String password = Utils.getRequest().getParameter("password");

		// 参数检查
		if (!ActionHelper.CheckNotNull(username))
			return ActionHelper.FailMessage(Result, "用户名未填写！");
		if (!ActionHelper.CheckNotNull(password))
			return ActionHelper.FailMessage(Result, "密码未填写！");

		getUserService().login(username, password);

		currentUser = Utils.getCurrentUser();

		if (currentUser != null) {
			return ActionHelper.SuccessMessage(Result);
		} else {
			return ActionHelper.FailMessage(Result, "用户名或密码错误！");
		}
	}

	public String AccountCheck() {
		Result = new HashMap<String, Object>();

		String username = Utils.getRequest().getParameter("username");

		// 参数检查
		if (!ActionHelper.CheckNotNull(username))
			return ActionHelper.FailMessage(Result, "用户名未填写！");

		if (getUserService().userExists(username))
			return ActionHelper.FailMessage(Result, "用户名已存在！");
		else
			return ActionHelper.SuccessMessage(Result);
	}

	public String Register() {
		Result = new HashMap<String, Object>();

		String username = Utils.getRequest().getParameter("username");
		String password = Utils.getRequest().getParameter("password");
		String nickname = Utils.getRequest().getParameter("nickname");

		// 参数检查
		if (!ActionHelper.CheckNotNull(username))
			return ActionHelper.FailMessage(Result, "用户名未填写！");
		if (!ActionHelper.CheckNotNull(password))
			return ActionHelper.FailMessage(Result, "密码未填写！");
		if (!ActionHelper.CheckNotNull(nickname))
			return ActionHelper.FailMessage(Result, "昵称未填写！");

		getUserService().register(username, password, nickname);

		User user = Utils.getCurrentUser();
		if (user != null)
			return ActionHelper.SuccessMessage(Result);
		else
			return ActionHelper.FailMessage(Result, "系统错误！");
	}

	public Map<String, Object> getResult() {
		return Result;
	}

	@JSON(serialize = false)
	public User getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@JSON(serialize = false)
	public UserService getUserService() {
		return userService;
	}

}