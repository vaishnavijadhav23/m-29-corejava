package org.stjohn.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFCBank h=new HDFCBank();
		h.setCardNo(234567234L);
		h.setCardType("Debit-card");
		h.setCVVNo(444);
		h.setPinNo(1001);
		
		//getters is used to return value
		System.out.println(h.getCardNo());
		System.out.println(h.getCardType());
		System.out.println(h.getCVVNo());
		System.out.println(h.getPinNo());

	}

}
