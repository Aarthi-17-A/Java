package com.logicalstatements;

import java.util.Scanner;

public class TestDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a jersy no :");
		int jno = sc.nextInt();
		
		switch(jno) {
		case 7: 
			System.out.println("mahendra singh dhoni");
			System.out.println("cool batsman");
			System.out.println("Thala for a reason");
			break;
		case 18:
			System.out.println("Virat");
			System.out.println("aggresive batsman");
			System.out.println("Goat");
			break;
		case 45:
			System.out.println("Rohit");
			System.out.println("hit batsman");
			System.out.println("Hitman");	
			break;
		default:
			System.out.println("Entered number is invalid");
		}
		System.out.println("main method ended");
	}

}
