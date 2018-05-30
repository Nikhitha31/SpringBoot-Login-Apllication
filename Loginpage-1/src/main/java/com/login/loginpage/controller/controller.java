package com.login.loginpage.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.login.loginpage.controller.model.User;
import com.login.loginpage.services.UserService;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;

@Controller
public class controller {
@Autowired	
private UserService userService;

@RequestMapping("/welcome")
public String Welcome(HttpServletRequest request) {
	 request.setAttribute("mode","GET_HOME");
	return "welcomepage";
}
@RequestMapping("/doRegister")
public String Registration(HttpServletRequest request) {
	 request.setAttribute("mode","GET_REGISTER");
	return "welcomepage";
	
	
}


}
