package com.projects.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projects.Service.UserService;
import com.projects.dto.CreateUserRequestDto;
import com.projects.model.Users;

@RestController
public class UsersController {

    private UserService userService;

    @GetMapping("/welcome")
    public String welcome() {

        return "welcome to home page";
    }

    @RequestMapping(value = "/Users", method = RequestMethod.POST)
    public String createUser(@RequestBody CreateUserRequestDto userDto) {
         
        Users user = userService.createUser(userDto);
        return "user is created successfully with id = ";
    }

}
