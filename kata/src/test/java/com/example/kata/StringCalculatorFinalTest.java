package com.example.kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorFinalTest {
	
	@Test
	public void testEmpty () {
		//For point 1
		Assertions.assertTrue(StringCalculatorSix.addNumbers("") == 0);
	}
	
	@Test
	public void testSingleElement () {
		//For point 1
		Assertions.assertTrue(StringCalculatorSix.addNumbers("1") == 1);
	}
	
	@Test
	public void testSimpleAdd () {
		//For point 1
		Assertions.assertTrue(StringCalculatorSix.addNumbers("1,2,3") == 6);
	}
	
	@Test
	public void testUnknownNumbers () {
		//For point 2
		Assertions.assertTrue(StringCalculatorSix.addNumbers("100,200,3,4,1") == 308);
	}
	 
	@Test
	public void testSimpleAddWithNewLine () {
		//For point 3
		Assertions.assertTrue(StringCalculatorSix.addNumbers("1,5\n5") == 11);
	}
	
	@Test
	public void testBeginingDelimiters () {
		//For point 4
		Assertions.assertTrue(StringCalculatorSix.addNumbers("//;\n1;2") == 3);
	}
	
	@Test
	public void testUsualDelimiters () {
		//For point 4
		Assertions.assertTrue(StringCalculatorSix.addNumbers("//;\n1;2,5,7") == 15);
	}
	
	@Test
	public void exceptionTesting() {
		//For point 5
	    Exception exception = Assertions.assertThrows(RuntimeException.class, () ->
	    StringCalculatorSix.addNumbers("-1,2"));
	    Assertions.assertEquals("Negative numbers are not allowed -1",
	    		exception.getMessage());
	}
	
	@Test 
	public void testThousandLimit () {
		//For point 6
		Assertions.assertTrue(StringCalculatorSix.addNumbers("1000,2") == 2);
	}
	
	@Test 
	public void testDelimitersMultipleLength () {
		//For point 7
		Assertions.assertTrue(StringCalculatorSix.addNumbers("//[|||]\n1|||2|||3") == 6);
	}
	
	@Test 
	public void testMultipleDelimiters () {
		//For point 8 and 9
		Assertions.assertTrue(StringCalculatorSix.addNumbers("//[|][%]\n1|2%3") == 6);
	}
}
