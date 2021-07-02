package com.fastzina.solid.service;

import java.math.BigDecimal;

import com.fastzina.solid.model.Employee;

public interface RaiseValidation {
	void validate(Employee employee, BigDecimal raise);
}
