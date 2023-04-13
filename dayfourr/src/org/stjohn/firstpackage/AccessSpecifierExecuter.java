package org.stjohn.firstpackage;

public class AccessSpecifierExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b=new Base();
		b.methodDefault();
		b.methodPublic();
		b.methodProtected();
		//private members, we can't access into another class
		System.out.println(b instanceof Base);

	}

}
