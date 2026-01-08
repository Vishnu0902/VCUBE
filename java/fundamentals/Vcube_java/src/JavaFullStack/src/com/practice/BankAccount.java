package com.practice;

import java.util.Scanner;

class Bank{
	
	String name;
	long accountNumber;
	String password;
	static double balance;
	

	
	void deposit(double amount){
		System.out.println("Bank balance:" + balance);
		balance=balance+amount;
		System.out.println("Bank balance after deposit: " + balance);
	}
	
	void withdraw(double withdraw){
		System.out.println("Bank balance:" + balance);
		balance=balance-withdraw;
		System.out.println("Bank balance after withdraw: " + balance);
	}
	
	static void BankBalance(double BankBalance) {
		double BankBal = balance;
		System.out.println("Available Balance : " + BankBal);
		
		
	}

}


public class BankAccount {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Main method started !!");
		Bank c1 = new Bank();
		Bank.balance=1000;
		
		System.out.println("Enter customer name:");
		String n=sc.next();
		System.out.println("Customer Name is: " + n);
		
		
		System.out.println("Enter customer AccountNumber:");
		long no =sc.nextLong();
		System.out.println("Customer accountNumber is: " + no);
		
		System.out.println("Enter Deposit Amount: " );
		double damt=sc.nextDouble();
		c1.deposit(damt);
		
		System.out.println("Enter Withdrawal Amount: " );
		double wamt=sc.nextDouble();
		c1.withdraw(wamt);
		
		Bank.BankBalance(Bank.balance);
		
		System.out.println("Main method ended !!");
		sc.close();

	}

}


