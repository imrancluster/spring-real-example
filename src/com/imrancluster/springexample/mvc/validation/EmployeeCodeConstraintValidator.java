package com.imrancluster.springexample.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmployeeCodeConstraintValidator implements ConstraintValidator<EmployeeCode, String> {
	
	private String codePrefix;
	
	@Override
	public void initialize(EmployeeCode theEmployeeCode) {
		codePrefix = theEmployeeCode.value();
	}
	
	@Override
	public boolean isValid(String theValue, ConstraintValidatorContext theConstraintValidatorContext) {
		
		
		boolean result;
		if (theValue != null) {
			result = theValue.startsWith(codePrefix);
		} else {
			result = true;
		}
		
		return result;
	}
	
	
}
