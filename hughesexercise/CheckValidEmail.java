package com.edu.hughesexercise;

//i/p: vasu34k@gmail.com
//o/p: valid email id
// 
//i/p: bob34kgmail.com
//o/p:Invalid email id
/**
 * @author user
 *
 */
public class CheckValidEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String email = "manvi@gmail.com";
		//If we don't check position
		
		 if(email.contains("@") && email.contains(".")) {
		 System.out.println("valid email");
		 }
		 else {
		 System.out.println("Not�valid");
		 }

		
	}

}
