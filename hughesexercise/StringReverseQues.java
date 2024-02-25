package com.edu.hughesexercise;

/*
 Question-Write a java program for below requirement.
i/p:Hyderabad
o/p:dabaredyH
 */
//reverse string
/**
 * @author user
 *
 */
public class StringReverseQues{// main method
	public static void main(String[] args) {
		String input = "Hyderabad";
		// converting to StringBuilder
		StringBuilder reversed = new StringBuilder(input);
		// method to reverse the string given using predefined method of string
		// builder.
		reversed.reverse();
		System.out.println(reversed);

	}

}
