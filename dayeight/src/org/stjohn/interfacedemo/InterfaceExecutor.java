//driver class
package org.stjohn.interfacedemo;

public class InterfaceExecutor {

	public static void main(String[] args) {
		
	
		// we can't instantiate any interface
		//ATMMachine a=new ATMMachine();		
		
		ATMMachine a1=new ATMMachineChild();
		a1.deposite();
		a1.withdraw();
		
		ReceipeImplementable r1 = new ReceipeImplementable();
		r1.setName("Program");
		System.out.println(r1.displayName());
		
		
		NestedInterfaceEx n= new NestedInterfaceEx();
		n.setStr1("Vaishnavi");
		n.setStr2("Jadhav");
		System.out.println(n.concante());

	}

}
