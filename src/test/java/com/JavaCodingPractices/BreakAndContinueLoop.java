package com.JavaCodingPractices;

import org.testng.annotations.Test;

public class BreakAndContinueLoop {
	
	// How to break a loop 
	public static void main(String[] args) {
		
		for(int i= 1;i<=10000;i++) {
			// break means this will break the loop on desire number "i ==5" and loop will not continue 
			if(i ==5) 
				break;
				System.out.println(i);
			}
			//System.out.println(i);
		}
	@Test
		public static void continueLoop() {
			for(int i= 1;i<=10;i++) {
				// Continue means skipping the desire value "i ==5" with one pass inside the condition
				if(i ==5) 
					continue;
					System.out.println(i);
				}
				//System.out.println(i);
		}
		
	}


