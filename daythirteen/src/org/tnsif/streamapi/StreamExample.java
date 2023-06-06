//Program to demonstrate on Stream
package org.tnsif.streamapi;

import java.util.stream.Stream;

public class StreamExample {
	
	public static void main(String[] args) {
		Stream<Integer>s1 = Stream.of(11,12, 13,14,606);
		s1.forEach((i)->System.out.print(i+" "));
		System.out.println();
	

	Stream<Integer>s2 = Stream.of(23, 11, 14,15);
	s2.forEach((i)->System.out.print(i+" "));
	}

}
