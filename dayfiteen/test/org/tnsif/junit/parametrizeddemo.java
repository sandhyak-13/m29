package org.tnsif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class parametrizeddemo {

	@ParameterizedTest
	@ValueSource(strings= {"sandhya","khamgal","sak"})
	void test() {
		System.out.println("paramertized ");
	}
	
	@ParameterizedTest
	@ValueSource(strings= {"sandhya","khamgal"})
	void accept(String str) {
		assertNotNull(str);
	}

}
