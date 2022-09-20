package com.greatlearning.itsupport.model;

public class Employee {

	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	private String dept;
	
	/**
	 * @param firstName
	 * @param lastName
	 */
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * @return the department
	 */
	public String getDept() {
		return dept;
	}

	/**
	 * @param dept the department to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}


}
