package com.exception2;

public class CalculatorDriver {
	
	public static void main(String[] args) {
		
		int[] numbers = {100, 200, 300};
		
		int index = 2;
		int divisor = 0;
		
		try {
			
			int number = numbers[index];
			int result = number / divisor;
			
			System.out.println("Result: "+ result);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Invalid array index");
			
		}
		
		catch(ArithmeticException e) {
			System.out.println("Error:   cannot divisible by zero");
		}
		
		System.out.println("Calculator execution completed");
		
	}

}
