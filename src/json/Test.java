package json;

import net.sf.json.JSONObject;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {  
        String jsonString ="{\"name\":\"https://github.com/2244835800\",\"password\":\"hoper\",\"email\":\"我没有\"}";  
        JSONObject json = JSONObject.fromObject(jsonString);  
        String name=json.getString("name");  
        String pwd=json.getString("password");  
        String em=json.getString("email"); 
        System.out.println(name+" "+pwd+" "+em);
   } 
}
