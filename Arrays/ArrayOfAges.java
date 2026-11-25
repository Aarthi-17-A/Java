package com.arrays;

public class ArrayOfAges {

	public static void main(String[] args) {
		int[] ages = new int[5];

		ages[0]=20;
		ages[1]=18;
		ages[2]=22;
		ages[3]=23;
		ages[4]=24;
		
		//using foreach loop
//		for(int age:ages) {
//			System.out.println(age);
//		}
		
		//using for loop
		for(int i=0;i<ages.length;i++) {
			System.out.println(ages[i]);
		}
	}

}
