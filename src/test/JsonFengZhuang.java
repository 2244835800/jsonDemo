package test;

import java.util.List;

import model.User;
import service.jsonService;
import tools.jsonTools;

public class JsonFengZhuang {

	public JsonFengZhuang() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		String msg1="";
		String msg2="";
		jsonService service=new jsonService();
		User user=service.gerUser();
		msg1=jsonTools.createJsonString("hepo'json", user);
		System.out.println("这是一条json："+msg1);
		
		List<User> users=service.gerUsers();
		msg2=jsonTools.createJsonString("hepo'json", users);
		System.out.println("这是二条json："+msg2);
	}
}
