package com.edu.MavenTest;

//i/p: vasu34k@gmail.com
//o/p: valid emailid
//
//i/p: bob34kgmail.com
//o/p:Invalid emailid

/**
 * @author user
 *
 */

public class VaidEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "manvi@gmail.com";
		if(test.indexOf("@")==-1) {
			System.out.println("IN valid");
		}
		else {
			System.out.println("valid");
		}

	}

}
