package com.loops;

import java.util.Scanner;

public class PerfectNumber {

	static boolean isPerfectNumber(int n) {
		boolean status = false;
		int sum = 0;
		for(int i=1;i<n;i++) {
			if(n%i == 0) {
				sum = sum +i;
			}
		}
		
		if(sum == n) {
			status = true;
		}
		return status;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
        int n = sc.nextInt();
        
        boolean flag = isPerfectNumber(n);
        
        if(flag) {
        	System.out.println(n + " is a perfect number");
        }else {
        	System.out.println(n + " is not a perfect number");
        }
		
	}

}
