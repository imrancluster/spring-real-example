package com.imrancluster.springexample.mvc.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.imrancluster.springexample.mvc.validation.EmployeeCode;

public class Employee {
	
	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=3, message="must be 3 chars")
	private String lastName;
	
	private String designation;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 chars/digits")
	private String postalCode;
	
	@NotNull(message="is required")
	@Min(value=1, message="must be grater than or equal 1")
	@Max(value=2, message="must be less than or equal 2")
	private Integer foodToken;
	
	@EmployeeCode
	private String employeeId;
	
	public Employee() {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Integer getFoodToken() {
		return foodToken;
	}

	public void setFoodToken(Integer foodToken) {
		this.foodToken = foodToken;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
}
