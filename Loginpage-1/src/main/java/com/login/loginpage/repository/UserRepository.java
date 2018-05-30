package com.login.loginpage.repository;

import org.springframework.data.repository.CrudRepository;

import com.login.loginpage.controller.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	

	//public User findByUsernameAndPassword(String username, String password);
}
