package org.stjohn.constructoroverloadingexample;

public class ConstructorCOverloadingExample {
	
	private int x;
	private int y;
	
	//
	public ConstructorCOverloadingExample()
	{
		System.out.println("Deafult constructor");
	}
	
	public ConstructorCOverloadingExample(int x)
	{
		System.out.println("parameter one :"+x);
	}

	
	public ConstructorCOverloadingExample(int x,int y)
	{
		System.out.println("Two Parameter :"+y);
	}


}
