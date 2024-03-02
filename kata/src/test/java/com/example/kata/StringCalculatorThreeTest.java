package com.example.kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorThreeTest {

	@Test
	public void testBeginingDelimiters () {
		Assertions.assertTrue(StringCalculatorThree.addNumbers("//;\n1;2") == 3);
	}
	
	@Test
	public void testUsualDelimiters () {
		Assertions.assertTrue(StringCalculatorThree.addNumbers("//;\n1;2,5,7") == 15);
	}
	
}
