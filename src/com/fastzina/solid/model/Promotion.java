package com.fastzina.solid.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promotion implements TaxedSalaryRaise {

	private BigDecimal value;
	private LocalDate date;
	
	public Promotion(BigDecimal value, LocalDate date) {
		this.value = value;
		this.date = date;
	}

	@Override
	public BigDecimal value() {
		return this.value;
	}

	@Override
	public LocalDate date() {
		return this.date;
	}

	@Override
	public BigDecimal tax() {
		return this.value.multiply(new BigDecimal("0,1"));
	}

}
