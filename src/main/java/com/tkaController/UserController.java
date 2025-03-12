package com.tkaController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tkaDTO.UserLoginDTO;
import com.tkaEntity.User;
import com.tkaService.UserService;
@RestController
@RequestMapping("/User")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/register")
	public ResponseEntity<String> registerUser(@RequestBody UserLoginDTO userLoginDTO ) {
	
		String response =userService.resistorUser(userLoginDTO);
		return  ResponseEntity.ok("User register successfully !");
	}

}
