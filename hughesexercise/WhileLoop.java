package com.edu.hughesexercise;


//Display table of 5 using while loop
/**
 * @author user
 *
 */

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 5;
		int i = 1;

		//Using While Loop to avoid duplication
		while (i <= 10) {
			
			System.out.println(number + " * " + i + " = " + (number* i));
			
			//increment i by 1 each time value is printed
			i++;
		}
	}

}
