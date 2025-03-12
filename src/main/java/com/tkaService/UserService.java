package com.tkaService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tkaEntity.User;
import com.tkaRepository.UserRepository;

public class UserService {
	 @Autowired
	private UserRepository  userRepostory;
	 
//	 @Autowired
//	 private PasswordEncoder  passwordEncoder;

	public String registerUser(String userName, String password, String role) {
	Optional<User> existingUser = userRepostory.findByName(userName);
	System.out.println("1");
		if(existingUser.isPresent()) {
			System.out.println("2");
			
		}
		return "Error :User already exist";
	}
	
	}
