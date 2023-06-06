package org.tnsif.multithreading;

public class ChildThread extends Thread{
	Person p;
	public ChildThread(Person p)
	{
		this.p=p;
		start();
		
	}
	public void run()
	{
		System.out.println(p);
	}

}
