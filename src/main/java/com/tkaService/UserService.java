package com.tkaService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tkaDTO.UserLoginDTO;
import com.tkaEntity.User;
import com.tkaRepository.UserRepository;

public class UserService {
	 @Autowired
	private UserRepository  userRepostory;

	public String resistorUser(UserLoginDTO userLoginDTO) {
		if (userRepostory.existsByUsername(userLoginDTO.getuserName)) {
			
		}
		return null;
	}
}