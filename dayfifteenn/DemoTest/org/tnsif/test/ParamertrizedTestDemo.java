package org.tnsif.test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class ParamertrizedTestDemo {
/* to perform parameterized test*/
	
	@ParameterizedTest
	@ValueSource(strings= {"Abhinav","Ankita","Parag"})
	void test() {
		System.out.println("Demonstration on parameterized"+ "Test");
	}
	
	@ParameterizedTest
	@ValueSource(strings= {"Ankita","Nova"})
	void accept(String str) {
		assertNotNull(str);
	
	}

}
