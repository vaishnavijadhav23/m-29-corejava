package org.tnsif.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)
class JunitAnnotationDemo {

	@Test
	void test() {
		System.out.println("First Junit5 Test case");
	}
	//@Test
	/*Denotes that the annotated method should be 
	 executed before all test methods*/
	@BeforeAll
	void print()
	{
		System.out.println("Performing BeforeAll annoatation");
	}
	
	@Test
	/*Denotes that the annotated method should be
	  executed after each test method*/
	@AfterEach
	@Disabled
	void accept()
	{
		System.out.println("AfterEach method is executing...");
	}

}
