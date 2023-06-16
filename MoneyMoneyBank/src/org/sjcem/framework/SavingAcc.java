package org.sjcem.framework;

public abstract class SavingAcc extends BankAcc {
	private boolean isSalaried;
	static final private float MINBAL=100.0f;

	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}
	
	public void withdraw(float amount) {
		if(amount > MINBAL) {
			System.out.println("Balance Before Withdrawal: "+this.getAccBal());
			this.setAccBal(getAccBal()-amount);
			System.out.println("Account No: "+this.getAccNo()+", Account Name: "+this.getAccNm()+", Withdraw Amount:"+amount+", Account Balance: "+this.getAccBal());
		} else {
			System.out.println("Cannot Withdraw Money, Minimum Balance Limit Reached:"+ MINBAL);
		}
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}
}
