package com.task;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		System.out.println("electricity bill");
		Scanner sc = new Scanner(System.in);
		String yn = "";
		
		do {
			
		System.out.println("enter the Customer Type");
		String customer = sc.next();
		
		System.out.println("enter the number of units consumed: ");
		int units = sc.nextInt();
		
		
		double currentBillCost = 0;
		
		switch(customer) {		
		
		case "domestic" ->{
			
			System.out.println("domestic Customer per unit 5/-");
			int domestic_cost = 5;
			
			currentBillCost = units * domestic_cost;
			
			
		}
		
		case "commercial" -> {
			
			System.out.println("commercial Customer per unit 8/-");
			int commercial_cost = 8;
		
			currentBillCost = units * commercial_cost;
				
			
		}
		
		case "industrial" -> {
		
			System.out.println("industrial Customer per unit 10/-");
			int industrial_cost = 10;
		
			currentBillCost = units * industrial_cost;
		
			
		}
		default -> System.out.println("Entered Customer Type is not valid");
		
		}
		
		
		System.out.println("Customer Type :" + customer);
		System.out.println("units consumed :" + units);
		System.out.println("total bill: " + currentBillCost);
		
		
		System.out.println("To check another customer enter y for yes and n for no");
		yn = sc.next();
		
		
		}while(yn.equalsIgnoreCase("y"));
		
		
		
	}

}
