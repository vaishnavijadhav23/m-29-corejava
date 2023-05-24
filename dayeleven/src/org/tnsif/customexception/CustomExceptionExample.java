//program to demonstrate in custom exception
package org.tnsif.customexception;

import java.util.Scanner;

public class CustomExceptionExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String id=sc.nextLine();
		String password=sc.nextLine();
	try {
		if(id.equals("Vaishnavij256@gmail.com")&&
				password.equals("Pass@123"))
		{
			System.out.println("Credentials matched");
		}
		else
		{
			throw new LoginCredential("Invalid Credentials");
		}
	}
	//handling using UD exceptions
	catch(LoginCredential e)
	{
		System.out.println("Exception handled " +e);
	}
	}

}
