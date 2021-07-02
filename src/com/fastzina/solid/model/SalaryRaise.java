package com.fastzina.solid.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface SalaryRaise {
	BigDecimal value();
	LocalDate date();
}
