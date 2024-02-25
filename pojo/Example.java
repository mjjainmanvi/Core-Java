package com.edu.pojo;

public class Example {
	private String firstName;
	private String lastName;
	
	public Example(){
		
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
	
	public String display(String firstName,String LastName) {
		return firstName+lastName;
	}
	

}
