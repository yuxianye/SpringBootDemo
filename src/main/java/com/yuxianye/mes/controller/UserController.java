package com.yuxianye.mes.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String user() {

		return "Hello World!";
	}

}
