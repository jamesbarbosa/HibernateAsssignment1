package com.hibernateassignment.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class Sales extends Employee {

	private BigDecimal salary;

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

}
