package com.JavaCodingPractices;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {
	// Q How to remove duplicate from Array(object)?
	// Q How to find out the unique value from Array list (Class)/ collection
	// framework ?

	public static void removeDuplicateFromArray() {
		// Initialize the value with array
		int number[] = { 1, 2, 3, 4, 56, 55, 2 };

		// for loop(Nested loop)
		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				// java condition ( If matching
				if (number[i] == number[j]) {
					System.out.println("Duplicate value::" + number[i]);
				}

			}

		}

	}

	// 2nd method (removeDuplicateFromArrayList)
	public static void removeDuplicateFromArrayList() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5);

		List<Integer> duplicatevalue = numbers.stream().distinct().collect(Collectors.toList());

		System.out.println("Duplicate value" + duplicatevalue);

	}
	// 3rd method (findOutDuplicateFromString)
	// How to find out duplicate with help of set interface
	// set handle unique value
	public static void findOutDuplicateFromString() {

		String name[] = { "Java", "Python", "SQL", "Maven", "Java" };

		Set<String> value = new HashSet<String>();
		for (String newValue : name) {
			if (value.add(newValue) == false) {
				System.out.println("Duplicate value::" + newValue);
			}

		}
	}

	public static void main(String[] args) {
		// RemoveDuplicate.removeDuplicateFromArray();
		//RemoveDuplicate.removeDuplicateFromArrayList();
		RemoveDuplicate.findOutDuplicateFromString();

	}

}
