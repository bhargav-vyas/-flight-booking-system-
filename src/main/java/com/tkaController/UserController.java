package com.tkaController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tkaService.UserService;
@RestController
@RequestMapping("/User")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	

}
