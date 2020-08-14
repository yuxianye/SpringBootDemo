package com.yuxianye.mes.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.yuxianye.mes.entity.*;

@Repository
@Transactional(readOnly = true)
public interface UserDao extends JpaRepository<User, Integer>, CrudRepository<User, Integer>, JpaSpecificationExecutor<User>  {
	
	
	public Optional<User> findById(Integer id);
		
	public List<User> findByName(String name);
}
