package com.greatlearning.itsupport.service;

import java.util.Random;
import com.greatlearning.itsupport.model.Employee;

public class CredentialServiceImpl implements CredentialService{
	private String domain;
	public CredentialServiceImpl(String domain) {
		super();
		this.domain = domain;
	}
	
	@Override
	public void generateEmailId(Employee emp) {
		emp.setEmailId(emp.getFirstName()+emp.getLastName()+"@"+emp.getDept()+"."+this.domain+".com");
	}
	
	@Override
	public void generatePassword(Employee emp) {
		Random r= new Random();
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<8; i++)
		{
		int n=r.nextInt(127-32)+32;
		sb.append((char)n);
		}	
		emp.setPassword(sb.toString());
	}
	@Override
	public void showCredentials(Employee e) {
		System.out.println("Dear "+e.getFirstName()+", your generated credentials are as follows");
		System.out.println("Email ---> "+e.getEmailId());
		System.out.println("Password ---> "+e.getPassword());
	}
	
}
