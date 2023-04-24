//driver class

package org.stjohn.methodoverloading;

public class MethodOverloadingExecuter {

	public static void main(String[] args) {
		MethodOverloadingExample m1 = new MethodOverloadingExample();
		System.out.println(m1.multiplication(10.5f, 4.0f));
		System.out.println(m1.multiplication(10.5f, 4));
		System.out.println(m1.multiplication(15, 2.5f));
		System.out.println(m1.multiplication(2, 7));
		System.out.println(m1.print("Welcome to Eclipse :)"));
		System.out.println(m1.print("Vaishnavi","Jadhav"));
		

	}

}
