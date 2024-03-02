package com.example.kata;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringCalculatorThree {
//In this class beginner delimiters and ';' are introduced (4)
	public static int addNumbers (String numbers) {
		
		if(numbers.length() > 0) {
			
			if(numbers.length() > 1) {
				
				if(numbers.contains("//")) {
					numbers=numbers.substring(2);
				}
				
				numbers= numbers.replaceAll("\n|;", ",");
			    String numberArray[]=numbers.split(",");
				
			    if(numberArray.length > 1) {
				Stream<String> numberStream = Arrays.stream(numberArray)
						                      .filter(x->x!="");
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
