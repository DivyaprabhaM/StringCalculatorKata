package com.example.kata;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorSixTest {

	@Test 
	public void testDelimitersMultipleLength () {
		Assertions.assertTrue(StringCalculatorSix.addNumbers("//[|||]\n1|||2|||3") == 6);
	}
	
	@Test 
	public void testMultipleDelimiters () {
		Assertions.assertTrue(StringCalculatorSix.addNumbers("//[|][%]\n1|2%3") == 6);
	}

}
