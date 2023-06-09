package org.tnsif.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FirstJunitUnitTestCase {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	@DisplayName(value = "")
	void display() {
		System.out.println("there is display buttion");
	}
	
	

}
