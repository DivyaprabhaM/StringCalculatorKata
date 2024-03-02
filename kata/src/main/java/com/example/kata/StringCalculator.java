package com.example.kata;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringCalculator {
//In this class simple add with ',' as delimiter is done(1,2) 
	public static int addNumbers (String numbers) {
		
		if(numbers.length() > 0) {
		  String numberArray[]=numbers.split(",");
		
		if(numberArray.length > 1) {
		   Stream<String> numberStream = Arrays.stream(numberArray);
		   int sum = numberStream.mapToInt(Integer :: parseInt)
		          .sum();
		   return sum;
		} else {
			return Integer.parseInt(numberArray[0], 10);
		}
	  }
		return 0;
	}
}
