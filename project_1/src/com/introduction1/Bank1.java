package com.introduction1;

public class Bank1 {

	static String bankName;

	int accountNumber;
	int balance;
	String accountHolderName;
	
	void display() {

		System.out.println("Bank Name: " + bankName);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + balance);
		System.out.println("AccountHolderName: " + accountHolderName);

	}


	public static void main(String[] args) {

		bankName = "Indian Bank";

		Bank1 p1 = new Bank1();
		p1.accountNumber = 123456;
		p1.balance = 50000;
		p1.accountHolderName = "aarthi";
		

		Bank1 p2 = new Bank1();
		p2.accountNumber = 456789;
		p2.balance = 60000;
		p2.accountHolderName = "sneha";

		Bank1 p3 = new Bank1();
		p3.accountNumber = 784937;
		p3.balance = 70000;
		p3.accountHolderName = "lisa";

		p1.display();
		p2.display();
		p3.display();
	}


}
