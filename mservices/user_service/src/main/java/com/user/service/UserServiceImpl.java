package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	List<User> list = List.of(
				new User(1001L, "Ram", "9405112277"),
				new User(1002L, "Rohit", "9970643962"),
				new User(1003L, "Rushi", "123456789"),
				new User(1004L, "Omkar", "675849302")
			);
	
	@Override
	public User getUser(Long id) {
		return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}
	
	
}
