package org.aksdroid.play.perfectwebapp.services;

import java.util.List;

import org.aksdroid.play.perfectwebapp.entities.Employee;
import org.aksdroid.play.perfectwebapp.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> findRelatedEmployees(Integer employeeId) {
		return employeeRepository.findRelatedEmployees(employeeId);
	}

	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}
}
