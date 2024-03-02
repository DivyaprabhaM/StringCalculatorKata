package com.example.kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorTwoTest {
	
	@Test
	public void testSimpleAdd () {
		Assertions.assertTrue(StringCalculatorTwo.addNumbers("1,5\n5") == 11);
	}
	

}
