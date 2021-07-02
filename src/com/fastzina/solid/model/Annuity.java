package com.fastzina.solid.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Annuity implements SalaryRaise {

	private BigDecimal value;
	private LocalDate date;
	
	public Annuity(BigDecimal value, LocalDate date) {
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

}
