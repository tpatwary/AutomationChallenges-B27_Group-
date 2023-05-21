package com.JavaCodingPractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class HowToMergeTwoArray {
	
	// How to merge two Array
	// Note: First we are declare  two array
	// Then we are creating third loop to pass the argument of first loop length & 2nd loop length
	// Then finally we call System.arraycopy method 
	//ex: System.arraycopy(num, 0, result, 0, num.length);
	//System.arraycopy(num2, 0, result, num.length, num2.length);
	// And pass some argument then this System.arraycopy method will merge the data into one array
	
	public static void main(String[] args) {
		
		
		int num [] = {1,20,40,56};
		int num2 [] = {10,200,400,506};
		
		int result [] = new int[num.length + num2.length];
		
		System.arraycopy(num, 0, result, 0, num.length);
		System.arraycopy(num2, 0, result, num.length, num2.length);
		
		System.out.println(Arrays.toString(result));
		
	}
	@Test
	public static void getMergeTwoArray() {
		// Note: First we are declare  two array
		// Then I am creating one Array-list object & pass argument as 1st array object
		// Then with help of Array-list object I can call addAll method
		// & 2nd array list object argument 
		// Then with help of array list object calling two array method 
		// And store into object array
		// With help of array object I can merge the values
		
		String name [] = {"A","B","C","D","E","F"};
		String name2 [] = {"G","H","I","J","K","L"};
		
		ArrayList <String> list = new ArrayList <>(Arrays.asList(name));
		list.addAll(Arrays.asList(name2));
		Object [] merge= list.toArray();
		
		System.out.println(Arrays.toString(merge));
		
		
		
	}
	
	

}

//merge two array into one >>> {1,20,40,56,10,200,400,506}
