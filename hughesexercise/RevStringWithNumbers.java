package com.edu.hughesexercise;

//Question- i/p: a b c d e f
//o/p: f1 e2 d3 c4 b5 a6

/**
 * @author user
 *
 */
public class RevStringWithNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Defining input string
		String input = "a b c d e f";
		//Defining an array and splitting with space as delimiter
		String[] chars = input.split(" ");

		//Creating output object to store values
		StringBuilder output = new StringBuilder();

		 for (int i = chars.length - 1; i >= 0; i--) {
			
	            output.append(chars[i]).append(chars.length - i).append(" ");
	        }

	        System.out.println(output.toString().trim());

	}

}
