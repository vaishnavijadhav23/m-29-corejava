//driver class
package org.tnsif.creationalpatterns;
import org.tnsif.creationalpatterns.Singleton;
public class SingletonExecutor {

	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
	}

}
