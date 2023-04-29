package org.stjohn.abstractmethod;

/*if any class contains atleast one abstract method then
 *  that class 
 * must be declare as an abstract class
 * 
 */
public abstract class Remote {
	
	 String cellName;
	//abstract class can have abstract 
	// and non-abstract method
	
	
	//abstract method
	abstract void functionRemote();
	abstract void create();
	
	//abstract class contain abstract and non abstract method
	
	//concrete method
	public void display()
	{
		System.out.println("Cell name is:"+cellName);
	}

}
//implementable class
class RemoteChild extends Remote
{

	void functionRemote() {
		System.out.println("abstrat method is implemented");
	}
	
	void create() {
		System.out.println("Abstract method two");
	}
	
	
	/*implement all the abstract method of your abstract 
	 * class in implementable class
	 */
	
	
}

