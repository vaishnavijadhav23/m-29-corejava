//program to demonstrate on final method
//child class
package org.stjohn.finalkeyword;

public class FinalMethodChildClass extends FinalMethod
{

	public  int num=275;
	//method overloading
	final void show(int num)
	{
		System.out.println("The num is:"+num);
	}
//	final method
	/*	final method can't be override,we will get 
	    compile time error
	Method override
	 * final void show()
	 * {
	 * System.out.println("The salary is:"+salary);
	 */

}
