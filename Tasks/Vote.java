package com.task;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number");
		int age = sc.nextInt();
		
		if(age >= 18) {
			System.out.println("you are "+ age +" eligible to vote");
		}else {
			System.out.println("you are not "+ age +" eligible to vote");
		}
		
	}

}
