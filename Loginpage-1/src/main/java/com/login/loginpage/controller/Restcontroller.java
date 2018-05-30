package com.login.loginpage.controller;

import java.util.List;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.login.loginpage.controller.model.User;
import com.login.loginpage.services.UserService;

@RestController
public class Restcontroller {
    @GetMapping("/")
	public String hello() {
		return "This is home page";
	}
   @Autowired 
   private UserService userService;
//   
//    @GetMapping("/saveuser")
//    public String saveUser(@RequestParam String username, @RequestParam String firstname, @RequestParam String lastname, @RequestParam String Email, @RequestParam String Password ) {
//    	User user = new User(username,firstname,lastname,Email,Password);
//    	userService.saveMyUser(user);
//    	
//    	return "User Saved";
//    }
    @RequestMapping("/users")
    public List<User> getAllUsers()
    {
    	return userService.getAllUsers();
    }
    @RequestMapping("/users/{id}")
    public Object getUser(@PathVariable int id) {
    	return userService.getUser(id);
    	
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/users")
    public void addUser(@RequestBody User user) {
    	userService.addUser(user);
    	
    }
    
    @RequestMapping(method=RequestMethod.PUT, value="/users/{username}")
    public void updateUser(@RequestBody User user, @PathVariable String username) {
    	userService.updateUser(username,user);
    }
    
    @RequestMapping(method=RequestMethod.DELETE, value="/users/{id}")
    public void deleteUser(@PathVariable int id) {
    	userService.deleteUser(id);
    	
    }
}
