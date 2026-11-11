package com.introduction1;

class TestProgram {

    // Static block
    static {
        staticMethod1();
        staticMethod2();
        
        TestProgram t1 = new TestProgram();
        t1.instanceMethod1();
        t1.instanceMethod2();
    }

   
    // First static method
    static void staticMethod1() {
        System.out.println("Static Method 1");
    }

    // Second static method
    static void staticMethod2() {
        System.out.println("Static Method 2");
    }

    // First instance method
    void instanceMethod1() {
        System.out.println("Instance Method 1");
    }

    // Second instance method
    void instanceMethod2() {
        System.out.println("Instance Method 2");
    }

    public static void main(String[] args) {

    }
}


//public class TestProgram {
//
//	static void method1() {
//		System.out.println("method 1 called");
//	}
//	
//	static void method2() {
//		System.out.println("method 2 called");
//	}
//	
//	 void method3() {
//		System.out.println("method 3 called");
//	}
//	
//	 void method4() {
//		System.out.println("method 4 called");
//	}
//	
//
//	 static {
//		 method1();
//		 method2();
//		 
//		 TestProgram t1 = new TestProgram();
//		 
//		 t1.method3();
//		 t1.method4();
//	 }
//	
//	public static void main(String[] args) {
//	 
//     
//	}
//
//}
//


//package com.introduction;
//
//public class TestProgram {
//    TestProgram ref;
//	
//	public static void main(String[] args) {
	 
//		TestProgram a = new TestProgram();
//		TestProgram b = new TestProgram();
//		TestProgram c = new TestProgram();
//		a = b;
//		b = c;
		
		
//		TestProgram a = new TestProgram();
//		TestProgram b = a;
//		TestProgram c = b;
//		a = null;
//		b = null;
		
		
//		TestProgram a = new TestProgram();
//		TestProgram b = new TestProgram();
//		TestProgram c = a;
//		a = b;
//		b = null;
		
		
//		TestProgram a = new TestProgram();
//		TestProgram b = new TestProgram();
//		TestProgram c = new TestProgram();
//        a = b;
//        b = c;
//        c = null;
		
		
//		TestProgram a = new TestProgram();
//		TestProgram b = new TestProgram();
//		TestProgram c = new TestProgram();
//		a.ref = b;
//		b.ref = c;
//		c.ref = a;
//		b = null;
//	}
//
//}



























