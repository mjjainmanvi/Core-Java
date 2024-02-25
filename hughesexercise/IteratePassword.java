package com.edu.hughesexercise;

/*
Ques- Given a password"aksajd5676@$%^"
Then display:
No of Numbers:
No of Alphabets:
Total Size:
 */





/**
 * @author user
 *
 */
public class IteratePassword {

	//Main Method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String password = "aksajd5676@$%^"; // Input password
		int digitCount = 0; // Count of digits
		int letterCount = 0; // Count of alphabets
		int totalSize = password.length(); // Total size of password

		// Iterate through each character in the password
		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			
			if (Character.isDigit(c)) {
				digitCount++;
			}
			
			else if (Character.isLetter(c)) {
				letterCount++;
			}
		}

		
		System.out.println("No of Numbers: " + digitCount);
		System.out.println("No of Alphabets: " + letterCount);
		System.out.println("Total Size: " + totalSize);

	}

}
