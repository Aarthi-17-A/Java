package com.arrays;

public class ArrayOfNames {

	public static void main(String[] args) {
		String[] names = new String[5];
		
		names[0]="aarthi";
		names[1]="sneha";
		names[2]="lisa";
		names[3]="siya";
		names[4]="tina";
		
		//using foreach loop
//		for(String name:names) {
//			System.out.println(name);
//		}
		
		//using for loop
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
	}

}
