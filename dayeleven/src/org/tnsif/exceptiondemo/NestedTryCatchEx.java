package org.tnsif.exceptiondemo;
import java.util.Scanner;
public class NestedTryCatchEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x and y: ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int arr[] = new int[] {11,22,33};
	
	try
	{
		//nested try-catch block
		try
	{
		System.out.println(arr[3]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Exception handled "+e);
	}
		try {
			System.out.println(x/y);
		}
		catch(ArithmeticException e){
			System.out.println("Exception handled"+e);
		}
		
}
	
	finally
	{
		System.out.println("Finally Block");
	}
}
}
