package org.tnsif.wrapperclass;

public class Autuboxing {
	public static void main(String[] args) {
		//primitive data type variable
		int num = 1025;
		//converting to object file(Autoboxing)
		Integer i = num;
		System.out.println("Value of num is:"+i);
		
		
		char ch = 'a';
		//autoboxing
		Character c =ch;
		System.out.println(ch);
	}

}
