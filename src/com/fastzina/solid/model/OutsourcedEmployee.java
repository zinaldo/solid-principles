package com.fastzina.solid.model;

import java.math.BigDecimal;

public class OutsourcedEmployee {
	
	private EmployeePersonalData personalData;
	private String company;

	public OutsourcedEmployee(String name, String id, Role role, BigDecimal salary, String company) {
		this.personalData = new EmployeePersonalData(name, id, role, salary);
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getName() {
		return this.personalData.getName();
	}

	public void setName(String name) {
		this.personalData.setName(name);
	}

	public String getId() {
		return this.personalData.getId();
	}

	public void setId(String id) {
		this.personalData.setId(id);
	}

	public Role getRole() {
		return this.personalData.getRole();
	}
}
