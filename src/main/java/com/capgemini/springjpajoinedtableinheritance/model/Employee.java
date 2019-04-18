package com.capgemini.springjpajoinedtableinheritance.model;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="EMPLOYEE")
public class Employee {
	 @Id
	 @Column(name = "id")
	@GeneratedValue
	private long empId;
	 
	@Column(name = "empName")
	private String empName;

	public Employee() {
		super();
	}

	public Employee(long empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	

}
