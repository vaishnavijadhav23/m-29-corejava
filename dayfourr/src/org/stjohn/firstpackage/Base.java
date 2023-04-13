package org.stjohn.firstpackage;

public class Base {
	// declaring all the access specifier with variable
	int varDefault=10;
	public String varPublic="John";
	private int varPrivate=1221;
	protected float varProtected=34900.50f;
	
	void methodDefault() {
		System.out.println("Default access method"+varDefault);
		
	}
	public void methodPublic() {
		System.out.println("Default access method"+varPublic);
		
	}
	private void methodPrivate() {
		System.out.println("Default access method"+varPrivate);
	}
	protected void methodProtected() {
		System.out.println("Default access method"+varProtected);
	}
}
