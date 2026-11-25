package com.arrays;

public class ArrayOfMarks {

	public static void main(String[] args) {
		int[] marks = { 90,92,97,96,98};
		System.out.println(marks);
		
		double sum = 0;
		double avg = 0;
		
//		for(int m:marks) {
//			sum = sum +m;
//		}
		
		
		for(int i=0;i<marks.length;i++) {
		  sum = sum + marks[i];
		}
//		
		avg = sum/marks.length;
		
		System.out.println("sum of marks:" + sum);
		System.out.println("average of all the marks:" + avg);

	}

}
