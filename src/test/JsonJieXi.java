package test;

import net.sf.json.JSONObject;

public class JsonJieXi {

	public JsonJieXi() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {  
        String jsonString ="{\"from\": \"freeproxylist\", \"anonymity\": \"anonymous\", \"response_time\": 1.84, \"host\": \"104.236.60.177\", \"port\": 8080, \"export_address\": [\"unknown\", \"104.236.60.177\"], \"country\": \"US\", \"type\": \"http\"}";  
        JSONObject json = JSONObject.fromObject(jsonString);  
        String host=json.getString("host");  
        String port=json.getString("port");  
        System.out.println(host+": "+port);
   } 
}
