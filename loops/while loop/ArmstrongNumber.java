package com.loops;

import java.util.Scanner;

public class ArmstrongNumber {
	
	static int armstrongNum(int n) {
		int r = 0;
		int count = 0;
		int n1 =n;
		int sump = 0;
		
		while(n>0) {
			n= n/10;
			count++;
		}
		
		while(n1>0) {
			r = n1%10;
			n1 = n1/10;
			sump =(int) (sump + Math.pow(r,count));
		}
		return sump;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		
		int result = armstrongNum(n);
		
		if(result == n) {
			System.out.println(n + " is an Armstrong Number");
		}else {
			System.out.println(n + " is not an Armstrong number");
		}

	}

}
