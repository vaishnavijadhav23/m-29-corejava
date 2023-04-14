package org.stjohn.operatior;

public class TernaryOperator {
	public static void main(String[] args) {
		// (condition)?"T":"F";
		String isEven = (5%2==0)?"Even":"Odd";
		System.out.println(isEven);
	}
}
