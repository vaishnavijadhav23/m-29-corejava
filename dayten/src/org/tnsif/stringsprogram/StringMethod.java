package org.tnsif.stringsprogram;
import java.util.Scanner;
public class StringMethod {

	public static void main(String[] args) {
//		using string literal
		String str1="Dhoni";
		
		Scanner sc = new Scanner(System.in);
		String str2 = new String(sc.nextLine());
		
		if(str1.equals(str2))
			System.out.println("Both are equal");
	
		else
			System.out.println("Not equal");
		
	}

}
