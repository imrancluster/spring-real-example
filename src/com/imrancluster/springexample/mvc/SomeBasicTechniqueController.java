package com.imrancluster.springexample.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class SomeBasicTechniqueController {

	@RequestMapping("/processFormVersionTwo")
	public String letsShoudDude(HttpServletRequest request, Model model) {
		
		// read the request parameters form the HTML form
		String theName = request.getParameter("studentName");
		
		// convert to data to all caps
		theName = theName.toUpperCase();
		
		// create a message
		String result = "Yo! " + theName;
		
		
		// Add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(
			@RequestParam("studentName") String theName, 
			 Model model) {
		
		// @RequestParam("studentName") String theName
		// Binding the HTML name studentName to Java variable theName
		
		// convert to data to all caps
		theName = theName.toUpperCase();
		
		// create a message
		String result = "Hey my friend from v3 ! " + theName;
		
		
		// Add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
