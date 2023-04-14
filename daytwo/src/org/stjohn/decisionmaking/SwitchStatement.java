package org.stjohn.decisionmaking;
import java.util.Scanner;
public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int songInput = sc.nextInt();
		switch(songInput) {
			case 1: 
				System.out.println("Calm down");
				break;
			case 2: 
				System.out.println("Perfect");
				break;
			case 3: 
				System.out.println("Mallang");
				break;
			default: 
				System.out.println("Invalid input");
		}

	}

}
