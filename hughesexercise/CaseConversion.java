package com.edu.hughesexercise;


// to change the case of every letter
/**
 * @author user
 *
 */
public class CaseConversion {
    // Main Method
    public static void main(String[] args) {
        String originalString = "Java Fullstack"; // Input string
        String modifiedString = ""; // Output string

        // Iterate through each character in the input string
        for (int i = 0; i < originalString.length(); i++) {
            char c = originalString.charAt(i);

            
            // Use ASCII values for case conversion
            if (c >= 'A' && c <= 'Z') {
               
                modifiedString += (char) (c + 32);
            } else if (c >= 'a' && c <= 'z') {
                
                modifiedString += (char) (c - 32);
            } else {
                
                modifiedString += c;
            }
        }

        System.out.println(modifiedString); 
    }
}

