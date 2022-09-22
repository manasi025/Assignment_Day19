//Regex : User Registration Problem

package com.day19;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration 
{
	static Scanner input = new Scanner(System.in);

	public static void firstNameValidation() 
	{
		System.out.print("Enter First Name : ");
		String firstName = input.nextLine();
		boolean b = Pattern.matches("^[A-Z]{1}[a-z]{2,}$", firstName);
		System.out.println(b);
	}

	public static void lastNameValidation() 
	{
		System.out.print("Enter last Name : ");
		String lastName = input.nextLine();
		boolean b = Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lastName);
		System.out.println(b);
	}

	public static void emailValidation() 
	{
		System.out.print("\nEnter Email : ");
		String email = input.nextLine();
		boolean b = Pattern.matches("^(.+)@(\\S+)$", email);
		System.out.println(b);
	}

	public static void mobileNumberValidation() 
	{
		System.out.print("Enter Mobile Number : ");
		String num = input.nextLine();
		boolean b = Pattern.matches("^[0-9]{2}[0-9]{10}", num);
		System.out.println(b);
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("\t WELCOME TO USER REGISTRATION PROBLEM!! \n");

		firstNameValidation();
		lastNameValidation();
		emailValidation();
		mobileNumberValidation();
	}

}




/*

OUTPUT : 

	 WELCOME TO USER REGISTRATION PROBLEM!! 

Enter First Name : Ram
true
Enter last Name : Singh
true

Enter Email : ramsingh@hotmail.com
true
Enter Mobile Number : 9421101010
false


*/