package com.projects.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projects.Service.UserService;
import com.projects.model.Users;


@RestController
public class controller {
	
private UserService userService;
	
	@GetMapping("/welcome")	
public String welcome() {
	
return "welcome to home page";	
}
	
@RequestMapping(value ="/Users",method = RequestMethod.POST)
public String createUser(@RequestBody Users user)
{
 user = userService.createUser(user);
 return "user is created successfully with id = ";
}
	
	
	
	
	
	
	
}
