package org.tnsif.stringsprogram;

public class BufferExample {

	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer(("Vaish"));
		//by default, capacity of any empty string is 16
		System.out.println(str1.capacity());
		System.out.println(str1.charAt(2));

	}

}
