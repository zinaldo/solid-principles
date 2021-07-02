package com.fastzina.solid.model;

import java.math.BigDecimal;

public class EmployeePersonalData {
	private String name;
	private String id;
	private Role role;
	private BigDecimal salary;
	
	public EmployeePersonalData(String name, String id, Role role, BigDecimal salary) {
		super();
		this.name = name;
		this.id = id;
		this.role = role;
		this.salary = salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public BigDecimal getSalary() {
		return salary;
	}
}
