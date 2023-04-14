package org.stjohn.userinput;
import java.util.Scanner;
//program to demonstrate on user_input

public class UserinputProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//double
		System.out.println("Enter Your Salary:");
		float salary = sc.nextFloat();
		
		//string
		System.out.println("Enter Your Name:");
		String name = sc.next(); //To print the first word of the statement
		sc.nextLine();
		System.out.println("Enter Your Name:");
		String name1 = sc.nextLine(); //To print the whole statement
		
		//character
		System.out.println("Enter Your Character:");
		char ch = sc.next().charAt(1);
		
		System.out.println("Salary is: "+salary);
		System.out.println("Name is: "+name);
		System.out.println("Name1 is: "+name1);
		System.out.println("Character is: "+ch);
		sc.close(); //To close the warnings.
		
	}

}
