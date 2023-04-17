package controller;

import dao.UserDao;
import dto.User;

public class SaveUser {
	//ABC,888,s@gmail.com.s123
	public static void main(String[] args) {
		User u=new User();
		u.setName("ABC");
		u.setPhone(888);
		u.setEmail("s@gmail.com");
		u.setPassword("s123");
		UserDao dao=new UserDao();
		u=dao.saveUser(u);
		System.err.println("User saved with ID:"+u.getId());
		
	}

}
