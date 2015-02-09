package com.levinzhang.springweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.levinzhang.springweb.model.User;
import com.levinzhang.springweb.service.UserService;

@Controller
public class MyFirstController {
	
	@Autowired
	private UserService userService;
	
	
	@ResponseBody
	@RequestMapping(value = {"/showUser",""}, method = RequestMethod.GET)
	public List<User> showUser(){
		User user = new User();
		user.setId("sss");
		user.setName("zhangwb");
		user.setEmail("levinzhang1981@126.com");
		userService.addUser(user);
		return userService.getAllUser();
	}
	
	
	@RequestMapping(value = {"/index",""}, method = RequestMethod.GET)
	public String index(){
//		User user = new User();
//		user.setId("sss");
//		List<User> result = Lists.newArrayList();
//		result.add(user);
//		return result;
		
		return "index";
	}
}
