package com.arrays;

public class ArrayIntroduction {

	public static void main(String[] args) {
		//declaration
		int[] arr;
		
		//creation
		arr = new int[5];
		
		//initialization
		arr[0] = 10;
		arr[1] = 11;
		arr[2] = 12;
		arr[3] = 13;
		arr[4] = 14;
		
		//representation
		//using foreach loop
//		for(int ar:arr) {
//			System.out.println(ar);
//		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

}

