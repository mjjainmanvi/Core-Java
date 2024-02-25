package com.edu.hughesexercise;



//Support numbers up to 6 digits.
//Example:
//Input: 34567
//Output: Thirty four Thousand Five Hundred and Sixty Seven Only
//
//Input: 345
//Output: Three Hundred and Forty Five only

/**
 * @author user
 *
 */


public class NumToWords {
	
	private static final String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
	"Nine" };

private static final String[] teens = { "", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
	"Seventeen", "Eighteen", "Nineteen" };

private static final String[] tens = { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy",
	"Eighty", "Ninety" };
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =6 ; // Example input

		String result = convert(number);
		System.out.println("In words: " + result + " Only");
	}


	// method to convert a number to words.

	private static String convert(int number) {
		if(number ==0) {
			return "Zero";
		}
		if (number < 10) {
			return units[number];
		} else if (number < 20) {
			return teens[number - 10];
		} else if (number < 100) {
			return tens[number / 10] + " " + units[number % 10];
		} else if (number < 1000) {
			return units[number / 100] + " Hundred " + convert(number % 100);
		} else if (number < 100000) {
			return convert(number / 1000) + " Thousand " + convert(number % 1000);
		} else if (number < 10000000) {
			return convert(number / 100000) + " Lakh " + convert(number % 100000);
		}
		return "Number out of range";
		 

	}

}
