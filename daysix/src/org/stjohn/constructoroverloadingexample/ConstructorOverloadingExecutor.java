package org.stjohn.constructoroverloadingexample;
public class ConstructorOverloadingExecutor {

	public static void main(String[] args) {
		{
			ConstructorCOverloadingExample c1 = new ConstructorCOverloadingExample();
			ConstructorCOverloadingExample c2 = new ConstructorCOverloadingExample(12);
			ConstructorCOverloadingExample c3 = new ConstructorCOverloadingExample(12,13);
	}
	}

}
