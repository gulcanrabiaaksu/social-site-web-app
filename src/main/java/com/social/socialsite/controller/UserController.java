package com.social.socialsite.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.social.socialsite.models.User;

@RestController
public class UserController {
	
	@GetMapping("/users")
	public List<User> getUser() {
		
		List<User> users=new ArrayList<>();
		
		User user1=new User("gulcan","deneme","deneme@gmail.com","1234");
		
		users.add(user1);
		
		return users;
	}

}
