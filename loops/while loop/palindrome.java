package com.loops;

import java.util.Scanner;

public class palindrome {

	static int revNum(int n) {
		int sum = 0;
		int r = 0;
		while(n>0) {
			r = n%10;
			n = n/10;
			sum=sum*10+r;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		
		int rev = revNum(n);
		System.out.println("reverse number is:" + rev);
		
		if(n == rev) {
			System.out.println("given number is palindrome");
		}else {
			System.out.println("given number is not palindrome");
		}
		
	}

}
