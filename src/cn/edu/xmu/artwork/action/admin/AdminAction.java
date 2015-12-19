package cn.edu.xmu.artwork.action.admin;

import java.util.List;

import cn.edu.xmu.artwork.entity.*;
import cn.edu.xmu.artwork.service.AuditService;
import cn.edu.xmu.artwork.service.InformationService;
import cn.edu.xmu.artwork.service.UserService;
import cn.edu.xmu.commom.utils.ActionHelper;
import cn.edu.xmu.commom.utils.ActionHelper.TableType;
import cn.edu.xmu.commom.utils.Utils;

import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport {
	private static final long serialVersionUID = -6264577092699681304L;

	private String showHead;
	private String showTableHead;
	private String dataString;
	private List showList;
	private List<String> showHeadList;

	private InformationService informationService;
	private UserService UserService;
	private AuditService auditService;

	// 加载首页的内容
	public String execute() {
		User user = Utils.getCurrentUser();

		if (user instanceof Editor) {
			Utils.setUserType("Editor");

			showList = this.getInformationService().getAdvertorialByEditor(
					(Editor) user);
			showHead = "我的发布";
			showTableHead = "我的软文";
			showHeadList = ActionHelper
					.GetTableHead(TableType.EditorAdvertorial);
			dataString = ActionHelper.GenerateDataString(showList,
					TableType.EditorAdvertorial);
			return "success";
		} else if (user instanceof ChiefEditor) {
			Utils.setUserType("ChiefEditor");

			String chooseType = Utils.getRequest().getParameter("chooseType");
			if (chooseType == null || chooseType.equals("check")) {
				showList = this.getAuditService().getAuditAdvertorials();
				showHead = "待审核";
				showTableHead = "软文";
				showHeadList = ActionHelper
						.GetTableHead(TableType.ChiefEditorAdvertorial);
				dataString = ActionHelper.GenerateDataString(showList,
						TableType.ChiefEditorAdvertorial);
			} else if (chooseType.equals("checked")) {
				showList = this.getInformationService()
						.getAdvertorialByChiefEditor((ChiefEditor) user);
				showHead = "已审核";
				showTableHead = "软文";
				showHeadList = ActionHelper
						.GetTableHead(TableType.EditorAdvertorial);
				dataString = ActionHelper.GenerateDataString(showList,
						TableType.EditorAdvertorial);
			}

			return "success";
		} else if (user instanceof Manager) {
			Utils.setUserType("Manager");
			showHead = "管理";

			String chooseType = Utils.getRequest().getParameter("chooseType");
			if (chooseType == null || chooseType.equals("user")) {
				showList = getUserService().getAllUsers();

				showTableHead = "所有用户";
				showHeadList = ActionHelper.GetTableHead(TableType.User);
				dataString = ActionHelper.GenerateDataString(showList,
						TableType.User);
			} else if (chooseType.equals("artist")) {
				showList = getUserService().getAllArtists();

				showTableHead = "所有艺术家";
				showHeadList = ActionHelper.GetTableHead(TableType.User);
				dataString = ActionHelper.GenerateDataString(showList,
						TableType.User);
			} else if (chooseType.equals("editor")) {
				showList = getUserService().getAllEditors();

				showTableHead = "所有采编";
				showHeadList = ActionHelper.GetTableHead(TableType.User);
				dataString = ActionHelper.GenerateDataString(showList,
						TableType.User);
			} else if (chooseType.equals("chiefEditor")) {
				showList = getUserService().getAllChiefEditors();

				showTableHead = "所有主编";
				showHeadList = ActionHelper.GetTableHead(TableType.User);
				dataString = ActionHelper.GenerateDataString(showList,
						TableType.User);
			} else if (chooseType.equals("advertisement")) {
				Utils.setSession("showTableType", "Advertisement");
				showList = getInformationService().getAllAdvertisement();

				showTableHead = "所有广告";
				showHeadList = ActionHelper
						.GetTableHead(TableType.EditorAdvertisement);
				dataString = ActionHelper.GenerateDataString(showList,
						TableType.EditorAdvertisement);
			} else if (chooseType.equals("advertorial")) {
				Utils.setSession("showTableType", "Advertorial");
				showList = getInformationService().getAllAdvertorial();

				showTableHead = "所有软文";
				showHeadList = ActionHelper
						.GetTableHead(TableType.EditorAdvertorial);
				dataString = ActionHelper.GenerateDataString(showList,
						TableType.EditorAdvertorial);
			}

			return "success";
		}
		return "fail";
	}

	public InformationService getInformationService() {
		return informationService;
	}

	public void setInformationService(InformationService informationService) {
		this.informationService = informationService;
	}

	public UserService getUserService() {
		return UserService;
	}

	public void setUserService(UserService userService) {
		UserService = userService;
	}

	public List getShowList() {
		return showList;
	}

	public void setShowList(List showList) {
		this.showList = showList;
	}

	public String getShowHead() {
		return showHead;
	}

	public void setShowHead(String showHead) {
		this.showHead = showHead;
	}

	public List getShowHeadList() {
		return showHeadList;
	}

	public void setShowHeadList(List showHeadList) {
		this.showHeadList = showHeadList;
	}

	public AuditService getAuditService() {
		return auditService;
	}

	public void setAuditService(AuditService auditService) {
		this.auditService = auditService;
	}

	public String getShowTableHead() {
		return showTableHead;
	}

	public void setShowTableHead(String showTableHead) {
		this.showTableHead = showTableHead;
	}

	public String getDataString() {
		return dataString;
	}

	public void setDataString(String dataString) {
		this.dataString = dataString;
	}
}