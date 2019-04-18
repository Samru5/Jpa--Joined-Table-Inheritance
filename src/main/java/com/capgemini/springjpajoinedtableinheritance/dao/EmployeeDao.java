package com.capgemini.springjpajoinedtableinheritance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.springjpajoinedtableinheritance.model.Employee;


public interface EmployeeDao extends JpaRepository<Employee, Long> {

}
