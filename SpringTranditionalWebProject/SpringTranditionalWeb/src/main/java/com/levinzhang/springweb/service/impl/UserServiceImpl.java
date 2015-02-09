package com.levinzhang.springweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.levinzhang.springweb.model.User;
import com.levinzhang.springweb.repository.UserRepository;
import com.levinzhang.springweb.service.UserService;

@Service
@Transactional(readOnly=true)
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUser() {
		return userRepository.getAllUser();
	}

	@Transactional
	public void addUser(User user) {
		userRepository.addUser(user);
	}

	@Transactional
	public void updateUser(User user) {
		userRepository.updateUser(user);
	}
}
