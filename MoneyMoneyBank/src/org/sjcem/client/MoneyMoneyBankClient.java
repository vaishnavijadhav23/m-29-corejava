//Driver class
//Program to demonstrate on MoneyMoneyBank App
package org.sjcem.client;

import org.sjcem.application.MMBankFactory;
import org.sjcem.application.MMCurrentAcc;
import org.sjcem.application.MMSavingAcc;
import org.sjcem.framework.BankFactory;
import org.sjcem.framework.CurrentAcc;
import org.sjcem.framework.SavingAcc;

public class MoneyMoneyBankClient {

	public static void main(String[] args) {
		BankFactory b = new MMBankFactory();
		SavingAcc s = new MMSavingAcc(40005, "Vaishnavi Jadhav", 2000, true);
		CurrentAcc c = new MMCurrentAcc(50005, "Tejaswi Kolhe", 5500, 500);
		
		System.out.println("Saving Account");
		s.withdraw(500);
		
		System.out.println();
		
		System.out.println("Current Account");
		c.withdraw(200);
		
		System.out.println();
		
		
		System.out.println(s);
		System.out.println(c);

		
		
	}

}
