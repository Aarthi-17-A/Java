package com.introduction1;
    public class Bank {
    //declaration
	static int bankId;
	static String   bankName;
	
	int customerAccountNumber;
	String customerName;
	String branchName;
	
	public static void main(String[] args) {
    System.out.println("Customer details");	
    
    //initialization
    
    bankId = 1001;
    bankName = "Indian Bank";
   
    
    Bank p1 = new Bank();
    
    
    p1.customerAccountNumber = 1200000089;
    p1.customerName = "hema";
	p1.branchName = "secunderabad";
	
    Bank p2 = new Bank();
    
    
    p2.customerAccountNumber = 1700000045;
    p2.customerName = "priya";
	p2.branchName = "Begumpet";
    // accessing the data
    
	System.out.println("OBJECT 1 ---------------------------------------");
	System.out.println("bankId: " + bankId);
	System.out.println("bankNAme: " + bankName);
	System.out.println("customerAccountNumber: " + p1.customerAccountNumber);
	System.out.println("customerName: " + p1.customerName);
	System.out.println("branchName: " + p1.branchName);
    
	
	System.out.println("OBJECT 2 ---------------------------------------");
	System.out.println("bankId: " + bankId);
	System.out.println("bankNAme: " + bankName);
	System.out.println("customerAccountNumber: " + p2.customerAccountNumber);
	System.out.println("customerName: " + p2.customerName);
	System.out.println("branchName: " + p2.branchName);
     
	}

}
