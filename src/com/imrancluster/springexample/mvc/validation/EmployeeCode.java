package com.imrancluster.springexample.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = EmployeeCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD}) // Used this custom validation rules with method or field
@Retention(RetentionPolicy.RUNTIME) // this custom validation rules will be used on Runtime only
public @interface EmployeeCode {

	
	// define default course code
	public String value() default "TH-";
	
	// define default error message
	public String message() default "must start with TH-";
	
	// define default groups
	public Class<?>[] groups() default {};
	
	// define default payloads. It will provide details of error
	public Class<? extends Payload>[] payload() default {};
}
