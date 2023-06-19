//driver class
//program to demonstrate on CURD operation USING JDBC
package org.tnsif.client;

import java.util.Scanner;
import org.tnsif.entities.Student;
import org.tnsif.service.StudentService;
import org.tnsif.service.StudentServiceImpl;



public class Client {

	public static void main(String[] args) {
		int choice;
		StudentService service = new StudentServiceImpl();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter the choice: "
					+"\n 1:Retrive with specific student"
					+"\n 2:Retrive all"
					+"\n 3:delete"
					+"\n 4:insert"
					+"\n 5:update"
					+"\n -1:exit");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter the rollno:");
				Student student;
				try {
			    student=service.getStudent(sc.nextInt());
				}
				catch(Exception e) 
				{
					student=null;
				}
				if(student!=null) {
					System.out.println(student);
				}
				else
				{
					System.out.println("data not found");
				}
		} 
			
			break;
			
			case 3:
			{
				System.out.println("Enter the rollno for delete");
				boolean result=service.deleteStudent(sc.nextInt());
				if(result)
					System.out.println("deleted");
				else
					System.out.println("details not found");
			}
			break;
			case 4:
			{
				System.out.println("Enter the details of the student");
				Student student=new Student(sc.nextInt(),sc.next());
						if(service.addStudent(student))
							System.out.println("added");
						else
							System.out.println("details not found");
				
			}
			break;
			case 5:
			{
				System.out.println("enter the rollno for you" 
						+" want to update a data");	
				Student student=new Student();
				student.setRollno(sc.nextInt());
				System.out.println("Enter the updated name");
				sc.nextLine();
				student.setName(sc.nextLine());
				Student s1=service.updateStudent(student);
				if(s1!=null)
					System.out.println("updated");
				else
					System.out.println();
			}
			break;
			case -1:
			{
				System.out.println("Thank you!");
			}
			break;
			default:
				System.out.println("Invalid choice");
				break;
			}
	}while(choice>0);
//			https://github.com/Jenny1905/M29-CoreJava		
			
			
	}					

}
