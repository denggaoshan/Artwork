package utils;


import java.io.UnsupportedEncodingException;
import java.security.*;
import java.util.UUID;

import com.opensymphony.xwork2.ActionContext;

import entity.User;

public class Utils {
	public static String MD5(String md5) {
		   try {
		        java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
		        byte[] array = md.digest(md5.getBytes());
		        StringBuffer sb = new StringBuffer();
		        for (int i = 0; i < array.length; ++i) 
		        {
		          sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
		        }
		        return sb.toString();
		    }
		   catch (java.security.NoSuchAlgorithmException e) 
		   {
		   
		   }
		   return null;
	}

	
	public static String createGUID() {
		   UUID uuid = UUID.randomUUID();
		   String ret = uuid.toString();
				   return ret;
		}
	
	
	public static User getCurrentUser(){
		ActionContext ctx = ActionContext.getContext();
		return (User) ctx.getSession().get("user");
	}
	
	public static void setCurrentUser(User user){
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("user", user);
	}
	
}
