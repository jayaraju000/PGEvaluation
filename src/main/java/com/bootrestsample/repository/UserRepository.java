package com.bootrestsample.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.bootrestsample.model.User;

@Transactional
@Repository
public class UserRepository {
	
	@PersistenceContext	
	private EntityManager entityManager;	
	
	
	public void addUser(ArrayList<User> userlist) {
		
		for(User user:userlist){
			entityManager.persist(user);
		}
	}
}
