package org.aksdroid.play.perfectwebapp.controllers;

import java.util.List;

import org.aksdroid.play.perfectwebapp.entities.User;
import org.aksdroid.play.perfectwebapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping("/users")
	public List<User> findAll() {
		return userService.findAll();
	}

}
