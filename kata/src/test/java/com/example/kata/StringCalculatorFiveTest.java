package com.example.kata;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorFiveTest {

	@Test 
	public void testThousandLimit () {
		Assertions.assertTrue(StringCalculatorFive.addNumbers("1000,2") == 2);
	}

}
