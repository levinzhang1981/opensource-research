package com.levinzhang.springweb.service;

import java.util.List;

import com.levinzhang.springweb.model.User;

public interface UserService {
List<User> getAllUser();
void addUser(User user);
void updateUser(User user);
}
