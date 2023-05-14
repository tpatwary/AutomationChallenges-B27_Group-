package com.JavaCodingPractices;

// How To Remove Special Character FRom String & reverse only Character
public class HowToRemoveSpecialCharacterFRomString {

	public static void main(String[] args) {
		String str = "I/o:8%$#7d$098g&()_+h%l@"; // Iodghl <reverse>lhgdoi

		str = str.replaceAll("[^A-Za-z]", ""); // ^ Excluded
		System.out.println("After remove Special Character ::" + str);
		char[] revstr = str.toCharArray();
		for (int i = (revstr.length) - 1; i >= 0; i--) {
			 System.out.print( revstr[i]);
		}

	}
}
