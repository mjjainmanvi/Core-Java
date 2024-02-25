package com.edu.hughesexercise;


//add values from 239 till 699 using for loop.
//example:
//2 till 8
// 
//2+3+4+5+6+7+8=?


/**
 * @author user
 *
 */

public class AddValues {

	public static void main(String[] args) {
		
		
		int start = 239;
		int end = 699;
		int result = 0; // Initialize 

		
		
		for (int i = start; i <= end; i++) {
			result += i;
		}

		// Print the final result
		
		System.out.println("After adding values from 239 to 699 the final result is :" + result);
	}

}
