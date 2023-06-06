//Program to Demonstrate on Generic Advantages.
package org.tnsif.generics;

import java.util.ArrayList;

import java.util.List;

public class GenericAdvantageExample {

	public static void main(String[] args) {
		//1.Type-safety
		List<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(15);
		//list.add(23.5);
		System.out.println(list);
		
		//2.before Generic,Typecasting is allowed
		ArrayList arr1 = new ArrayList ();
		arr1.add("St.John");
		System.out.println(arr1);
		String str = (String)arr1.get(0);
		System.out.println(str);
		
		//2.In Generic,Typecasting is not allowed
		ArrayList arr2 = new ArrayList ();
		arr1.add("St.John");
		System.out.println(arr1);
		String str1 = (String)arr1.get(0);
		System.out.println(str);
		
		

	}

}
