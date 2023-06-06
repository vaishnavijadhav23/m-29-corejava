//Program to demonstrate on the filtering
package org.tnsif.streamapi;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		List<String>obj = Arrays.asList("ankita","Prakash","tanaya","Prakash");
		obj.stream().filter((i->i.length()>6)).forEach((i)->System.out.print(i+" "));

		System.out.println();
		
		obj.stream().distinct().forEach((i)->
		System.out.println(i+" "));
		
		System.out.println();
		obj.stream().limit(3).forEach((i)->
		System.out.println(i+" "));
		System.out.println();
		
		obj.stream().skip(2).forEach((i)->
		System.out.println(i+" "));
	}

}
