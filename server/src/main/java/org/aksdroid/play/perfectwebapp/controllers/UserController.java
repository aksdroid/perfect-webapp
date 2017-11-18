package org.aksdroid.play.perfectwebapp.controllers;

import java.util.List;

import org.aksdroid.play.perfectwebapp.entities.User;
import org.aksdroid.play.perfectwebapp.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API to search Users from a User Repository by different serach parameters", description = "This API provides the capability to search User from a User Repository", produces = "application/json")
public class UserController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	UserService userService;

	@ApiOperation(value = "Find all Users", produces = "application/json")
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<User> findAll() {
		logger.debug("findAll Users");
		return userService.findAll();
	}

}
