//package com.introduction;
//
//public class Blocks {
//
//	static void method1() {
//		System.out.println("method 1 called");
//    	method2();
//	}
//	
//    static void method2() {
//    	System.out.println("method 2 called");
//    	Blocks m3 = new Blocks();
//    	m3.method3();
//	}
//    
//    void method3() {
//    	System.out.println("method 3 called");
//    	method4();
//    	
//    }
//	
//    void method4() {
//    	System.out.println("method 4 called");
//    	
//    }
//	
//	public static void main(String[] args) {
//		
//		method1();
//	}
//	
//}



package com.introduction1;

public class Blocks {
	
	static void method1() {
		System.out.println("method 1 called");
		method2();
	}
	
	static void method2() {
		System.out.println("method 2 called");
		Blocks m3 = new Blocks();
		m3.method3();
	}

	void method3() {
		System.out.println("method 3 called");
		method4();
	}
	
	void method4() {
		System.out.println("method 4 called");
	}
	
	public static void main(String[] args) {
       
     method1();
	}

}