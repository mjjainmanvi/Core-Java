package com.edu.hughesexercise;

/*
 * Program to find duplicate numbers in an array if it contains multiple duplicates?
 */

/**
 * @author user
 *
 */
import java.util.HashMap;
import java.util.Map;
public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 2,2,2, 3, 4, 4, 5, 5, 6, 7, 7, 8, 8, 8, 9};

        Map<Integer, Integer> numberCount = new HashMap<>();

        // Count the occurrences of each number
        for (int num : numbers) {
            if (numberCount.containsKey(num)) {
                numberCount.put(num, numberCount.get(num) + 1);
            } else {
                numberCount.put(num, 1);
            }
        }

        // Print duplicates
        System.out.println("Duplicate numbers:");
        for (Map.Entry<Integer, Integer> entry : numberCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }

	}

}
