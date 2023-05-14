package com.JavaCodingPractices;

public class SwapNumber {
// Without 3rd variable 
	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		System.out.println("Before Swap  a value is ::" + a);
		System.out.println("Before Swap  b value is ::" + b);
		System.out.println("===============================");
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swap  a value is ::" + a);
		System.out.println("After Swap  b value is ::" + b);
	}
}
