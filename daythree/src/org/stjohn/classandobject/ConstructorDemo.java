package org.stjohn.classandobject;
import java.util.Scanner;

		//driver class
		public class ConstructorDemo {

			public static void main(String[] args) {
				
				Scanner s =new Scanner(System.in);
				int id;
				String city,name;
				System.out.println("Enter the customer ID:");
				id=s.nextInt();
				
				s.nextLine();
				System.out.println("Enter the customer name:");
				name=s.nextLine();
				
				System.out.println("Enter the customer city:");
				city=s.nextLine();
				
				//object creation
				//default constructor invoke
				Customer c=new Customer();
				c.setCustomerName(name);
				c.setCustomerId(id);
				c.setCity(city);
				//below statement will call to toString method
				System.out.println(c);
				
				
				System.out.println("Enter the customer ID:");
				id=s.nextInt();
				
				s.nextLine();
				System.out.println("Enter the customer name:");
				name=s.nextLine();
				
				System.out.println("Enter the customer city:");
				city=s.nextLine();
				
				Customer c1=new Customer(id,name,city);
				System.out.println(c1);

	}

}
