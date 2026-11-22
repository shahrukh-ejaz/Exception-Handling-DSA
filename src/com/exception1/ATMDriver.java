package com.exception1;


public class ATMDriver {
	
	public static void main(String[] args) {
		
	
	
	int balance = 5000;
	int withdrawal = 6000;
	
	try {
		
		if(withdrawal > balance) {
			
			throw new ArithmeticException("Insufficient Balance");
		}
		
		balance = balance - withdrawal;
		System.out.println("Withdrawal Succesfull");
		System.out.println("Remaining Balance: "+ balance);
		
	}catch(ArithmeticException e) {
	
		System.out.println("Transaction Failed: "+ e.getMessage());
		
		
	}

	System.out.println("Thank you for using ATM");
	
	}
	}