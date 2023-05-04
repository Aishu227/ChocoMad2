package com.example.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.UserModel;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService usrService;
		@PostMapping("/checkLogin")
		public String validateUser(@RequestBody UserModel u)
		{
			System.out.println(u.getUsername());
			return usrService.validateUser(u.getUsername(),u.getPassword());
		}
		@PostMapping("/addUser")
			public UserModel saveInfo(@RequestBody UserModel ui)
			{
				return usrService.saveUser(ui);
			}
	}
