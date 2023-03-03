package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {
	List<User> userList = List.of(new User(1L, "Sanjay", "Sharma"),
			new User(2L, "Vijay", "Sharma"));
	
	@Override
	public User getUser(Long id) {
		return userList.stream().filter(user-> user.getUserId().equals(id)).findAny().orElse(null);
	}
}
