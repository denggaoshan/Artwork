package cn.edu.xmu.commom.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import java.sql.*;

import cn.edu.xmu.artwork.entity.*;

import com.opensymphony.xwork2.ActionContext;

public class Utils 
{
	public static String MD5(String md5) {
		try {
			java.security.MessageDigest md = java.security.MessageDigest
					.getInstance("MD5");
			byte[] array = md.digest(md5.getBytes());
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < array.length; ++i) {
				sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100)
						.substring(1, 3));
			}
			return sb.toString();
		} catch (java.security.NoSuchAlgorithmException e) {

		}
		return null;
	}
	
	public static void setUserType(String type){
		ActionContext context=ActionContext.getContext();
		//往session里放
		context.getSession().put("userType",type);
	}
	
	public static void setSession(String name,String value){
		ActionContext context=ActionContext.getContext();
		//往session里放
		context.getSession().put(name,value);
	}

	public static String createGUID() {
		UUID uuid = UUID.randomUUID();
		String ret = uuid.toString();
		return ret;
	}

	public static User getCurrentUser() {
		ActionContext ctx = ActionContext.getContext();
		return (User) ctx.getSession().get("user");
	}

	public static void setCurrentUser(User user) {
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("user", user);
	}

	public static Date getCurrentTime() {
		Calendar calendar = Calendar.getInstance();
		java.util.Date now = calendar.getTime();
		java.sql.Date sqlDate=new java.sql.Date(now.getTime());
		return sqlDate;
	}

	private static final String[] HEADERS_TO_TRY = { "X-Forwarded-For",
			"Proxy-Client-IP", "WL-Proxy-Client-IP", "HTTP_X_FORWARDED_FOR",
			"HTTP_X_FORWARDED", "HTTP_X_CLUSTER_CLIENT_IP", "HTTP_CLIENT_IP",
			"HTTP_FORWARDED_FOR", "HTTP_FORWARDED", "HTTP_VIA", "REMOTE_ADDR" };

	public static String getClientIpAddress(HttpServletRequest request) 
	{
	    for (String header : HEADERS_TO_TRY) 
	    {
	        String ip = request.getHeader(header);
	        if (ip != null && ip.length() != 0 && !"unknown".equalsIgnoreCase(ip)) 
	            return ip;
	    }
	    return request.getRemoteAddr();
	}
	
	public static HttpServletRequest getRequest(){
		HttpServletRequest request = ServletActionContext.getRequest();
		return request;
	}

	public static int dateDiff(Date from, Date to){
		int days = 0;
		days = (int) Math.abs((to.getTime() - from.getTime()) / (24 * 60 * 60 * 1000)) + 1;
		return days;
	}

	//加一天
	public static Date dateIncrease(Date day,int value){
		Calendar cal = Calendar.getInstance();
		cal.setTime(day);
		cal.add(Calendar.DATE, value);
		Date ret = new Date(cal.getTime().getTime());
		return ret;
	}
	
}

