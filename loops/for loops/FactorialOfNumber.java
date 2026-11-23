package com.loops;

import java.util.Scanner;

public class FactorialOfNumber {

	static int fact(int n) {
	 int fact = 1;
	 for(int i = n;i>=1;i--) {
		 fact = fact * i;
	 }
	 return fact;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number");
		int n = sc.nextInt();
		
		int f = fact(n);
		
        System.out.println(f);
	}

}
