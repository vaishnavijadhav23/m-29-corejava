package org.tnsif.interfacedemo;

public class ATMMachineChild implements ATMMachine {

	@Override
	public void withdraw() {
		System.out.println("Withdraw amount: "+amountWithdraw);
	}

	@Override
	public void deposite() {
		System.out.println("Deposited amount: "+amountDeposit);

	}

}
