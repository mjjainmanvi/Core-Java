package com.edu.MavenTest;

public class NoOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aksajd5676@$%^";
		 int numOfNumbers = 0;
	        int numOfAlphabets = 0;
	        int totalSize = input.length();
	        int numOfSpecialSymbols=0;
	        
//	        for (char c : input.toCharArray()) {
//	            if (Character.isDigit(c)) {
//	                numOfNumbers++;
//	            } else if (Character.isLetter(c)) {
//	                numOfAlphabets++;
//	            } else {
//	                
//	                numOfSpecialSymbols++;
//	            }
//	        }
	        System.out.println("Number of Numbers: " + numOfNumbers);
	        System.out.println("Number of Alphabets: " + numOfAlphabets);
	        System.out.println("Number of Special Characters: " + numOfSpecialSymbols);
	        System.out.println("Total Size: " + totalSize);

	}

}
