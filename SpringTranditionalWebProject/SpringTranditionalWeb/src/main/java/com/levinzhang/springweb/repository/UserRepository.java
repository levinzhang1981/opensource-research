package com.levinzhang.springweb.repository;

import java.util.List;

import com.levinzhang.springweb.common.support.mybatis.Mapper;
import com.levinzhang.springweb.model.User;

@Mapper
public interface UserRepository {
	List<User> getAllUser();

	void addUser(User user);
	
	void updateUser(User user);
}
