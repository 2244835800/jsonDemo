package tools;

import net.sf.json.JSONObject;

public class jsonTools {

	public static String createJsonString(String key,Object value){
		JSONObject jsonObject=new JSONObject();
		jsonObject.put(key, value);
		return jsonObject.toString();
	}
	
}
