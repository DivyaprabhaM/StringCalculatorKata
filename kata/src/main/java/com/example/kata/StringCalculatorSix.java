package com.example.kata;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringCalculatorSix {
//In this class points 7,8 and 9 are considered multiple delimiters
	public static int addNumbers (String numbers) {
		
		if(numbers.length() > 0) {
			
			if(numbers.length() > 1) {
				
				if(numbers.contains("//")) {
					numbers=numbers.substring(2);
				}
				
				numbers= numbers.replaceAll("\n|;|\\[|\\]|%|\\|", ",");
			    String numberArray[]=numbers.split(",");
				
			    if(numberArray.length > 1) {
				    Stream<String> numberStream = Arrays.stream(numberArray)
						                          .filter(x->x!="");
				    Stream<String> numberStreamTwo = Arrays.stream(numberArray)
						                            .filter(x->x!="");
				
				    StringBuilder negativeNumbers=new StringBuilder();
				    numberStream.mapToInt(Integer :: parseInt)
			       .filter(x->x<0)
				   .forEach(x->negativeNumbers.append(x).append(","));
				  
				    if(negativeNumbers.length() > 0) {
					   negativeNumbers.deleteCharAt(negativeNumbers.length()-1);
					   throw new RuntimeException("Negative numbers are not allowed "
					  + negativeNumbers.toString());
				 }
				
				    int sum = numberStreamTwo.mapToInt(Integer :: parseInt)
						  .filter(x->x<1000)
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
