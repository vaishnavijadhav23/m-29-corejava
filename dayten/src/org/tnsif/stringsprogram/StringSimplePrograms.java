//Program to demonstrate on string progrram by using string literal and using 
// new keyword
package org.tnsif.stringsprogram;

public class StringSimplePrograms {

	public static void main(String[] args) {
		// using string literal
		String str1 = "Vaishu";
		System.out.println("Using string literal: "+str1);
		
		//using new keyword 
		String str2 = new String("Aishu");
		System.out.println("Using string literal: "+str2);
		
		
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		

	}

}
