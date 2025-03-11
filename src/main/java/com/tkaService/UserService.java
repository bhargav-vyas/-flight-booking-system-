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
		if(existingUser.isPresent()) {
			return "Error :User already exist";
		}
		String encryptedPassword =passwordEncoder.encode(password);
	
		User newUser = new User(userName, role, encryptedPassword);
		userRepostory.save(newUser);
		return "User registered successfully!";
	}
	
	}
