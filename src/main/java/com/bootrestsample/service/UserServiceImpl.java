package com.bootrestsample.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.bootrestsample.model.User;
import com.bootrestsample.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	
	@PersistenceContext	
	private EntityManager entityManager;	
	
	private static final AtomicLong counter = new AtomicLong();
	
	private static List<User> users;
	
	static{
		users= populateDummyUsers();
	}

	public List<User> findAllUsers() {
		return users;
	}
	
	public User findById(long id) {
		for(User user : users){
			if(user.getId() == id){
				return user;
			}
		}
		return null;
	}
	
	public User findByName(String name) {
		for(User user : users){
			if(user.getUserName().equalsIgnoreCase(name)){
				return user;
			}
		}
		return null;
	}
	
	public void saveUser(User user) {
		user.setId(counter.incrementAndGet());
		users.add(user);
	}

	public void updateUser(User user) {
		int index = users.indexOf(user);
		users.set(index, user);
	}

	public void deleteUserById(long id) {
		
		for (Iterator<User> iterator = users.iterator(); iterator.hasNext(); ) {
		    User user = iterator.next();
		    if (user.getId() == id) {
		        iterator.remove();
		    }
		}
	}

	public boolean isUserExist(User user) {
		return findByName(user.getUserName())!=null;
	}
	
	public void deleteAllUsers(){
		users.clear();
	}

	private static List<User> populateDummyUsers(){
		ArrayList<User> users = new ArrayList<User>();
		users.add(new User(counter.incrementAndGet(),"Meenu","pass1",2500));
		users.add(new User(counter.incrementAndGet(),"Deivanai","pass2",20000));
		users.add(new User(counter.incrementAndGet(),"Thiyagu","pass3",19000));
		users.add(new User(counter.incrementAndGet(),"Silvia","pass4",3000));
	    new UserRepository().addUser(users);
		return users;
	}

}
