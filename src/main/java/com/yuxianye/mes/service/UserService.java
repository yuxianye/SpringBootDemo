package com.yuxianye.mes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuxianye.mes.dao.*;
import com.yuxianye.mes.entity.*;

@Service
public class UserService {

	@Autowired
	UserDao userDao;
	
	
	public Optional<User> findById(Integer id)
	{
		
		return	userDao.findById(id);
		
	}
	
	public List<User> findByName(String name)
	{
		
		return	userDao.findByName(name);
		
	}
	
	
	
}
