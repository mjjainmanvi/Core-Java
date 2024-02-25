package com.edu.hughesWallet;



public class Loan extends Account {
	 private String loanId; 
	 private String loanType; 
	    private double loanAmount; 

	    
//	    constructor
	    public Loan(Account account, String loanId, String loanType, double loanAmount) {
	    	
	        super(account.getAccountId(), account.getAccountName(), account.getAddress(), account.getDepositAmount()); // Call the constructor of the superclass (Account)
	        this.loanId = loanId;
	        this.loanType = loanType;
	        this.loanAmount = loanAmount;
	    }

	 
	    public String getLoanId() {
	        return loanId;
	    }

	    public String getLoanType() {
	        return loanType;
	    }

	    public double getLoanAmount() {
	        return loanAmount;
	    }

	    
	    public void getLoanDetails() {
	        System.out.println("Loan ID: " + loanId);
	        System.out.println("Loan Type: " + loanType);
	        System.out.println("Loan Amount: " + loanAmount);
	    }
}
