package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.entity.Contact;
import com.user.entity.User;
import com.user.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private UserService service;
	@GetMapping("/{userId}")
	public User home(@PathVariable("userId") Long userId) {
		
		User muUser = service.getUser(userId);
		//deserialize
		List<Contact> contacts = this.restTemplate.getForObject("http://contact-service/contact/user/"+userId, List.class);
		muUser.setContacts(contacts);
		return muUser;
	}
}
