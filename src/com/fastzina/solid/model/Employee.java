package com.fastzina.solid.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {
	private EmployeePersonalData personalData;
	private LocalDate lastSalaryRaiseDate;

	public Employee(String name, String id, Role role, BigDecimal salary) {
		this.personalData = new EmployeePersonalData(name, id, role, salary);
	}

	public void updateSalary(BigDecimal updatedSalary) {
		this.personalData.setSalary(updatedSalary);
		this.lastSalaryRaiseDate = LocalDate.now();
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

	public void setRole(Role role) {
		this.personalData.setRole(role);
	}

	public BigDecimal getSalary() {
		return this.personalData.getSalary();
	}

	public void setSalary(BigDecimal salary) {
		this.personalData.setSalary(salary);
	}

	public LocalDate getLastSalaryRaiseDate() {
		return lastSalaryRaiseDate;
	}

	public void setLastSalaryRaiseDate(LocalDate lastSalaryRaiseDate) {
		this.lastSalaryRaiseDate = lastSalaryRaiseDate;
	}

}
