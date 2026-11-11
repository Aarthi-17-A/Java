package com.introduction1;

public class Customer{

	int id;
	String name;
	
	@Override
	protected void finalize() {
		System.out.println("finalize method called");
	}
	
	void hello() {
		System.out.println("hello method called");
		Customer c1 = new Customer();
	}
	
	public static void main(String[] args) {
	 
		System.out.println("main method started");
		Customer c1 = new Customer();
//		com.introduction.Customer@1dbd16a6   ----hexadecimal value  starts from 0-9/a-f
		System.out.println(c1);  // 1dbd16a6 - memory Address of the object 
		
//		System.out.println(c1.id);
//		System.out.println(c1.name);
//		System.out.println(c1.hashCode());
		
		Customer c2 = new Customer();
     	System.out.println(c2); // 7ad041f3  - memory Address of the object 
		
		Customer c3 = new Customer();
		System.out.println(c3); //  251a69d7 - memory Address of the object 
	 
//	 Nullifying the objects 
		c1 = null;    //the allocated c1 memory will be removed by GarbageCollector from Heap 
//		c2 = null;
//		c3 = null;
		
//		re-assigning the objects 
		Customer c4 = new Customer(); //
		System.out.println(c4); //
			//storing c4 object in c2
		c2 = c4;
		System.out.println(c2);
		System.out.println(c4);
		
	
//		out of scope
		c4.hello();
		
//		Anonymous object creation
		new Customer().hello();
		
//		gc() is a static method from System class
		System.gc();  //gc() runs the garbage collector in the JVM , then garbage collector 
//		identifies unused objects and removes the memory from heap , to remove gc calls finalize() method.
		// System.gc goes to call the finalize method when the object does not have the refernce 

		System.out.println("main method ended");
//		int a = 0x1dbd16a6; 
//		System.out.println(a); // prints: 498931366   it is the hash-code value of the  object c1 
//		
	
	}

}



// this 5 types makes objects eligible for garbage

//An object becomes eligible for GC when it is no longer reachable from any active reference 
// cases of eligibility:

//1. Nullifying the objects  (Nullifying reference) 
//student s = new student();
// s = null;
//object has no reference --> eligible for GC

//2. reassigning the objects 
//student s1 = new student();
//student s2 = new student();
// s1 = s2;
// first object lost --> eligible


//3. Out of Scope 
//  void method() {
//	  Student s = new Student();
//  }
//  after method ends --> object eligible
// method inside objects    

//4.anonymous objects
//new Student();
// No reference at all --> immediately eligible 

//5.island of  Isolation 
//a group of objects referencing each other internally but not reachable from GC roots

