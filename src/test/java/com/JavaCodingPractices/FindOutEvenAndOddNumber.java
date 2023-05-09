package com.JavaCodingPractices;

public class FindOutEvenAndOddNumber {
	// How to find out Even And Odd Number ?
	public static void main(String[] args) {
		int num= 10;
		for(int i = 0 ;i<num;i++) {
			if(i%2 ==0) {// Mod ==> %
				System.out.println("This is even Number :: "+i);
			}
			else {
				System.out.println("This is Odd Number :: "+i);
			}
			
		}
	}
	

}
