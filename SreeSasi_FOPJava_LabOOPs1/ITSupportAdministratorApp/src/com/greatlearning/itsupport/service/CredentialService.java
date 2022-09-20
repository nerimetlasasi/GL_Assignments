package com.greatlearning.itsupport.service;

import com.greatlearning.itsupport.model.Employee;

public interface CredentialService {

	public void generateEmailId(Employee emp);
	public void generatePassword(Employee e);
	public void showCredentials(Employee e);
}
