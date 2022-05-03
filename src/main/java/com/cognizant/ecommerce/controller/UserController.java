package com.cognizant.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.ecommerce.model.LoginCred;
import com.cognizant.ecommerce.model.User;
import com.cognizant.ecommerce.repos.UserRepository;

@RestController
@RequestMapping("/api/users")
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	private UserRepository repo;
	
	@PostMapping("/register")
	public void register(@RequestBody User user) {
		repo.save(user);
	}
	
	@PostMapping("/login")
	public User login(@RequestBody LoginCred cred) {
		User user = repo.findByEmailAndPassword(cred.getEmail(),cred.getPassword());
		return user;
	}
	

}
