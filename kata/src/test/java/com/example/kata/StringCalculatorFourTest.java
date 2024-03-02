package com.example.kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorFourTest {
	
	@Test
	public void exceptionTesting() {
	    Exception exception = Assertions.assertThrows(RuntimeException.class, () ->
	                          StringCalculatorFour.addNumbers("-1,2"));
	    Assertions.assertEquals("Negative numbers are not allowed -1",
	    		exception.getMessage());
	}

}
