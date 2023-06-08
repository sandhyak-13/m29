//
package org.tnsif.junit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
//@TestInstance(Lifecycle.PER_CLASS)
class junitAnnonationDemo {

	@Test
	@DisplayName("SimpleTesting")
	void display()
	{
		System.out.println("First junit test case");
	}
	@Test
	@BeforeAll
	//below annotation method should be executer before all before 
	 static void print()
	{
		System.out.println("performing before befor all");
	}
	@Test
	@AfterEach
	
	void accept()
	{
		System.out.println("after each ");
	}
}
