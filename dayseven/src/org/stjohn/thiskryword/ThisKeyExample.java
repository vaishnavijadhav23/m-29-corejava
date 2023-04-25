//program to demonstrate on this keyword
package org.stjohn.thiskryword;
public class ThisKeyExample {
	
	//private data members
	private int cvvNo;
	private long atmNo;
	
	
	//parameterized constructor
	public ThisKeyExample(int cvvNo, long atmNo) {
		/*It can be used to return the current 
		 * class instance
		 */
	
		this.cvvNo = cvvNo;
		this.atmNo = atmNo;
	}


	//user-defined method
	public void print()
	{
		System.out.println("CVV no is :"+cvvNo+" "
				+"ATM Card No is:"+atmNo);
	}


	



	
		

}
