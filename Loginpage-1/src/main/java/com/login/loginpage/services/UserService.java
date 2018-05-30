package com.login.loginpage.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;

import com.login.loginpage.controller.model.User;
import com.login.loginpage.repository.UserRepository;
@Service
@Transactional
//@RestController
public class UserService {

@Autowired
private UserRepository userRepository;
//public UserService(UserRepository userRepository) {
//	this.userRepository = userRepository;
//}
//
//
////@PostMapping("/user")
//public User saveMyUser( User user) {
//	
//	return userRepository.save(user);
//}
//
//public List<User> showAllUsers(){
//	List<User> users = new ArrayList<User>();
//	for(User user : userRepository.findAll()) {
//		users.add(user);
//	}
//	
//	return users;
//}
	
	
	public List<User> getAllUsers(){
		List<User> users = new ArrayList<>();
		userRepository.findAll().forEach(users::add);
		return users;
	}
	
	public Object getUser(int id) {
		//return users.stream().filter(u -> u.getUsername().equals(username)).findFirst().get();
	    return userRepository.findById(id);
	}

	public void addUser(User user) {
		// TODO Auto-generated method stub
		//users.add(user);
		userRepository.save(user);
		
	}

	public void updateUser(String username, User user) {
//		for(int i =0; i<users.size();i++) {
//			User u = users.get(i);
//			if(u.getUsername().equals(username)) {
//				users.set(i,user);
//				return;
//			}
//		}
		// TODO Auto-generated method stub
		
		userRepository.save(user);
	}

	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		//users.removeIf(u -> u.getUsername().equals(username));
		userRepository.deleteById(id);
		
	}
	

}


