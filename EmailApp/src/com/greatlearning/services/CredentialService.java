package com.greatlearning.services;

import java.util.Random;

import com.greatlearning.interfaces.ICredentials;
import com.greatlearning.model.Employee;

public class CredentialService implements ICredentials {

	@Override
	public String generatePassword() {
		String capitalLetters = "ABCDEFGHIKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghiklmnopqrstuvwxyz";
		String numbers = "1234567890";
		String specialChars = "!@#$%^&*()<>/";
		String values = capitalLetters+smallLetters+numbers+specialChars;
		Random rnd = new Random();
		String password ="";
		char[] passwordchar= {'c','h'};
		char caps = capitalLetters.charAt(rnd.nextInt(capitalLetters.length()));
		char small = smallLetters.charAt(rnd.nextInt(smallLetters.length()));
		char nums = numbers.charAt(rnd.nextInt(numbers.length()));
		char spl = specialChars.charAt(rnd.nextInt(specialChars.length()));
		
		for(int i=0 ; i<3 ; i++)
		{
		password+= String.valueOf(capitalLetters.charAt(rnd.nextInt(capitalLetters.length())));
		password+= String.valueOf(smallLetters.charAt(rnd.nextInt(smallLetters.length())));
		password+= String.valueOf(numbers.charAt(rnd.nextInt(numbers.length())));
		password+= String.valueOf(specialChars.charAt(rnd.nextInt(specialChars.length())));
		}
		//System.out.println("random character is "+values.charAt(rnd.nextInt(values.length())));
		return new String(password);
	}

	@Override
	public String generateEmailAddress(Employee employee, String department) {
		// TODO Auto-generated method stub
		return employee.getFirstName()+"."+employee.getLastName()+"@"+department+".gl.com";
	}

	@Override
	public void showPassword(Employee employee) {
		System.out.println("Your Password: " +employee.getPasswrod());
		
	}

}
