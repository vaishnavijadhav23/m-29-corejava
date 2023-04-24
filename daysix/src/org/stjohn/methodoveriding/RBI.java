//Program to demonstrate on method overriding
package org.stjohn.methodoveriding;
//Parent class
public class RBI {
	
	public float getInterestRate()
	{
		return 7.4f;
		
	}
	
}	
	
class HDFC extends RBI
{
		
	public float getInterestRate()
		{
		
		System.out.println(super.getInterestRate());
		return 12.45f;
			
		}

}
