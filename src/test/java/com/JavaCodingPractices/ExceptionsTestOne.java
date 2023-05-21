package com.JavaCodingPractices;

public class ExceptionsTestOne {
	
	public static void main(String[] args) {
		// ArithmeticException
		try {
			int num = 100/0;
			System.out.println(num);
		} catch (Exception e) {
			
			System.out.println("Error Message ::"+e.getMessage());
		}
		
		
	}
	

}
