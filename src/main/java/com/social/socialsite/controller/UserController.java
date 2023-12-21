package com.social.socialsite.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.social.socialsite.models.User;
import com.social.socialsite.repository.UserRepository;

@RestController

public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		User newUser= new User();;
		newUser.setEmail(user.getEmail());
		newUser.setFirstName(user.getFirstName());
		newUser.setLastName(user.getLastName());
		newUser.setPassword(user.getPassword());
		newUser.setId(user.getId());
		
		User savedUser= userRepository.save(newUser);
		
		return savedUser;
	}
	
	@GetMapping("/users/{userId}")
	public List<User> getUserById(@PathVariable("userId")Integer id) {
		
		List<User> users=new ArrayList<>();
		
		User user1=new User(1,"gulcan","deneme","deneme@gmail.com","1234");
		user1.setId(id);
		
		return users;
	}
	
	@PutMapping("/users")
	public User updateUser(@RequestBody User user) {
		User user1=new User(1,"gulcan","deneme","deneme@gmail.com","1234");
		
		if(user.getFirstName()!=null)
			user1.setFirstName(user.getFirstName());
		if(user.getLastName()!=null)
			user1.setLastName(user.getLastName());
		if(user.getEmail()!=null)
			user1.setEmail(user.getEmail());
	
		return null;
	}
	
	
	@DeleteMapping("users/{userId}")
	public String deleteUser(@PathVariable ("userId")Integer userId) {
		
		return "user deleted succesfully with id"+ userId;
	}

}
