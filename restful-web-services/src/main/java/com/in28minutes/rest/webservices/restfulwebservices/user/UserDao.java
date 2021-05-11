package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
	private static List<User> users = new ArrayList<>();
	
	private static int usersCount=users.size();
	
	static {
		users.add(new User(1,"Vikash", new Date()));
		users.add(new User(2,"Harshita", new Date()));
		users.add(new User(3,"Singh", new Date()));
		users.add(new User(4,"Omer", new Date()));
	}
	
	//findAll
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user) {
		if(user.getId()==null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}
	//findOne
	public User findOne(int id) {
		for(User user:users) {
			if(user.getId() ==id) {
				return user;
			}
		}
		return null;
	}
	
	public User deleteById(int id) {
		Iterator<User> iterator = users.iterator();
		while(iterator.hasNext()) {
			User user = iterator.next();
			if(user.getId() ==id) {
				iterator.remove();
				return user;
			}
			
		}
		return null;
	}
}
