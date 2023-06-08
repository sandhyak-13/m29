package org.tnsif.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class firstjunittestcase {
	/*
	 * @test annoation is used to perform the testing on given method
	 */

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	@DisplayName("SimpleTesting")
	void display()
	{
		System.out.println("First junit test case");
	}
	

}
