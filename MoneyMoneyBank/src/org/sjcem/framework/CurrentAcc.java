package org.sjcem.framework;

public abstract class CurrentAcc extends BankAcc {
	
	private final float creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	
	public void withdraw(float amount) {
		if(this.getAccBal() > creditLimit+amount) {
			System.out.println("Balance Before Withdrawal: "+this.getAccBal());
			this.setAccBal(getAccBal()-(creditLimit+amount));
			System.out.println("Account No: "+this.getAccNo()+", Account Name: "+this.getAccNm()+", Withdraw Amount:"+amount+", Account Balance: "+this.getAccBal());
		} else {
			System.out.println("Cannot Withdraw Money, Minimum Balance Limit Reached:"+(creditLimit+amount));
		}
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}

	
	

}
