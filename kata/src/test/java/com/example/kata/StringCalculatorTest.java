package com.example.kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
	
    @Test
	public void testEmpty () {
		Assertions.assertTrue(StringCalculator.addNumbers("") == 0);
	}
	
	@Test
	public void testSingleElement () {
		Assertions.assertTrue(StringCalculator.addNumbers("1") == 1);
	}
	
	@Test
	public void testSimpleAdd () {
		Assertions.assertTrue(StringCalculator.addNumbers("1,2,3") == 6);
	}
	
	@Test
	public void testUnknownNumbers () {
		Assertions.assertTrue(StringCalculator.addNumbers("100,200,3,4,1") == 308);
	}
	 
}
