package cn.edu.xmu.commom.utils;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cn.edu.xmu.artwork.entity.*;

public class ActionHelper {
	public enum TableType {
		EditorAdvertorial, ChiefEditorAdvertorial, User, EditorAdvertisement
	}

	public static Date LoadDateParameters(String name) {
		String temp = Utils.getRequest().getParameter(name);
		if (!ActionHelper.CheckNotNull(temp))
			return null;
		return Date.valueOf(temp);
	}

	public static Short LoadShortParameters(String name) {
		String temp = Utils.getRequest().getParameter(name);
		if (!ActionHelper.CheckNotNull(temp))
			return null;
		return Short.valueOf(temp);
	}

	public static List<String> GetTableHead(TableType type) {
		List<String> result = new ArrayList<String>();
		switch (type) {
		case EditorAdvertorial:
			result.add("作者");
			result.add("标题");
			result.add("摘要");
			result.add("正文");
			result.add("位置");
			result.add("开始时间");
			result.add("结束时间");
			result.add("审核状态");
			return result;
		case ChiefEditorAdvertorial:
			result.add("作者");
			result.add("标题");
			result.add("摘要");
			result.add("正文");
			result.add("位置");
			result.add("开始时间");
			result.add("结束时间");
			result.add("审核状态");
			result.add("审核");
			return result;
		case User:
			result.add("手机");
			result.add("昵称");
			result.add("年龄");
			result.add("邮箱");
			result.add("身份证");
			result.add("余额");
			return result;
		case EditorAdvertisement:
			result.add("作者");
			result.add("位置");
			result.add("开始时间");
			result.add("结束时间");
			result.add("审核状态");
			return result;
		default:
			return result;
		}
	}

	public static String GenerateDataString(List<Object> datas, TableType type) {
		String result = "";
		switch (type) {
		case EditorAdvertorial:
			for (int i = 0; i < datas.size(); i++) {
				Advertorial tmp = (Advertorial) datas.get(i);
				String data1 = GetShow(tmp.getEditor().getNickName());
				String data2 = GetShow(tmp.getTitle());
				String data3 = GetShow(tmp.getTopic());
				String data4 = GetShow(tmp.getContent());
				String data5 = GetShow(tmp.getPosition());
				String data6 = GetShow(tmp.getBeginTime());
				String data7 = GetShow(tmp.getEndTime());
				String data8 = tmp.getVerifyStatus() == 0 ? "未审核" : (tmp
						.getVerifyStatus() == 1 ? "已通过" : "已拒绝");
				result += "<tr><td>" + data1 + "</td><td>" + data2
						+ "</td><td>" + data3 + "</td><td>" + data4
						+ "</td><td>" + data5 + "</td><td>" + data6
						+ "</td><td>" + data7 + "</td><td>" + data8
						+ "</td></tr>";
			}
			return result;
		case ChiefEditorAdvertorial:
			for (int i = 0; i < datas.size(); i++) {
				Advertorial tmp = (Advertorial) datas.get(i);
				String data1 = GetShow(tmp.getEditor().getNickName());
				String data2 = GetShow(tmp.getTitle());
				String data3 = GetShow(tmp.getTopic());
				String data4 = GetShow(tmp.getContent());
				String data5 = GetShow(tmp.getPosition());
				String data6 = GetShow(tmp.getBeginTime());
				String data7 = GetShow(tmp.getEndTime());
				String data8 = tmp.getVerifyStatus() == 0 ? "未审核" : (tmp
						.getVerifyStatus() == 1 ? "已通过" : "已拒绝");
				String data9 = tmp.getVerifyStatus() == 0 ? "<button style='width:50%' data-id="
						+ tmp.getId()
						+ " type='button' class='btn btn-success passCheck'>通过</button>"
						+ "<button style='width:50%' data-id="
						+ tmp.getId()
						+ " type='button' class='btn btn-danger rejectCheck'>拒绝</button>"
						: "<button type='button' class='btn btn-secondary'>审核</button>";
				result += "<tr><td>" + data1 + "</td><td>" + data2
						+ "</td><td>" + data3 + "</td><td>" + data4
						+ "</td><td>" + data5 + "</td><td>" + data6
						+ "</td><td>" + data7 + "</td><td>" + data8
						+ "</td><td>" + data9 + "</td></tr>";
			}
			return result;
		case User:
			for (int i = 0; i < datas.size(); i++) {
				User tmp = (User) datas.get(i);
				String data1 = GetShow(tmp.getPhone());
				String data2 = GetShow(tmp.getNickName());
				String data3 = GetShow(tmp.getAge());
				String data4 = GetShow(tmp.getMailbox());
				String data5 = GetShow(tmp.getIdentityNumber());
				String data6 = GetShow(tmp.getBalance());
				result += "<tr><td>" + data1 + "</td><td>" + data2
						+ "</td><td>" + data3 + "</td><td>" + data4
						+ "</td><td>" + data5 + "</td><td>" + data6
						+ "</td></tr>";
			}
			return result;
		case EditorAdvertisement:
			for (int i = 0; i < datas.size(); i++) {
				Advertisement tmp = (Advertisement) datas.get(i);
				String data1 = GetShow(tmp.getArtist().getNickName());
				String data2 = GetShow(tmp.getPosition());
				String data3 = GetShow(tmp.getBeginTime());
				String data4 = GetShow(tmp.getEndTime());
				String data5 = tmp.getVerifyStatus() == 0 ? "未审核" : (tmp
						.getVerifyStatus() == 1 ? "已通过" : "已拒绝");
				result += "<tr><td>" + data1 + "</td><td>" + data2
						+ "</td><td>" + data3 + "</td><td>" + data4
						+ "</td><td>" + data5 + "</td></tr>";
			}
			return result;
		default:
			return result;
		}
	}

	private static String GetShow(Object x) {
		if (x == null)
			return "--";
		else
			return x.toString();
	}

	public static boolean CheckNotNull(ArrayList<Object> thing) {
		for (int i = 0; i < thing.size(); i++)
			if (thing.get(i) == null)
				return false;
		return true;
	}

	public static boolean CheckNotNull(Object thing) {
		if (thing == null)
			return false;
		return true;
	}

	public static String FailMessage(Map<String, Object> result, String message) {
		result.put("state", "fail");
		result.put("message", message);
		return "success";
	}

	public static String SuccessMessage(Map<String, Object> result) {
		result.put("state", "success");
		return "success";
	}
}
