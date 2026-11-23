package com.loops;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("which number you want to multiply:");
		int n1 = sc.nextInt();
		
		System.out.println("how many values you want to print:");
		int n2 = sc.nextInt();
		
		for(int i=1;i<=n2;i++) {
			System.out.println(n1 +" X "+ i + " = " + n1*i);
		}
	}

}
