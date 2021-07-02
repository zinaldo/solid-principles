package com.fastzina.solid.model;

import java.math.BigDecimal;

public interface TaxedSalaryRaise extends SalaryRaise {
	BigDecimal tax();
}
