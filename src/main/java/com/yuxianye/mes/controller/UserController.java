package com.yuxianye.mes.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yuxianye.mes.entity.*;
import com.yuxianye.mes.service.*;

//@RestController
@Controller
//@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

//	@RequestMapping(value = "/user", method = RequestMethod.GET)
	@RequestMapping(value = "/user")
	public String User() {

		return "user";

	}

	public String user(Integer id) {

		Optional<User> user = userService.findById(id);

		return "Hello World!" + user.get().getName();
		// return "Hello World!" ;

	}

}