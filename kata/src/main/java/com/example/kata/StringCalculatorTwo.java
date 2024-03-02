package com.example.kata;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringCalculatorTwo {
//In here condition of new line in is added	(3)
	public static int addNumbers (String numbers) {
		
		if(numbers.length() > 0) {
			
			if(numbers.length() > 1) {
				numbers= numbers.replaceAll(System.lineSeparator(), ",");
				String numberArray[]=numbers.split(",");
				
				if(numberArray.length > 1) {
				    Stream<String> numberStream = Arrays.stream(numberArray);
				    int sum = numberStream.mapToInt(Integer :: parseInt)
				          .sum();
				   return sum;
				}
               } else  {
				return Integer.parseInt(numbers, 10);
			}
		} 
		return 0;
	}
}
