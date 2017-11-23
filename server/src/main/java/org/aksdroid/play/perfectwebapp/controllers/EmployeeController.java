package org.aksdroid.play.perfectwebapp.controllers;

import java.util.List;

import org.aksdroid.play.perfectwebapp.entities.Employee;
import org.aksdroid.play.perfectwebapp.services.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API to search Users from a User Repository by different serach parameters", description = "This API provides the capability to search User from a User Repository", produces = "application/json")
public class EmployeeController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EmployeeService employeeService;

	@ApiOperation(value = "Find all Employees", produces = "application/json")
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public List<Employee> findAll() {
		logger.debug("findAll Employees");
		return employeeService.findAll();
	}

	@ApiOperation(value = "Find all Related Employees", produces = "application/json")
	@RequestMapping(value = "/employees/{employeeId}/related", method = RequestMethod.GET)
	public List<Employee> findRelatedEmployees(@PathVariable(name = "employeeId") Integer employeeId) {
		logger.debug("findAll Related Employees");
		return employeeService.findRelatedEmployees(employeeId);
	}

}
