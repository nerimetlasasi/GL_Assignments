package com.greatlearning.itsupport.main;

import java.awt.geom.GeneralPath;
import java.util.Scanner;

import com.greatlearning.itsupport.model.Employee;
import com.greatlearning.itsupport.service.CredentialService;
import com.greatlearning.itsupport.service.CredentialServiceImpl;

public class Driver {
	private static String domain = "greatlearning";
	private static String[] department = { "Technical", "Admin", "Human Resource", "Legal" };
	private static String[] deptCodes = { "tech", "adm", "hr", "lg" };
	private static Scanner scan = new Scanner(System.in);
	private static Employee emp;
	private static String dept = null;

	public static void main(String[] args) {
		System.out.println("Please enter your first name: ");
		String firstName = scan.nextLine().toLowerCase();
		System.out.println("Please enter your last name: ");
		String lastName = scan.nextLine().toLowerCase();
		emp = new Employee(firstName, lastName);
		while (dept == null) {
			try {
				dept = getDepartmentCode();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		emp.setDept(dept);
		CredentialService service = new CredentialServiceImpl(domain);
		service.generateEmailId(emp);
		service.generatePassword(emp);
		service.showCredentials(emp);
	}

	private static String getDepartmentCode() {
		System.out.println("Please enter the department number from the following");
		int deptCount = 0;
		int deptNumber = 0;
		try {
			while (deptCount < department.length) {
				System.out.println(deptCount + 1 + ". " + department[deptCount]);
				deptCount++;
			}
			deptNumber = scan.nextInt();
			dept = deptCodes[deptNumber - 1];
			System.out.println("Department input by emp: "+dept);
		} catch (Exception e) {
			System.out.println("Please enter a valid department number");
			//e.printStackTrace();
			getDepartmentCode();
		}
		return dept;
	}
}
