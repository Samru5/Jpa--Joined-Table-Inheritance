package com.capgemini.springjpajoinedtableinheritance.model;

import javax.persistence.*;

@Entity
@Table(name="FullTimeEmployee")
public class FullTimeEmployee extends Employee {
	 @Column(name = "salary")
	private int salary;

	public FullTimeEmployee() {
		super();
	}

	public FullTimeEmployee(long empId, String empName, int salary) {
		super(empId, empName);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "FullTimeEmployee [salary=" + salary + "]";
	}

}
