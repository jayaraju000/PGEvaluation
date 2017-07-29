package com.bootrestsample.service;


import java.util.List;

import com.bootrestsample.model.User;

public interface UserService {
	
	com.bootrestsample.model.User findById(long id);
	
	User findByName(String name);
	
	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUserById(long id);

	List<User> findAllUsers();
	
	void deleteAllUsers();
	
	boolean isUserExist(User user);
	
}
