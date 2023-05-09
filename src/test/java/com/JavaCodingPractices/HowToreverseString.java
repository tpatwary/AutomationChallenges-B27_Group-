package com.JavaCodingPractices;

import java.util.Arrays;
import java.util.Collections;

import org.testng.annotations.Test;

public class HowToreverseString {
	// 1st method How to reverse string without using inbuilt method?
	//@Test
	public static void reverseString() {
		String value = "Infosys";
		char[] store = value.toCharArray();

		for (int i = (store.length) - 1; i >= 0; i--) {
			System.out.println(store[i]);
		}

	}

//2nd method How to reverse string with using inbuilt method (with help of Collections java utility class)?

	@Test
	public static void reverseStringWithMethod() {

		Integer num[] = { 1, 2, 3, 4, 6, 7, 8, 10, 20, 30, 50 };
		// Collections is java utility class
		Collections.reverse(Arrays.asList(num));
		System.out.println(Arrays.toString(num));
	}
}
