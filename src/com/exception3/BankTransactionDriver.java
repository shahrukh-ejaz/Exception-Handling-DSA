package com.exception3;

public class BankTransactionDriver {
	
	public static void main(String[] args) {
		
		int balance = 3000;
		int withdrawal = 3000;
		
		try {
			
			System.out.println("Transaction started");
			
			if (withdrawal > balance) {
                throw new ArithmeticException("Insufficient Balance");
            }

            balance = balance - withdrawal;

            System.out.println("Transaction Successful");

        } catch (ArithmeticException e) {

            System.out.println("Transaction Failed: " + e.getMessage());

		}finally {
			System.out.println("Transaction process completed ");
			System.out.println("Thank you for banking with us");
		}
	}

}
