package com.fastzina.solid.service;

import com.fastzina.solid.exception.ValidationException;
import com.fastzina.solid.model.Employee;
import com.fastzina.solid.model.Role;

public class PromotionService {
	
	public void promote(Employee employee, boolean targetHit) {
		Role currentRole = employee.getRole();
		if(Role.MANAGER == currentRole) {
			throw new ValidationException("Managers can't be promoted!");
		}
		if(!targetHit) {
			throw new ValidationException("Nobody can be promoted unless have hit the target!");
		}
		
		Role nextRole = currentRole.getNextRole();
		employee.setRole(nextRole);
	}
}
