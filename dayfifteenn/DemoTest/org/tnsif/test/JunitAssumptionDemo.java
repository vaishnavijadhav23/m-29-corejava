//on Junit assumption method
package org.tnsif.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class JunitAssumptionDemo {
	

	@Test
	void test() {
		Assumptions.assumeFalse(12==3);
	}
	
	@Test
	void display() {
		Assumptions.assumeTrue(12==12);
	}

}
