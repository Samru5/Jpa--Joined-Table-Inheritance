package com.capgemini.springjpajoinedtableinheritance.controller;

import java.util.HashSet;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springjpajoinedtableinheritance.dao.EmployeeDao;
import com.capgemini.springjpajoinedtableinheritance.model.Employee;
import com.capgemini.springjpajoinedtableinheritance.model.FullTimeEmployee;
import com.capgemini.springjpajoinedtableinheritance.model.PartTimeEmployee;
import com.capgemini.springjpajoinedtableinheritance.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;


	@RequestMapping("/")
	public Set<Employee> add() {

		Set<Employee> employee = new HashSet<Employee>();
		employee.add(new PartTimeEmployee(101, "Tina", 500));
		employee.add(new FullTimeEmployee(102, "Meena", 20000));
		service.addNew(employee);
		return employee;
	}
}
