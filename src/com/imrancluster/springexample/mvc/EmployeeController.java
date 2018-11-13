package com.imrancluster.springexample.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.imrancluster.springexample.mvc.model.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	// InitBinder  is a preprocessor
	// Spring will check the input field is full whitespace or not
	// If input value only whitespace then return null
	
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/show-form")
	public String showEmployeeForm(Model theModel) {
		
		Employee theEmployee = new Employee();
		
		theModel.addAttribute("employee", theEmployee);
		
		
		return "employee-form";
	}
	
	@RequestMapping("/process-form")
	public String processForm(
			@Valid @ModelAttribute("employee") Employee theEmployee, 
			BindingResult theBindResult) {
		
		System.out.println("Last Name: |" + theEmployee.getLastName() + "|" );
		
		// Find error code from the binding log
		// eg: typeMismatch.employee.foodToken=Invalid number
		System.out.println("Binding result: " + theBindResult);
		
		System.out.println("\n\n\n\n");
		
		if (theBindResult.hasErrors()) {
			return "employee-form";
		} else {
			return "show-employee";
		}
	}
}
