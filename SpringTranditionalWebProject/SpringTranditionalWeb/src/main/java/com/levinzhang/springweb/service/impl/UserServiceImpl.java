package com.levinzhang.springweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.levinzhang.springweb.model.User;
import com.levinzhang.springweb.repository.UserRepository;
import com.levinzhang.springweb.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUser() {
		return userRepository.getAllUser();
	}

}
