package com.capgemini.springjpajoinedtableinheritance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="PartTimeEmployee")
public class PartTimeEmployee extends Employee {
	 @Column(name = "rate")
	private int hourlyRate;

	public PartTimeEmployee() {
		super();
	}

	public PartTimeEmployee(long empId, String empName, int hourlyRate) {
		super(empId, empName);
		this.hourlyRate = hourlyRate;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee [hourlyRate=" + hourlyRate + "]";
	}
}
