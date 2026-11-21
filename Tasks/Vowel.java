package com.task;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a Character");
		char chr =sc.next().charAt(0);
		
		chr = Character.toLowerCase(chr);
		
		if(chr == 'a'|| chr == 'e'|| chr == 'i'|| chr == 'o'|| chr == 'u') {
			System.out.println(chr + " is a vowel");
		}else if((chr >=a && chr <= z)){
			System.out.println(chr + " is a consonant");
		}else {
			System.out.println(chr + "is not a vowel or consonant");
		}
		
	}

}
