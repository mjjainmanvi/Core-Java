package com.edu.hughesexercise;

//display Alphabets reverse order using do while.

/**
 * @author user
 *
 */
public class ReverseAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        
        //using ASCII values
        System.out.println("\n");
        int ascii = 90; // ASCII value of 'Z'
        do {
            char alphabet = (char) ascii;
            System.out.print(alphabet + " ");
            ascii--;
        } while (ascii >= 65); // ASCII value of 'A'

	}

}
