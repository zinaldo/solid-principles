package com.fastzina.solid.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import com.fastzina.solid.exception.ValidationException;

public class Employee {

	private String name;
	private String id;
	private Role role;
	private BigDecimal salary;
	private LocalDate lastSalaryRaise;

	public Employee(String name, String id, Role role, BigDecimal salary) {
		this.name = name;
		this.id = id;
		this.role = role;
		this.salary = salary;
	}

	public void reajustarSalario(BigDecimal raise) {
		BigDecimal percentualReajuste = raise.divide(salary, RoundingMode.HALF_UP);
		if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidationException("Raise can't be higher than 40% of the current salary!");
		}
		this.salary = this.salary.add(raise);
		this.lastSalaryRaise = LocalDate.now();
	}

	public String getName() {
		return name;
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

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public LocalDate getLastSalaryRaise() {
		return lastSalaryRaise;
	}

	public void setLastSalaryRaise(LocalDate lastSalaryRaise) {
		this.lastSalaryRaise = lastSalaryRaise;
	}

}
