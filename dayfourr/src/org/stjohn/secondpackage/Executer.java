package org.stjohn.secondpackage;
import org.stjohn.firstpackage.*;
public class Executer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Base b1 = new Base();
	
				/*
				 * if any method  is default we cannot access into another package ,
				 *  we can access only inside the same package
             */
		
		//b1.methodDefault()
		b1.methodPublic();

	}

}
