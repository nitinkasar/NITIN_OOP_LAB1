package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.services.CredentialService;

public class Driver {
	public static void displayMenu() {
		
		System.out.println("Please enter menu option from Below -");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
	}

	public static void main(String[] args) {
		System.out.println("Email App");
		displayMenu();
		Employee employee = new Employee("Nitin","Kasar");

	    
		String dept[] = {"tech","admin","hr","legal"};
        Scanner s = new Scanner(System.in);
		int option = s.nextInt();
		
		System.out.println("Your selected Department : " + dept[option-1]);
		
	     System.out.println("Hi .." +employee.getFirstName());
	     System.out.println("Welcome ...");
	     
		CredentialService cs = new CredentialService();
		String emailAddress = cs.generateEmailAddress(employee, dept[option -1]);
		employee.setEmail(cs.generateEmailAddress(employee, emailAddress));
		employee.setPasswrod(cs.generatePassword());
	    // System.out.println("Password generated - "+ cs.generatePassword());
		System.out.println("Your Email Address : " +emailAddress);
		cs.showPassword(employee);
	}
}
