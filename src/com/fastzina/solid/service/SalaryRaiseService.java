package com.fastzina.solid.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.fastzina.solid.exception.ValidationException;
import com.fastzina.solid.model.Employee;

public class SalaryRaiseService {
	public void raiseEmployeeSalary(Employee employee, BigDecimal raise) {
		BigDecimal currentSalary = employee.getSalary();
		
		BigDecimal raisePercentage = raise.divide(currentSalary, RoundingMode.HALF_UP);
		if (raisePercentage.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidationException("Raise can't be higher than 40% of the current salary!");
		}
		BigDecimal raisedSalary = currentSalary.add(raise);
		employee.updateSalary(raisedSalary);
	}
}
