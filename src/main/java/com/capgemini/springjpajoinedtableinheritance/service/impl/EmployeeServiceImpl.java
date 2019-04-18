package com.capgemini.springjpajoinedtableinheritance.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.springjpajoinedtableinheritance.dao.EmployeeDao;
import com.capgemini.springjpajoinedtableinheritance.model.Employee;
import com.capgemini.springjpajoinedtableinheritance.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;

	/*@Override
	public void addNew(Employee pemp) {
		dao.save(pemp);		
	}*/

	@Override
	public void addNew(Set<Employee> employee) {
		dao.saveAll(employee);		
		
	}

	
}
