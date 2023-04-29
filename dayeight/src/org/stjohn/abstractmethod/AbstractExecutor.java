package org.stjohn.abstractmethod;

public class AbstractExecutor {

	public static void main(String[] args) {
		//if any class contains abstract method
		
		Remote r1 = new RemoteChild();
		r1.create();
		
		RemoteChild r=new RemoteChild();
		r.cellName="DuroCell";
		r.display();
		r.functionRemote();

	}

}
