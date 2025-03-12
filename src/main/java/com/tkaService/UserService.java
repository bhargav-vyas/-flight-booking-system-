package com.tkaService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.tkaEntity.User;
import com.tkaRepository.UserRepository;

public class UserService {
	 @Autowired
	private UserRepository  userRepostory;
	 
	 @Autowired
	 private PasswordEncoder  passwordEncoder;

	public String registerUser(String userName, String password, String role) {
	Optional<User> existingUser = userRepostory.findByName(userName);
	System.out.println("1");
		if(existingUser.isPresent()) {
			System.out.println("2");
			return "Error :User already exist";
			
		}
		String encryptedPassword =passwordEncoder.encode(password);
		System.out.println("3");
		User newUser = new User(userName, role, encryptedPassword);
		System.out.println("4");
		userRepostory.save(newUser);
		System.out.println("5");
		return "User registered successfully!";
	}
	
	}
