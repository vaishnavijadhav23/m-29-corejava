// program to demonstrate on super keyword
package org.stjohn.superkeyword;
//child class
public class Tiger extends Animal {
	
	public String animalType="wild";
	public int noOfLegs=4;
	
	//default constructor
	public Tiger () {
		//invoking the parent class constructor
		//it class parent class default constructor
		super();
		System.out.println("Tiger class construtor-Child");
	}
	
	public void display()
	{
		//super keyword with method
		super.display();
		//super keyword with variable
		System.out.println(super.animalType);
		System.out.println(super.noOfLegs);
		System.out.println("Animal Type:"+animalType);
		System.out.println("No of Legs:"+noOfLegs);
	}

	@Override
	public String toString() {
		return "Tiger [animalType=" + animalType + ", noOfLegs=" + noOfLegs + "]";
	}
		
}