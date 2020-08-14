package com.yuxianye.mes.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yuxianye.mes.entity.*;
import com.yuxianye.mes.service.*;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String user(Integer id) {

		Optional<User> user = userService.findById(id);

		return "Hello World!" + user.get().getName();
		//return "Hello World!" ;
		
	}
	
	
	
}