package com.logicalstatements;

import java.util.Scanner;

public class TestDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a day :");
		String day = sc.next();
		
		switch(day) {
		case "mon" -> System.out.println("monday is very lazy day");
		case "tue","wed","thu" -> System.out.println("normal week day");
		case "sat","sun" -> System.out.println("joyful day");
		default -> System.out.println("Entered day is not valid");
		}
		System.out.println("main method ended");
	}

}
