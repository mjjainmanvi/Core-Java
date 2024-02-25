package com.edu.hughesWallet;



public class App {
	public static void main(String[] args) {

		Account[] accounts = new Account[10];

//        data
		accounts[0] = new Account("1234567-ASDF", "Manvi", "Jaipur", 1000.0);
		accounts[1] = new Account("2345678-QWER", "Joey", "gurgaon", 2000.0);

		Transaction transaction = new Transaction(accounts[0]);

		transaction.showAccountDetails();

		// Perform transactions
		transaction.withdrawAmount(200.0); // Withdraw 200 from the account
//    transaction.payLoan(100.0); // Pay a loan installment of 100.0

		// Show account details
		transaction.showAccountDetails(); // Display the updated account details after transactions
		
		// Create a loan for the second account
        Loan loan = new Loan(accounts[1],"L-1" ,"home", 1000.0);

        // Perform a loan transaction on the second account
        Transaction loanTransaction = new Transaction(accounts[1]);
        loanTransaction.payLoan(300.0, "home", 1000.0);

        // Display account details after transactions
        accounts[1].showDetails();
    }
}
