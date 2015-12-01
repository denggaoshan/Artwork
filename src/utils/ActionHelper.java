package utils;

import java.util.ArrayList;
import java.util.Map;

public class ActionHelper {
	public static boolean CheckNotNull(ArrayList<Object> thing){
		for(int i=0;i<thing.size();i++)
			if(thing.get(i)==null)
				return false;
		return true;
	}
	
	public static boolean CheckNotNull(Object thing){
		if(thing==null)
			return false;
		return true;
	}
	
	public static String FailMessage(Map<String,Object> result,String message){
		result.put("state", "fail"); 
		result.put("message", message); 
		return "success";
	}
	
	public static String SuccessMessage(Map<String,Object> result){
		result.put("state", "success"); 
		return "success";
	}
}
