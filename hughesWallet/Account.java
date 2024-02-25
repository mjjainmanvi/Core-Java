package com.edu.hughesWallet;

public class Account {
	private String accountId;
	private String accountName;
	private String address;
	private double depositAmount;

	public Account(String accountId, String accountName, String address, double depositAmount) {

		this.accountId = accountId;
		this.accountName = accountName;
		this.address = address;
		this.depositAmount = depositAmount;
	}

	// Getter and setter methods

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}

//	deposit method
	public void deposit(double amount) {
		this.depositAmount += amount;
		System.out.println("Amount Deposited:" + amount);
	}

// withdraw method
	public void withdraw(double amount) {
		if (amount <= depositAmount) {
			this.depositAmount -= amount;
			System.out.println("Amount Withdraw:" + amount);
		} else {
			System.out.println("Insufficient balance.");
		}
	}

	public void showDetails() {
		System.out.println("Account ID: " + accountId);
		System.out.println("Account Name: " + accountName);
		System.out.println("Address: " + address);
		System.out.println("Deposit Amount: " + depositAmount);
	}

	// Method to get account details as a string
	public String getDetails() {
		return "Account ID: " + accountId + "\nAccount Name: " + accountName + "\nAddress: " + address
				+ "Deposit Amount: " + depositAmount;
}

}
