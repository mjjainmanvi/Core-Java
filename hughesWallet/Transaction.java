package com.edu.hughesWallet;

public class Transaction extends Loan {
	private double amount; // Current transaction amount

	// Constructor to initialize the transaction with provided details

	public Transaction(Account account) {

		super(account, "", "", 0);
		// Call the constructor of the superclass (Loan)

	}

	public void depositAmount(double amount) {
		super.deposit(amount);

	}

	public void withdrawAmount(double amount) {
		super.withdraw(amount);

	}

	public void payLoan(double payment, String loanType, double loanAmount) {
		if (payment > 0 && payment <= loanAmount) {
			loanAmount -= payment;
			amount -= payment;
			System.out.println("Loan Payment: " + payment);
		} else {
			System.out.println("Invalid payment amount.");
		}
	}

	// Method to show account details
	public void showAccountDetails() {
		super.showDetails();
	}

}
