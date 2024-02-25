package com.edu.hughesexercise;
/*
 * Write a Java program to remove duplicate elements from a given array and return the updated array length.
Sample array: [20, 20, 30, 40, 50, 50, 50]
After removing the duplicate elements the program should return 4 as the new length of the array.
 */

/**
 * @author user
 *
 */
import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 20, 20, 30, 40, 50, 50, 50, 20 };
		Arrays.sort(arr);

		int uniqueIndex = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[uniqueIndex]) {
				// If current element is different from the previous unique element,
				// update the uniqueIndex and copy the current element to the next position
				uniqueIndex++;
				arr[uniqueIndex] = arr[i];
			}
		}
		int newLength = uniqueIndex + 1;
		System.out.println("New length: " + newLength);
	}

}
