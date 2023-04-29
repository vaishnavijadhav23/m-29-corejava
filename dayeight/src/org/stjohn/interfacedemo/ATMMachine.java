//program to demonstrate on interface
package org.stjohn.interfacedemo;

public interface ATMMachine {
	/*All the variables inside interface are bydefault 
	 * public static final.
	 * so,here the amount is final type and 
	 * it must be initialize */
	 
	int amountWithdraw=10000;
	int amountDeposit=20000;
	
	/* by default all the methods inside the 
	 * interface are public abstract
	 */
	void withdraw();
	void deposite();

}
