package com.introduction1;

public class StaticInstanceBlock {
	
	
	
	static {
		System.out.println("static block called1");
		
		
	}
	
    {
		System.out.println("instance block called");
		
		
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("main method started");
		
		StaticInstanceBlock Ib = new StaticInstanceBlock();
		
		System.out.println("main method ended");
		
	}
	
	static {
		System.out.println("static block called2");
	}
	
}
