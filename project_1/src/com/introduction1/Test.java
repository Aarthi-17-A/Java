package com.introduction1;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		 System.out.println("main method started");
		 
		 System.out.println(Class.forName("java.lang.String"));
		 System.out.println(Class.forName("java.lang.System"));
		 
		 System.out.println(Class.forName("com.introduction.Student"));
		 System.out.println(Class.forName("com.introduction.Test"));
		 
		 System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));
		 
		 
		 System.out.println("main method ended");
	}

}
 