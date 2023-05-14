package com.JavaCodingPractices;

public class FindOutPalindromeNumber {
// How to find out the palindrome number
	// Ans: If any value after reverse the meaning of the value remain same value
	// that is palindrome.
	public static void main(String[] args) {
// First of all I initialize the value with help of string variable
// Then with help of String variable I can call length method
		// Store into one int variable
		// Then create the loop to decrement the value
		// after that with help of string variable to call charAt method & passing loop
		// variable as argument
		// Then Store into one string variable
		// with help of variable i can get the data if there is any present palindrome
		// value

		String palindrome = "MOM"; // DAD, MADAM, RADAR, LOL, 454,111,222
		String reversepalindrome = "";
		int strlength = palindrome.length();
		for (int i = (strlength - 1); i >= 0; --i) {
			reversepalindrome = reversepalindrome + palindrome.charAt(i);
		}
		 System.out.println("reversepalindrome ::"+reversepalindrome);
//		if (palindrome.equalsIgnoreCase(reversepalindrome)) {
//			System.out.println("This is a Palindrome ");
//		} else
//			System.out.println("This is not a Palindrome");
	}

}
