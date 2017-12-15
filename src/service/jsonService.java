package service;

import java.util.ArrayList;
import java.util.List;

import model.User;

public class jsonService {

	public jsonService() {
		// TODO Auto-generated constructor stub
	}
	public User gerUser(){
		User user=new User("hepo", "123456");
		return user;
	}
	public List<User> gerUsers(){
		List<User> users=new ArrayList<User>();
		User user1=new User("hepo", "123456");
		User user2=new User("shuaipo", "111111");
		users.add(user1);
		users.add(user2);
		return users;
	}
}
