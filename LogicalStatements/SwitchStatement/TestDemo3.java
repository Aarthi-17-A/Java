package com.logicalstatements;

import java.util.Scanner;

public class TestDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		
		String yn = "";
		do {
			
			System.out.println("enter a number");
			int a = sc.nextInt();
			
			System.out.println("enter b number");
			int b = sc.nextInt();
			
			int result = 0;
			
			System.out.println("enter a symbol like : +,-,*,/,%");
			String symb = sc.next();
			
			switch(symb) {
			case "+" -> {
				System.out.println("addition is");
				result = a + b;		
			}
			case "-" -> {
				System.out.println("substraction is");
				result = a - b;		
			}
			case "*" -> {
				System.out.println("multiplication is");
				result = a * b;		
			}
			case "/" -> {
				System.out.println("division is");
				result = a / b;		
			}
			case "%" -> {
				System.out.println("modulus is");
				result = a % b;		
			}
			default -> System.out.println("invalid symbol");
			}
			
			System.out.println("result is :" + result);
			
		
			System.out.println("to continue again enter y for yes and n for no");
			yn = sc.next();
		}while(yn.equalsIgnoreCase("y"));	
		
		
		System.out.println("main method ended");
	}

}
