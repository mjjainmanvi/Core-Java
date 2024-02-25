package com.edu.hughesexercise;

import java.util.Scanner;

//i/p: 3
//o/p: +++
// 
//i/p: 4
//o/p: ++++

/**
 * @author user
 *
 */
public class PrintPlusSign {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        System.out.print("Enter Number For Printing Plus Signs : "); // user to enter a number
        int input = sc.nextInt(); // Read the user input 

        for (int i = 0; i < input; i++) { // Loop from 0 to (input - 1)
            System.out.println("+"); // Print a plus sign on each iteration
        }

        sc.close(); // Close the Scanner 
    }
}