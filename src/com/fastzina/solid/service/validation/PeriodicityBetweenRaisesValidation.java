package com.fastzina.solid.service.validation;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import com.fastzina.solid.exception.ValidationException;
import com.fastzina.solid.model.Employee;

public class PeriodicityBetweenRaisesValidation implements RaiseValidation {
	public void validate(Employee employee, BigDecimal raise) {
		LocalDate lastSalaryRaiseDate = employee.getLastSalaryRaiseDate();
		LocalDate currentDate = LocalDate.now();
		
		long monthsSinceLastRaise = ChronoUnit.MONTHS.between(lastSalaryRaiseDate, currentDate);
		if(monthsSinceLastRaise < 6) {
			throw new ValidationException("No raises allowed in an interval shorter than 6 months!");
		}
	}
}
