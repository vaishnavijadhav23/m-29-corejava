//program to demonstrate on string built in function
package org.tnsif.stringsprogram;

public class StringOperation {

	public static void main(String[] args) {
		// using new keyword
		String str1 = new String("Ruchi");
		System.out.println(str1.toUpperCase());
		System.out.println(str1.length());
		System.out.println(str1.hashCode());
		System.out.println(str1.lastIndexOf('h'));
		System.out.println(str1.concat("Shivani"));
		System.out.println(str1+" Shinde");

	}

}
