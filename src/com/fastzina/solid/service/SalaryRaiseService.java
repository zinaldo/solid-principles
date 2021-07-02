package com.fastzina.solid.service;

import java.math.BigDecimal;
import java.util.List;

import com.fastzina.solid.model.Employee;

public class SalaryRaiseService {
	
	private List<RaiseValidation> validations;
	
	public SalaryRaiseService(List<RaiseValidation> validations) {
		this.validations = validations;
	}
	
	public void raiseEmployeeSalary(Employee employee, BigDecimal raise) {
		this.validations.forEach(v -> v.validate(employee, raise));
		
		BigDecimal raisedSalary = employee.getSalary().add(raise);
		employee.updateSalary(raisedSalary);
	}
}
