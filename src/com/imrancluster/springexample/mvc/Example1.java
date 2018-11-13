package com.imrancluster.springexample.mvc;

import java.util.LinkedHashMap;

public class Example1 {

private String firstName;
	
	private String lastName;
	
	private String country;
	
	private LinkedHashMap<String, String> countryOptions;
	
	private String favoriteLanguage;
	
	private LinkedHashMap<String, String> favoriteLanguageOptions;
	
	private String[] operatingSystems;
	
	private LinkedHashMap<String, String> operatingSystemOptions;
	
	public Example1() {
		// populate country options: used ISO country code
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "Franch");
		countryOptions.put("DE", "Gernamy");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States of America");
		
		// populate favorite language opitons
		favoriteLanguageOptions = new LinkedHashMap<>();
		favoriteLanguageOptions.put("Java", "Java");
		favoriteLanguageOptions.put("C#", "C#");
		favoriteLanguageOptions.put("PHP", "PHP");
		favoriteLanguageOptions.put("Ruby", "Ruby");
		favoriteLanguageOptions.put("Python", "Python");
		
		// populate operating system options
		operatingSystemOptions = new LinkedHashMap<>();
		operatingSystemOptions.put("Linux", "Linux");
		operatingSystemOptions.put("Mac OS", "Mac OS");
		operatingSystemOptions.put("MS Windows", "MS Windows");
		
		
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public LinkedHashMap<String, String> getOperatingSystemOptions() {
		return operatingSystemOptions;
	}
}
