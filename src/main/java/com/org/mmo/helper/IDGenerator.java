package com.org.mmo.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.mmo.entities.UserEntity;
import com.org.mmo.repositories.UserRepository;

@Component
public class IDGenerator {

	@Autowired
	private UserRepository userRepo;
	
	private int maxId;
	
	public int generateUserId() {
		maxId = userRepo.findMaxIdOrZero();		
		return maxId+1;
	}
	
}
