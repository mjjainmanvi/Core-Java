package com.edu.hughesexercise;
import java.util.Arrays;
import java.util.Collections;

//Display 'a','b','c','d' in reverse order using Arrays.


/**
 * @author user
 *
 */
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character [] arr = {'a','b','c','d'};
		Collections.reverse(Arrays.asList(arr)); 
        System.out.println(Arrays.asList(arr));

	}

}
